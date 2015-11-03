package com.srosh.jpatterns.behavioral.command;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}