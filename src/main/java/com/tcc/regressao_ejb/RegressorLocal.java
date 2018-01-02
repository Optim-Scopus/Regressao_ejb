/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author luiz
 */
@Local
public interface RegressorLocal {
    
    public Double[] getThetaAsVectorForBank(Long bankId);
    
    public Double[] getThetaAsVectorForGrocery(Long groceryId);
    
    public Double[] getThetaAsVectorForRestaurant(Long restaurantId);
}
