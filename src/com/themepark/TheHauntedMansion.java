package com.themepark;

public class TheHauntedMansion extends AbstractRide {
    public TheHauntedMansion() {
        this.setCapacityPerMinute(10);
        this.setName("The Haunted Mansion");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
        System.out.println("Welcome, foolish mortals...");
    }
}