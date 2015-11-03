package com.srosh.jpatterns.others.nullobject;

/**
 * Created by sroshchupkin on 11/09/15.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
