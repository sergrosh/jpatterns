package com.srosh.jpatterns.others.businessdelegate;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
