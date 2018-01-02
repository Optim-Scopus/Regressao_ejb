/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb;

import com.neo.commons.NeoLogger;
import com.tcc.regressao_ejb.dao.BankHistoryDaoLocal;
import com.tcc.regressao_ejb.dao.GroceryHistoryDaoLocal;
import com.tcc.regressao_ejb.dao.RestaurantHistoryDaoLocal;
import com.tcc.regressao_ejb.entity.BankHistories;
import com.tcc.regressao_ejb.entity.GroceryHistories;
import com.tcc.regressao_ejb.entity.restaurant_histories;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import weka.core.matrix.Matrix;

/**
 *
 * @author luiz
 */
/*@Resources( {
    @Resource(name="java:/services/RegressorRemote", lookup="java:module/Regressor"),
})
@Remote(RegressorLocal.class)*/
@Stateless
public class Regressor implements RegressorLocal {
    
    private static final NeoLogger LOGGER = NeoLogger.getLogger(Regressor.class);
    
    @EJB
    private RestaurantHistoryDaoLocal restaurantDao;
    
    @EJB
    private BankHistoryDaoLocal bankDao;
    
    @EJB
    private GroceryHistoryDaoLocal groceryDao;

    @Override
    public Double[] getThetaAsVectorForBank(Long bankId) {
        List<BankHistories> bankHistory = bankDao.getByField("bank_id", bankId);
        
        int m = bankHistory.size();
        double[][] x = new double[m][5];
        double[] y = new double[m];

        int i = 0;
        for (BankHistories bank : bankHistory) {
            x[i][0] = 1;
            x[i][1] = bank.getDow();
            x[i][2] = bank.getTime_arrival();
            x[i][3] = bank.getTask();
            x[i][4] = bank.getIssue();

            y[i] = bank.getTime_arrival() + bank.getTime_exit();

            i++;
        }
        return getThetaAsVector(x, y);
    }

    @Override
    public Double[] getThetaAsVectorForGrocery(Long groceryId) {
        List<GroceryHistories> groceryHistory = groceryDao.getByField("grocery_id", groceryId);
        
        int m = groceryHistory.size();
        double[][] x = new double[m][5];
        double[] y = new double[m];

        int i = 0;
        for (GroceryHistories grocery : groceryHistory) {
            x[i][0] = 1;
            x[i][1] = grocery.getDow();
            x[i][2] = grocery.getTime_arrival();
            x[i][3] = grocery.getGroceries_size();
            x[i][4] = grocery.getIssue();

            y[i] = grocery.getTime_arrival() + grocery.getTime_exit();

            i++;
        }
        return getThetaAsVector(x, y);
    }

    @Override
    public Double[] getThetaAsVectorForRestaurant(Long restaurantId) {
        List<restaurant_histories> restaurantHistory = restaurantDao.getByField("restaurant_id", restaurantId);
        
        int m = restaurantHistory.size();
        LOGGER.info("histories: " + m);
        double[][] x = new double[m][6];
        double[] y = new double[m];

        int i = 0;
        for (restaurant_histories restaurant : restaurantHistory) {
            x[i][0] = 1;
            x[i][1] = restaurant.getDow();
            x[i][2] = restaurant.getTime_arrival();
            x[i][3] = restaurant.getGroup_size();
            x[i][4] = restaurant.getIssue();
            x[i][5] = restaurant.getSpecial_date();

            y[i] = restaurant.getTime_arrival() + restaurant.getTime_exit();

            i++;
        }
        return getThetaAsVector(x, y);

    }

    private Double[] getThetaAsVector(double[][] x_mxn, double[] y) {
        Matrix X = new Matrix(x_mxn);
        Matrix Y = new Matrix(y,y.length);
        Matrix theta = getThetaAsMatrix(X, Y);
        return toObjectDoubleArray(theta.getRowPackedCopy());
    }

    private Matrix getThetaAsMatrix(Matrix X, Matrix Y) {
        Matrix theta = X.transpose().times(X).inverse().times(X.transpose()).times(Y);
        return theta;
    }
    
    private Double[] toObjectDoubleArray (double[] primitiveArray) {
        if (primitiveArray == null) {
            return null;
        } 
        Double[] result = new Double[primitiveArray.length];
        for (int i = 0; i < primitiveArray.length; i++) {
            result[i] = primitiveArray[i];
        }
        return result;
    }
}
