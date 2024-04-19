package com.mvc.MVC_CRUD_API.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
     @Id
    private int studentRollNo;
     @Column
    private String studentName;
     @Column
    private String studentCity;
     @Column
    private long studentPhNo;

    public Student() {
        super();
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public long getStudentPhNo() {
        return studentPhNo;
    }

    public void setStudentPhNo(long studentPhNo) {
        this.studentPhNo = studentPhNo;
    }

    public Student(int studentRollNo, String studentName, String studentCity, long studentPhNo) {
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentPhNo = studentPhNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRollNo=" + studentRollNo +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentPhNo=" + studentPhNo +
                '}';
    }
}
