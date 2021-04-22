package com.example.lab2_4;

public class EmployeePartTime extends Employee {

    @Override
    public double TinhLuong() {
        // TODO Auto-generated method stub
        return 150;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +" -->PartTime="+TinhLuong();
    }
}