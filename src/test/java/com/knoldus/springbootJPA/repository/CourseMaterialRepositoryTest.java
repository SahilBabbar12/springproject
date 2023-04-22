package com.knoldus.springbootJPA.repository;

import com.knoldus.springbootJPA.entity.Course;
import com.knoldus.springbootJPA.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void SaveCourseMaterial(){
        Course course=Course.builder().courseId(2).courseName("java").build();

        CourseMaterial courseMaterial=CourseMaterial
                .builder().CourseMaterialId(102L).course(course).build();
        repository.save(courseMaterial);

        // this will throw an error as we are trying to save the courseMaterial object without saving the course object.
    }

}