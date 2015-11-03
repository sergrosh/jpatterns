package com.srosh.jpatterns.others.frontcontroller;

/**
 * Created by sroshchupkin on 15/09/15.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
