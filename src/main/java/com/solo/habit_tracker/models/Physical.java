package com.solo.habit_tracker.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;


public class Physical extends Habit{

    @Column
    private Intensity intensity;

    @Column
    private Integer duration;

    public Physical(User user, String habitName, String description, Date startDate, Date endDate, Integer frequency, HabitType type, Intensity intensity, Integer duration) {
        super(user, habitName, description, startDate, endDate, frequency, type);
        this.intensity = intensity;
        this.duration = duration;
    }

    public Physical(){

    }

    public Intensity getIntensity() {
        return intensity;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
