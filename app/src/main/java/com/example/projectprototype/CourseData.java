package com.example.projectprototype;

import java.util.Date;

public class CourseData {

    private CourseData(){

    }

    String HomeCourseET;


    public String gethomecourseet() {return HomeCourseET;}

    public void sethomecourseet (String HomeCourseET) {this.HomeCourseET = HomeCourseET;}





    public CourseData (String HomeCourseET){

        this.HomeCourseET = HomeCourseET;

    }
}
