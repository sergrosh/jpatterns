package com.srosh.jpatterns.others.interceptingfilter;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
