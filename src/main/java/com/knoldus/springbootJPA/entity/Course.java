package com.knoldus.springbootJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Course {
    @SequenceGenerator(
            name="",
            sequenceName ="course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    @Id
    @Column(name = "courseId")
    private Integer courseId;

    @Column(name="courseName")
    private String courseName;

    @OneToOne(
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;
}
