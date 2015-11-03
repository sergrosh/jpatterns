package com.srosh.jpatterns.behavioral.state;

/**
 * Created by sroshchupkin on 09/09/15.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
