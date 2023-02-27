package com.example.JPA.service;

import com.example.JPA.dao.Course_dao;
import com.example.JPA.entity.Course;
import com.example.JPA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CourseImpl implements CourseService {

    // all contents of methods not needed anymore as jpa does the same for us..

//    List<Course> myList;

    @Autowired
    private Course_dao course_dao;

    public CourseImpl () {}

    @Override
    public List<Course> getCourses() {
        return course_dao.findAll();
    }

    @Override
    public Course getCourse(long courseID) {
        return course_dao.getOne(courseID);
    }

    @Override
    public Course addCourse(Course course) {
        course_dao.save(course);

        return course;
    }

    @Override
    public void deleteCourse(String courseID) {
        Course entity = course_dao.getOne(Long.parseLong(courseID));
        course_dao.delete(entity);
    }

    @Override
    public Course updateCourse(Course course) {
        course_dao.save(course);
        return course;
    }
}
