package com.srosh.jpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sroshchupkin on 21/08/15.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
