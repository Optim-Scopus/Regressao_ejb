/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.ws;

import com.tcc.regressao_ejb.RegressorLocal;
import com.tcc.regressao_ejb.TestLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author luiz
 */
@WebService(serviceName = "RegressorWS")
@Stateless
public class RegressorWS {

    @EJB
    private RegressorLocal regressor;
    
    /**
     * This is a sample web service operation
     * public Double[] test(@WebParam(name = "name") String txt)
     */
    @WebMethod(operationName = "test")
    public Double[] test() {
        //return regressor.getThetaAsVectorForRestaurant(1L);
        return regressor.getThetaAsVectorForRestaurant(1L);
        //return null;
    }
}
