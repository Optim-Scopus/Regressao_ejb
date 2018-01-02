/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author luiz
 */
@Entity
public class restaurant_histories implements Serializable {
             
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long restaurant_id;
    
    private Integer dow;
    
    private Integer time_arrival;
    
    private Integer time_exit;
    
    private Integer group_size;
    
    private Integer issue;
    
    private Integer special_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
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

    public Integer getGroup_size() {
        return group_size;
    }

    public void setGroup_size(Integer group_size) {
        this.group_size = group_size;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public Integer getSpecial_date() {
        return special_date;
    }

    public void setSpecial_date(Integer special_date) {
        this.special_date = special_date;
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
        if (!(object instanceof restaurant_histories)) {
            return false;
        }
        restaurant_histories other = (restaurant_histories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tcc.regressao.entity.RestaurantHistory[ id=" + id + " ]";
    }
    
}
