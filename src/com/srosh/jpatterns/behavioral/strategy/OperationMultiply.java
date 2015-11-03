package com.srosh.jpatterns.behavioral.strategy;

/**
 * Created by sroshchupkin on 11/09/15.
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}