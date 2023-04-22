package com.knoldus.springbootJPA.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {
    @SequenceGenerator(
            name="",
            sequenceName ="course_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
    @Id
    @Column(name = "course_material_id")
    private Long CourseMaterialId;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch=FetchType.LAZY
    )
    @JoinColumn(
            name="course_id",
            referencedColumnName="courseId"
    )
    private Course course;
}
