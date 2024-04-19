package com.mvc.MVC_CRUD_API.Dao;

import com.mvc.MVC_CRUD_API.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {


}
