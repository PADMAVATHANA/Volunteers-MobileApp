package com.example.voluntrun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UserRequest extends AppCompatActivity {
    String name, age, bloodgroup, phoneNo, location;


    public UserRequest() {
    }
    public UserRequest(String name, String bloodgroup, String age, String phoneNo, String location) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.age = age;
        this.phoneNo = phoneNo;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}