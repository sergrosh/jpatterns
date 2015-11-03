package com.srosh.jpatterns.behavioral.chainOfResponsibility;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
