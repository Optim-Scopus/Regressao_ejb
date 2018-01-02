/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.dao;

import com.tcc.regressao_ejb.entity.GroceryHistories;
import javax.ejb.Stateless;

/**
 *
 * @author luiz
 */
@Stateless
public class GroceryHistoryDao extends GenericDaoImpl<GroceryHistories, Long> implements GroceryHistoryDaoLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
