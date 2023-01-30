package com.example.headfirstdesignpattern.ch2_observer.wheatherObservable;

import com.example.headfirstdesignpattern.ch2_observer.weather.Observer;
import com.example.headfirstdesignpattern.ch2_observer.weather.Subject;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private boolean changed;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){

    }

    private void setChanged() {
        this.changed = true;
    }


    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }
}
