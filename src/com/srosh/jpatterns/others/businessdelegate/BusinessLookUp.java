package com.srosh.jpatterns.others.businessdelegate;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){

        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else {
            return new JMSService();
        }
    }
}
