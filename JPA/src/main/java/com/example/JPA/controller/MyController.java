package com.example.JPA.controller;

import com.example.JPA.entity.Course;
import com.example.JPA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    CourseService courseService;

    @GetMapping("/greet")
    public String greet () {
        return "Hello Dilip :)";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
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

    // update course
    @PutMapping("/courses")
    public Course updateCourse (@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

}
