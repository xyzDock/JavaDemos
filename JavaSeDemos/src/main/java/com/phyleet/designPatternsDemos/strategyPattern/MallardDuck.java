package com.phyleet.designPatternsDemos.strategyPattern;

import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl.FlyWithWings;
import com.phyleet.designPatternsDemos.strategyPattern.duckBehavior.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
