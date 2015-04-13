package com.example.viet.cssapp;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by viet on 4/13/2015.
 */
public class Instructor {


   private String name;
   private String title;
   private String email;
   private String phone;
   private String location;
   private  String bio;
   private  ArrayList<String> courseList ;
   private  Image picture;

    Instructor(String name, String title, String email, String phone, String location, String bio
            , ArrayList<String> courseList, Image picture) {
        this.name = name;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.bio = bio;
        this.courseList = courseList;
        this.picture = picture;
    }

    // getters


    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public Image getPicture() {
        return picture;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
}
