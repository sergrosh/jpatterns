package com.srosh.jpatterns.behavioral.chainOfResponsibility;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}