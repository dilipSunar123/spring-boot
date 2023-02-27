package com.example.JPA.dao;

import com.example.JPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Course_dao extends JpaRepository<Course, Long> {

}
