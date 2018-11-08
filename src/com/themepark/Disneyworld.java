package com.themepark;

import java.util.ArrayList;

public class Disneyworld implements ThemePark {
    private String title;
    private ArrayList<Ride> rides = new ArrayList<>();

    public Disneyworld() {
        this.setTitle("Disneyworld");
        this.rides.add(new BigThunderMountain());
        this.rides.add(new TheHauntedMansion());
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void runThePark() {
        System.out.println("Welcome to " + this.getTitle());
        for (Ride ride : this.rides) {
            Thread t1 = new Thread((Runnable) ride, ride.getName());
            System.out.println("Running thread with name " + t1.getName());
            t1.start();
        }
    }
}
