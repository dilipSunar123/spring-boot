package com.restAPI.Rest.API.service;

import com.restAPI.Rest.API.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> courses();
    public Course getCourse(Long courseID);
    public Course addCourse(Course course);
    public Course deleteCourse(Long courseID);
    public List<Course> deleteAll();
    public Course updateCourse(Course course);
}
