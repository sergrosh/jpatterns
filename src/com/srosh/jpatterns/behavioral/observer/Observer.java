package com.srosh.jpatterns.behavioral.observer;

/**
 * Created by sroshchupkin on 09/09/15.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
