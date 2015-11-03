package com.srosh.jpatterns.behavioral.command;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
