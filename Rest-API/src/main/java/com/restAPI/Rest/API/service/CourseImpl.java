package com.restAPI.Rest.API.service;

import com.restAPI.Rest.API.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CourseImpl implements CourseService{

    // all contents of methods not needed anymore as jpa does the same for us..

    List<Course> myList;

    public CourseImpl () {
        myList = new LinkedList<>();

        myList.add(new Course(1, "Dilip Sunar", "Meghalaya"));
        myList.add(new Course(2, "Rohan Rathod", "Kerala"));
        myList.add(new Course(3, "Singham Singhaniya", "Karnataka"));
    }

    @Override
    public List<Course> courses() {
        return myList;
    }

    @Override
    public Course getCourse(Long courseID) {
        Course c = null;

        for (Course course: myList) {
            if (course.getId() == courseID) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        myList.add(course);

        return course;
    }

    @Override
    public Course deleteCourse(Long courseID) {
        Course c = null;
        for (Course course: myList) {
            if (course.getId() == courseID) {
                c = course;
                myList.remove(course);
                System.out.println("Record deleted!");
                break;
            }
        }
        return c;
    }

    @Override
    public List<Course> deleteAll() {
        List<Course> tempList = new LinkedList<>(myList);
        myList.removeAll(myList);

        return tempList;
    }

    @Override
    public Course updateCourse(Course course) {
        myList.forEach(e -> {
            if (e.getId() == course.getId()) {
                e.setName(course.getName());
                e.setAddress(course.getAddress());
            }
        });
        return course;

        // same method sao.save to be used to update record as the course ID passed already exists in the table
        // if ID exists then it'll update else add a new record
    }
}
