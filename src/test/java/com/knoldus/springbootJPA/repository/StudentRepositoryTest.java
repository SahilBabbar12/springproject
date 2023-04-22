package com.knoldus.springbootJPA.repository;

import com.knoldus.springbootJPA.entity.Address;
import com.knoldus.springbootJPA.entity.Student;
import com.knoldus.springbootJPA.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest{

//    @Autowired
//    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudentWithAddress(){

        Address address=Address.builder().city("New Delhi").street("Dilshad colony").pin("1111").build();
        Student student =Student.builder().student_id(3L).
        firstname("jitin").lastname("kumar").emailid("abc3@123.com").address(address).build();

        studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        System.out.println("student list="+studentList);
    }
    @Test
    public void printByFirstName(){
        List<Student> students=studentRepository.findByFirstname("sahil");

        System.out.println(students);
    }
    @Test
    public void printByFirstNameContaining(){
        List<Student> studentList=studentRepository.findByFirstnameContaining("r");
        System.out.println(studentList);
    }

    @Test
    public void printgetStudentByNameNative(){
       Student student=studentRepository.getStudentByFirstNameNative("sahil");
        System.out.println(student);
    }
    @Test

    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentFirstNameByEmailId(
                "rohit",
                "abc3@gmail.com"
        );
    }
}