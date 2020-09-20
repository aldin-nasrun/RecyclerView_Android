package com.example.newscrool;

import android.widget.TextView;

public class itemsModel {
    private String appName;
    private  String description;
    private int icon;

    public itemsModel(String appName, String description, int icon) {
        this.appName = appName;
        this.description = description;
        this.icon = icon;
    }

    //getter and setter

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
