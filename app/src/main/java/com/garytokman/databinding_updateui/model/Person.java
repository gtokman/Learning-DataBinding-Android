package com.garytokman.databinding_updateui.model;
// Gary Tokman
// 11/20/16
// DataBinding-UpdateUI

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;
import android.view.View;

import com.garytokman.databinding_updateui.BR;

public class Person implements Observable {

    private String mName;
    private String mAge;
    private String mJob;
    private PropertyChangeRegistry mRegistry = new PropertyChangeRegistry();

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Bindable
    public String getAge() {
        return mAge;
    }

    public void setAge(String age) {
        mAge = age;
        mRegistry.notifyChange(this, BR.age);
    }

    @Bindable
    public String getJob() {
        return mJob;
    }

    public void setJob(String job) {
        mJob = job;
        mRegistry.notifyChange(this, BR.job);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mRegistry.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mRegistry.remove(callback);
    }

    public void onClickUpdate(View view) {
        try {
            Thread.sleep(5000);
            this.setAge("25 years old!");
            this.setJob("Android Developer at Facebook.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
