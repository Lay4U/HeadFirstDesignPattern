package com.example.headfirstdesignpattern.ch1_strategy;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
