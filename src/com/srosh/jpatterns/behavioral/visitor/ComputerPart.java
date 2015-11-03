package com.srosh.jpatterns.behavioral.visitor;

/**
 * Created by sroshchupkin on 14/09/15.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
