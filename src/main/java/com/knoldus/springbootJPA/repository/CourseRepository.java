package com.knoldus.springbootJPA.repository;

import com.knoldus.springbootJPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
