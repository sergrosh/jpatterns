package com.srosh.jpatterns.behavioral.visitor;

/**
 * Created by sroshchupkin on 14/09/15.
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}