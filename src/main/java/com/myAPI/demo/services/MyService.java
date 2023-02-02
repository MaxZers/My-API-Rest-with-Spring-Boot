package com.myAPI.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myAPI.demo.models.MyModel;
import com.myAPI.demo.repositories.MyRepository;

//Class with our methods to consult db
@Service
public class MyService {
    @Autowired
    MyRepository myRepository;
    
    //consult students
    public List<MyModel> getAllStudents(){
        return (List<MyModel>) myRepository.findAll();
    }

    //save a new student
    public MyModel saveStudent(MyModel student){
        return myRepository.save(student);
    }

}
