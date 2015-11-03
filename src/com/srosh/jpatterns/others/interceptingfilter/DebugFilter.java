package com.srosh.jpatterns.others.interceptingfilter;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
