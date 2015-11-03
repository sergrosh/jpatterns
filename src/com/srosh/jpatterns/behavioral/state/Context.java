package com.srosh.jpatterns.behavioral.state;

/**
 * Created by sroshchupkin on 09/09/15.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}