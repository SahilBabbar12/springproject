package com.knoldus.springbootJPA.repository;

import com.knoldus.springbootJPA.entity.Course;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;
    @Test
    public void printCourses(){
        List<Course> courses=courseRepository.findAll();
        System.out.println(courses);
    }
}