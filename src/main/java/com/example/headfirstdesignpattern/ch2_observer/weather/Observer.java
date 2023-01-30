package com.example.headfirstdesignpattern.ch2_observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
