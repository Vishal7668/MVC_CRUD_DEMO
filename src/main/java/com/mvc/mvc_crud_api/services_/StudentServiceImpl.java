package com.mvc.mvc_crud_api.services_;

import com.mvc.mvc_crud_api.entity_.Student;
import com.mvc.mvc_crud_api.services_.dao.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    List<Student> list;

    public StudentServiceImpl() {
        list = new ArrayList<>();
        list.add(new Student(123, "Vishl", "chandigarh", 121332434));
        list.add(new Student(13, "Vishal", "Chandigarh", 127332434));
    }


    @Override
    public List<Student> getStudents() {
        return list;
    }

    @Override
    public Student getStudent(long studentId) {
        Student st = null;
        for (Student student : list) {
            if (student.getStudentId() == studentId) {
                st = student;
                break;
            }
        }
        return st;
    }

    @Override
    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        list.add(student);
        return student;
    }

    @Override
    public Student deleteStudent(long studentId) {
        // Find the student
        Student studentToDelete = null;
        for (Student student : list) {
            if (student.getStudentId() == studentId) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {
            list.remove(studentToDelete);
        }
        return studentToDelete;
    }
}


