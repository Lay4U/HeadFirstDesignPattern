package com.example.headfirstdesignpattern.ch1_strategy;

public class MuteQauck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
