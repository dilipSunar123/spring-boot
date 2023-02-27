package com.repotest.repo.controller;

import com.repotest.repo.dto.StudentDto;
import com.repotest.repo.entity.Students;
import com.repotest.repo.services.StudentsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    public StudentsInterface studentsInterface;

    @PostMapping("/students")
    public Students insertStudents(@RequestBody StudentDto studentDto) {
        return studentsInterface.insertStudents(studentDto);
    }
    @GetMapping("/students")
    public List<StudentDto> getStudents()
    {
        return studentsInterface.getStudents();
    }
}
