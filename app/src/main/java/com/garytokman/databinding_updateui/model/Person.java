package com.garytokman.databinding_updateui.model;
// Gary Tokman
// 11/20/16
// DataBinding-UpdateUI

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.garytokman.databinding_updateui.BR;

public class Person extends BaseObservable {

    private String mName;
    private String mAge;
    private String mJob;
    private String mImage;

    @Bindable
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return mAge;
    }

    public void setAge(String age) {
        mAge = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getJob() {
        return mJob;
    }

    public void setJob(String job) {
        mJob = job;
        notifyPropertyChanged(BR.job);
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

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }
}
