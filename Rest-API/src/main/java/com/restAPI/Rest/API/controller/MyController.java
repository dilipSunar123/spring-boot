package com.restAPI.Rest.API.controller;

import com.restAPI.Rest.API.entity.Course;
import com.restAPI.Rest.API.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String home () {
        return "Hello :)";
    }

    // fetch all the courses
    @GetMapping("/courses")
    public List<Course> courses () {
        return this.courseService.courses();
    }

    // get a course by its ID
    @GetMapping("/courses/{courseID}")
    public Course getCourse (@PathVariable String courseID) {
        return this.courseService.getCourse(Long.parseLong(courseID));
    }

    // add a new course
    @PostMapping("/courses")
    public Course addCourse (@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    // delete a course by its ID
    @DeleteMapping("/delete/{courseID}")
    public void deleteCourse (@PathVariable String courseID) {}

    // delete all the courses
    @DeleteMapping("/deleteAll")
    public List<Course> deleteAll () {
        return this.courseService.deleteAll();
    }

    // update course
    @PutMapping("/courses")
    public Course updateCourse (@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

}
