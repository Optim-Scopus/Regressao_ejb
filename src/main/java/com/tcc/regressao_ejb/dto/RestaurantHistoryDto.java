/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcc.regressao_ejb.dto;

/**
 *
 * @author luiz
 */
public class RestaurantHistoryDto {
    
    private Long dow;
    
    private Long timeArrival;
    
    private Long waitTime;
    
    private Long groupSize;
    
    private Long issue;
    
    private Long specialDate;

    public Long getDow() {
        return dow;
    }

    public void setDow(Long dow) {
        this.dow = dow;
    }

    public Long getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(Long timeArrival) {
        this.timeArrival = timeArrival;
    }

    public Long getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Long waitTime) {
        this.waitTime = waitTime;
    }

    public Long getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(Long groupSize) {
        this.groupSize = groupSize;
    }

    public Long getIssue() {
        return issue;
    }

    public void setIssue(Long issue) {
        this.issue = issue;
    }

    public Long getSpecialDate() {
        return specialDate;
    }

    public void setSpecialDate(Long specialDate) {
        this.specialDate = specialDate;
    }

    @Override
    public String toString() {
        return "RestaurantHistoryDto{" + "dow=" + dow + ", timeArrival=" + timeArrival + ", waitTime=" + waitTime + ", groupSize=" + groupSize + ", issue=" + issue + ", specialDate=" + specialDate + '}';
    }
    
    
}
