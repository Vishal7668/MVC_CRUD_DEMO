package com.mvc.MVC_CRUD_API.Controller;

import com.mvc.MVC_CRUD_API.Dao.StudentDao;
import com.mvc.MVC_CRUD_API.Model.Student;
import com.mvc.MVC_CRUD_API.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

     @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

     @PostMapping("/bulkAdd")
    public String addAllStudent(@RequestBody List<Student> students){
        return studentService.addAllStudents(students);
    }

     @DeleteMapping("/all/{rollNo}")
    public String deleteStudent(@PathVariable int rollNo){
        return studentService.deleteStudent(rollNo);
    }

     @PutMapping("/add")
    public String updateStudent(Student student){
         return studentService.updateStudent(student);
    }

     @GetMapping("/all/{rollNo}")
    public Student getStudent(@PathVariable int rollNo){
         return studentService.getStudent(rollNo);
    }


}
