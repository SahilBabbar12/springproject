package com.knoldus.springbootJPA.controller;

import com.knoldus.springbootJPA.entity.Student;

import com.knoldus.springbootJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    // Get Request

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }
    @RequestMapping("/showLists")
    public List<Student> showList(){
        return studentService.getList();
    }

    // Post request
//    @PostMapping("/adduser")
//    public void addStudent(@ModelAttribute("person") Student student){
//        studentService.addNewStudent(student);
//    }

    @PostMapping("/adduser")
    public Student addStudent(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }

    // Put Request

    @PutMapping("updateEmployee/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody Student student){
        studentService.updateStudent(student,id);
    }
//
    // Delete Request

    @DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }
}
