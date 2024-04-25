package com.mvc.mvc_crud_api.services_.dao;

import com.mvc.mvc_crud_api.entity_.Student;

import java.util.List;


public interface StudentService {

    public List<Student> getStudents();

    public Student getStudent(long studentId);

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public Student deleteStudent(long studentId);
}
