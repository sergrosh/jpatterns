package com.srosh.jpatterns.behavioral.template;

/**
 * Created by sroshchupkin on 14/09/15.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}