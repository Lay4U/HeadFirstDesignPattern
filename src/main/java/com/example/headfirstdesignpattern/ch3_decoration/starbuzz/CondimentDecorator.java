package com.example.headfirstdesignpattern.ch3_decoration.starbuzz;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDescription();
}
