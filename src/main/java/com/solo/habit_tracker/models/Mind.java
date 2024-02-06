package com.solo.habit_tracker.models;

import jakarta.persistence.Column;

import java.util.Date;

public class Mind extends Habit{

    @Column
    private Integer duration;

    public Mind(User user, String habitName, String description, Date startDate, Date endDate, Integer frequency, HabitType type, Integer duration) {
        super(user, habitName, description, startDate, endDate, frequency, type);
        this.duration = duration;
    }

    public Mind(){

    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
