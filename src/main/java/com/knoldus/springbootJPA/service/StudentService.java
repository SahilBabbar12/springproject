package com.knoldus.springbootJPA.service;

import com.knoldus.springbootJPA.entity.Student;


import java.util.List;


public interface StudentService{
    List<Student> getList();
    Student addNewStudent(Student student);
    void updateStudent(Student student,long id);
    void deleteStudent(long id);

    List<Student>findByFirstname(String firstname);

    List<Student>findByFirstnameContaining(String firstname);

}
