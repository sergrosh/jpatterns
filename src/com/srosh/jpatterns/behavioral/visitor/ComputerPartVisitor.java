package com.srosh.jpatterns.behavioral.visitor;

/**
 * Created by sroshchupkin on 14/09/15.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
