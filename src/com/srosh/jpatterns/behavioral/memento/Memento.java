package com.srosh.jpatterns.behavioral.memento;

/**
 * Created by sroshchupkin on 09/09/15.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
