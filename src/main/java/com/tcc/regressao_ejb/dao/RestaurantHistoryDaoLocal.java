/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.dao;

import com.tcc.regressao_ejb.entity.restaurant_histories;
import javax.ejb.Local;

/**
 *
 * @author luiz
 */
@Local
public interface RestaurantHistoryDaoLocal extends GenericDao<restaurant_histories, Long> {
    
}
