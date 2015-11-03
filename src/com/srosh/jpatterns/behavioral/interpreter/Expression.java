package com.srosh.jpatterns.behavioral.interpreter;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public interface Expression {
    public boolean interpret(String context);
}
