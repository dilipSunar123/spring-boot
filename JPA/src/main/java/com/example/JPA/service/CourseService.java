package com.example.JPA.service;

import com.example.JPA.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public void deleteCourse(String courseID);
    public Course updateCourse(Course course);

}
