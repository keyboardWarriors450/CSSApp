package com.example.viet.cssapp;

/**
 * Created by viet on 4/13/2015.
 */
public class Course {
    private String courseID;
    private String shortDescript;
    private String longDescript;
    private String prerequisites;

    public Course(String courseID, String shortDescript, String longDescript, String prerequisites) {
        this.courseID = courseID;
        this.shortDescript = shortDescript;
        this.longDescript = longDescript;
        this.prerequisites = prerequisites;
    }

    public String getCourseID() {
        return this.courseID;
    }

    public String getShortDescript() {
        return shortDescript;
    }

    public String getLongDescript() {
        return longDescript;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    // setters

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setShortDescript(String shortDescript) {
        this.shortDescript = shortDescript;
    }

    public void setLongDescript(String longDescript) {
        this.longDescript = longDescript;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
}
