/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.dao;

import com.tcc.regressao_ejb.entity.restaurant_histories;
import javax.ejb.Stateless;

/**
 *
 * @author luiz
 */
@Stateless
public class RestaurantHistoryDao extends GenericDaoImpl<restaurant_histories, Long> implements RestaurantHistoryDaoLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
