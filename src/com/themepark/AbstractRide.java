package com.themepark;

import java.util.ArrayList;

abstract public class AbstractRide implements Ride, Runnable {
    private String name;
    private ArrayList<String> reviews = new ArrayList<String>();

    private int capacityPerMinute = 5;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void addReview(String review) {
        reviews.add(review);
    }

    @Override
    public int getNumberOfReviews() {
        return reviews.size();
    }

    @Override
    public int getCapacityPerMinute() {
        return capacityPerMinute;
    }

    @Override
    public void setCapacityPerMinute(int capacityPerMinute) {
        this.capacityPerMinute = capacityPerMinute;
    }

    public void run() {
        System.out.println("You are about to ride " + this.getName());
        System.out.println("This ride runs at " + this.getCapacityPerMinute() + " people per minute");
        if (this.getCapacityPerMinute() < 15) {
            this.addReview("This ride was great");
            this.addReview("This ride was awesome!");
        }
        else {
            this.addReview("This ride was too crowded");
        }
        System.out.println("This ride now has " + this.getNumberOfReviews() + " reviews.");
    }

}
