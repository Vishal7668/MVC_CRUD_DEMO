package com.mvc.mvc_crud_api.controller_;

import com.mvc.mvc_crud_api.entity_.Student;
import com.mvc.mvc_crud_api.services_.dao.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudents() {
        return this.studentService.getStudents();

    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable long studentId) {
        return this.studentService.getStudent(studentId);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return this.studentService.addStudent(student);

    }

    @PutMapping("/student")
    public Student updateStudent(Student student) {
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{studentId}")
    public Student deleteStudent(@PathVariable long studentId) {
        return this.studentService.deleteStudent(studentId);

    }

}
