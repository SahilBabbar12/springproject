package com.knoldus.springbootJPA.repository;

import com.knoldus.springbootJPA.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstname(String firstname);
    List<Student>findByFirstnameContaining(String firstname);

    @Query(
            value = "select * from student s where s.firstname=?;",
            nativeQuery = true
    )
    Student getStudentByFirstNameNative(String firstname);

    @Modifying
    @Transactional
    @Query(
            value="update student set firstname=? where emailid=?;",
            nativeQuery = true
    )
    int updateStudentFirstNameByEmailId(String firstname,String emailid);
//    @Query(
//            value ="update student set "
//    )
}
