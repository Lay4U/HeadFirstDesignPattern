package com.example.headfirstdesignpattern.ch1_strategy;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날고 있습니다.");
    }
}
