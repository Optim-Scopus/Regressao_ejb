/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb;

import com.tcc.regressao_ejb.dao.RestaurantHistoryDaoLocal;
import com.tcc.regressao_ejb.entity.restaurant_histories;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import weka.core.matrix.Matrix;

/**
 *
 * @author luiz
 */
@Stateless
public class Test implements TestLocal {

    @EJB
    private RestaurantHistoryDaoLocal restaurantDao;
    
    @Override
    public Double[] getThetaAsVectorForRestaurant(Long restaurantId) {
        Double[] d = new Double[1];
        d[1] = 1.0;
        
        List<restaurant_histories> restaurantHistory = restaurantDao.getByField("restaurant_id", restaurantId);
        
        int m = restaurantHistory.size();
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
        
        return d;
    }
    
    

    private Double[] getThetaAsVector(double[][] x_mxn, double[] y) {
        Matrix theta = getThetaAsMatrix(new Matrix(x_mxn), new Matrix(y,y.length));
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

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
