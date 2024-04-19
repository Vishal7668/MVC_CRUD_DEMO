package com.mvc.MVC_CRUD_API.Service;

import com.mvc.MVC_CRUD_API.Dao.StudentDao;
import com.mvc.MVC_CRUD_API.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao dao;

    public String addStudent(Student student){
        dao.save(student);
        return "New Student has been added in the DataBases, studentRollNo :- " +student.getStudentRollNo();
    }

    public String addAllStudents(List<Student> students){
        dao.saveAll(students);
        return "All Students has been added in Database ";
    }

    public String deleteStudent(int rollNo){
        Student student=dao.getById(rollNo);
        dao.delete(student);
        return "One student has been deleted from the Database : "+rollNo;
    }

    public String updateStudent(Student student){
        dao.save(student);
        return "Roll Number is updated " +student.getStudentRollNo();

    }
    public Student getStudent(int rollNo){
        return dao.getById(rollNo);
    }
}
