package com.myAPI.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.myAPI.demo.models.MyModel;
import com.myAPI.demo.services.MyService;

//class with the HTTP methods

@RestController
@RequestMapping("/")
public class MyController {

    //Injecting a dependency of our service
    @Autowired
    MyService myService;

    @GetMapping()
    public List<MyModel> getMyStudents(){
        return myService.getAllStudents();
    }

    @PostMapping()
    public MyModel saveMyStudent(@RequestBody MyModel student){
        return this.myService.saveStudent(student);
    }
    
}
