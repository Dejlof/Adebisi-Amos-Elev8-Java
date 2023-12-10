package com.gpacalculator.models;

public class Course {
    private String courseCode;
    private int courseUnits;
    private double courseScore;

    public Course(String courseCode, int courseUnits, double courseScore) {
        this.courseCode = courseCode;
        this.courseUnits = courseUnits;
        this.courseScore = courseScore;
    }
    
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public int getCourseUnits() {
        return courseUnits;
    }
    
    public void setCourseUnits(int courseUnits) {
        this.courseUnits = courseUnits;
    }

    public double getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(double courseScore) {
        this.courseScore = courseScore;
    }
}
