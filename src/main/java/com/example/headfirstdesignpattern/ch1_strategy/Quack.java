package com.example.headfirstdesignpattern.ch1_strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
