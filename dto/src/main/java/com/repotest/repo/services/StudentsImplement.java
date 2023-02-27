package com.repotest.repo.services;

import com.repotest.repo.dto.StudentDto;
import com.repotest.repo.entity.Students;
import com.repotest.repo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsImplement implements StudentsInterface{

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Students insertStudents(StudentDto studentDto) {
        Students students = convertToStudents(studentDto);
        return studentRepository.save(students);
    }

    public Students convertToStudents(StudentDto studentDto){
        Students students = new Students();
        students.setId(studentDto.getId());
        students.setName(studentDto.getName());

        return students;
    }

    @Override
    public List<StudentDto> getStudents() {
        List<Students> students = studentRepository.findAll();

        return students.stream().map(students1 -> convertToStudentDto(students1)).collect(Collectors.toList());
    }

    public StudentDto convertToStudentDto(Students students){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(students.getId());
        studentDto.setName(students.getName());
        return studentDto;
    }
}
