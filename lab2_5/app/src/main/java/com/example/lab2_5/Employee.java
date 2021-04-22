package com.example.lab2_5;

import androidx.annotation.NonNull;

public class Employee {
    private String id;
    private String fullname;
    private boolean ismanager;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullname;
    }

    public void setName(String fullname) {
        this.fullname = fullname;
    }


    public boolean isManager(){
        return ismanager;
    };
    public void setIsmanager(boolean ismanager) {
        this.ismanager = ismanager;
    }

    @Override
    public String toString() {
        return this.fullname;
    }
}