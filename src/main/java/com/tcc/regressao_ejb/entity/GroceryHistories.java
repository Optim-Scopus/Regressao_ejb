/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author luiz
 */
@Entity(name="GroceryHistories")
@Table(name="grocery_histories")
public class GroceryHistories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long grocery_id;
    
    private Integer dow;
    
    private Integer time_arrival;
    
    private Integer time_exit;
    
    private Long groceries_size;
    
    private Integer issue;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGrocery_id() {
        return grocery_id;
    }

    public void setGrocery_id(Long grocery_id) {
        this.grocery_id = grocery_id;
    }

    public Integer getDow() {
        return dow;
    }

    public void setDow(Integer dow) {
        this.dow = dow;
    }

    public Integer getTime_arrival() {
        return time_arrival;
    }

    public void setTime_arrival(Integer time_arrival) {
        this.time_arrival = time_arrival;
    }

    public Integer getTime_exit() {
        return time_exit;
    }

    public void setTime_exit(Integer time_exit) {
        this.time_exit = time_exit;
    }

    public Long getGroceries_size() {
        return groceries_size;
    }

    public void setGroceries_size(Long groceries_size) {
        this.groceries_size = groceries_size;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroceryHistories)) {
            return false;
        }
        GroceryHistories other = (GroceryHistories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tcc.regressao_ejb.entity.GroceryHistory[ id=" + id + " ]";
    }
    
}
