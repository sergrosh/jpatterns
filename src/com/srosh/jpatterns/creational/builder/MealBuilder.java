package com.srosh.jpatterns.creational.builder;

import com.srosh.jpatterns.creational.builder.item.drink.Coke;
import com.srosh.jpatterns.creational.builder.item.burger.ChickenBurger;
import com.srosh.jpatterns.creational.builder.item.burger.VegBurger;
import com.srosh.jpatterns.creational.builder.item.drink.Pepsi;

/**
 * Created by sroshchupkin on 11/08/15.
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
