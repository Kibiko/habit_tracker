package com.solo.habit_tracker.models;

import jakarta.persistence.Column;

import java.util.Date;

public class Social extends Habit{

    @Column
    private SocialType socialType;

    @Column
    private SocialSetting setting;

    public Social(User user, String habitName, String description, Date startDate, Date endDate, Integer frequency, HabitType type, SocialType socialType, SocialSetting setting) {
        super(user, habitName, description, startDate, endDate, frequency, type);
        this.socialType = socialType;
        this.setting = setting;
    }

    public Social(){

    }

    public SocialType getSocialType() {
        return socialType;
    }

    public void setSocialType(SocialType socialType) {
        this.socialType = socialType;
    }

    public SocialSetting getSetting() {
        return setting;
    }

    public void setSetting(SocialSetting setting) {
        this.setting = setting;
    }
}
