package com.knoldus.springbootJPA.repository;

import com.knoldus.springbootJPA.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
