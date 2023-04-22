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
//@Table(name= "student")
@Builder
@Table(uniqueConstraints = @UniqueConstraint(
        name="emailid_unique",
        columnNames = "email_address"
))
public class Student {

    @SequenceGenerator(
            name="",
            sequenceName ="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Id
//    @Column(name = "student_id", unique = true, nullable = false)
//    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    private Long student_id;
    private String firstname;
    private String lastname;
    @Column(name="email_address")
    private String emailid;
    @Embedded
    private Address address;

}
