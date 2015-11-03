package com.srosh.jpatterns.behavioral.state;

/**
 * Created by sroshchupkin on 09/09/15.
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}