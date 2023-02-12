package com.example.headfirstdesignpattern.ch4_Factory.prac;

import java.util.List;

public abstract class Calendar {
    Zone zone;
    public void print(){
        System.out.println(zone.getDisplayName());
        System.out.println(zone.getOffset());
    }
    public abstract void createCalendar(List<String> appointments);
}
