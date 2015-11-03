package com.srosh.jpatterns.behavioral.chainOfResponsibility;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}