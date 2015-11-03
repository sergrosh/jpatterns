package com.srosh.jpatterns.others.interceptingfilter;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}