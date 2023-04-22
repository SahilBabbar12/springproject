package com.knoldus.springbootJPA.service;

import com.knoldus.springbootJPA.entity.Student;
import com.knoldus.springbootJPA.exception.EmptyInputException;
import com.knoldus.springbootJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository repository;


    //StudentService studentService;
    @Override
    public List<Student> getList() {
        return repository.findAll();
    }
    public Student addNewStudent(Student student){
        if(student.getFirstname().isEmpty())
            throw new EmptyInputException("601","Input fields are empty");
       else
        return repository.save(student);
    }
    @Override
    public void updateStudent(Student student, long id) {
        Optional<Student> student1 = repository.findById(id);
        if(student1.isPresent()) {
            repository.save(student);
        }

    }

    @Override
    public void deleteStudent(long id){
        if(repository.findById(id)!=null)
            repository.deleteById(id);
    }


    @Override
    public List<Student> findByFirstname(String firstname) {
        return repository.findByFirstname(firstname);
    }
    @Override
    public List<Student> findByFirstnameContaining(String words){
        return repository.findByFirstnameContaining(words);

    }
}
