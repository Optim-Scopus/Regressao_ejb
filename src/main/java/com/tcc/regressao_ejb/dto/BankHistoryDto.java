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
public class BankHistoryDto {
    
    private Long dow;
    
    private Long timeArrival;
    
    private Long waitTime;
    
    private Long task;
    
    private Long issue;

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

    public Long getTask() {
        return task;
    }

    public void setTask(Long task) {
        this.task = task;
    }

    public Long getIssue() {
        return issue;
    }

    public void setIssue(Long issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "BankHistoryDto{" + "dow=" + dow + ", timeArrival=" + timeArrival + ", waitTime=" + waitTime + ", task=" + task + ", issue=" + issue + '}';
    }
    
    
}
