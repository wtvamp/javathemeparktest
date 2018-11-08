package com.themepark;

public class BigThunderMountain extends AbstractRide {

    public BigThunderMountain() {
        this.setCapacityPerMinute(20);
        this.setName("Big Thunder Mountain");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("It's the wildest ride in the wilderness!");
    }
}
