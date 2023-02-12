package com.example.headfirstdesignpattern.ch4_Factory.prac;

import java.util.List;

public class PacificCalendar extends Calendar{
    public PacificCalendar(ZoneFactory zoneFactory) {
        zone = zoneFactory.createZone("US/Pacific");
    }

    @Override
    public void createCalendar(List<String> appointments) {
        System.out.println("Creating calendar");
        for (String appointment : appointments) {
            System.out.println(appointment);
        }
    }
}
