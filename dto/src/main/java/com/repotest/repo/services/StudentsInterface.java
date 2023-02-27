package com.repotest.repo.services;

import com.repotest.repo.dto.StudentDto;
import com.repotest.repo.entity.Students;

import java.util.List;

public interface StudentsInterface {

    public List<StudentDto> getStudents();
    public Students insertStudents(StudentDto studentDto);
}
