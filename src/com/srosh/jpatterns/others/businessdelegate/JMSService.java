package com.srosh.jpatterns.others.businessdelegate;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
