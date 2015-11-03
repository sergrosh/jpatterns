package com.srosh.jpatterns.others.servicelocator;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}