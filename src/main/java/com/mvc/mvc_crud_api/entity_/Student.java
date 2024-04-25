package com.mvc.mvc_crud_api.entity_;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    @Column
    private String studentName;
    @Column
    private String studentCity;
    @Column
    private long studentPhNo;

    public Student(long studentId, String studentName, String studentCity, long studentPhNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
        this.studentPhNo = studentPhNo;
    }

    public Student() {
        super();
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", studentPhNo=" + studentPhNo +
                '}';
    }


}
