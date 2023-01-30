package com.example.headfirstdesignpattern.ch2_observer.weather;


public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
