package com.srosh.jpatterns.creational.builder;

import com.srosh.jpatterns.creational.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sroshchupkin on 11/08/15.
 */
public class Meal {
    private List<Item > items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
