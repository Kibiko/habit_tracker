package com.solo.habit_tracker.models;

import jakarta.persistence.Column;

import java.util.Date;
import java.util.List;

public class Productivity extends Habit{

    @Column
    private List<String> skills;

    public Productivity(User user, String habitName, String description, Date startDate, Date endDate, Integer frequency, HabitType type, List<String> skills) {
        super(user, habitName, description, startDate, endDate, frequency, type);
        this.skills = skills;
    }

    public Productivity() {

    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
