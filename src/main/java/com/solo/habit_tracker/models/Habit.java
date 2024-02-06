package com.solo.habit_tracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public abstract class Habit {

    @Id
    @Column
    protected Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"habits"})
    protected User user;

    @Column
    protected String habitName;

    @Column
    protected String description;

    @Column
    protected Date startDate;

    @Column
    protected Date endDate;

    @Column
    protected List<Date> successDates;

    @Column
    protected Integer frequency;

    @Column
    protected HabitType type;

    public Habit(User user, String habitName, String description, Date startDate, Date endDate, Integer frequency, HabitType type){
        this.user = user;
        this.habitName = habitName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.type = type;
        this.successDates = new ArrayList<>();
    }

    public Habit(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Date> getSuccessDates() {
        return successDates;
    }

    public void setSuccessDates(List<Date> successDates) {
        this.successDates = successDates;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public HabitType getType() {
        return type;
    }

    public void setType(HabitType type) {
        this.type = type;
    }
}
