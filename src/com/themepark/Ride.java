package com.themepark;

public interface Ride {
    String getName();
    void setName(String name);
    void addReview(String review);
    int getNumberOfReviews();
    void setCapacityPerMinute(int capacityPerMinute);
    int getCapacityPerMinute();
}
