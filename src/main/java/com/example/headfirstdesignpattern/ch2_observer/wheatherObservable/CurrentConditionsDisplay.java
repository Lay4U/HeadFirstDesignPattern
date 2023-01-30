package com.example.headfirstdesignpattern.ch2_observer.wheatherObservable;

import com.example.headfirstdesignpattern.ch2_observer.weather.Observer;
import com.example.headfirstdesignpattern.ch2_observer.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
