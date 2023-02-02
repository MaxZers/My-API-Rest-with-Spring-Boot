package com.myAPI.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.myAPI.demo.models.MyModel;
import com.myAPI.demo.services.MyService;

public class MyControllerTests {

    //mock of our service
    @Mock 
    private MyService myService;

    //Injecting mocks of the controller and model
    @InjectMocks
    private MyController myController;
    private MyModel student;

    @BeforeEach
    void SetUp(){
        //Draft of our object student
        MockitoAnnotations.openMocks(this);
        student = new MyModel();
        student.setId((long) 1);
        student.setName("Palomito2");
        student.setLastName("Palomo2");
        student.setAge(30);
        student.setEmail("pPalomo2@gmail.com");
    }

    @Test
    //Testing GET method
    void getMyStudents(){
        when(myService.getAllStudents()).thenReturn(Arrays.asList(student));
        assertNotNull(myService.getAllStudents());
    }

    @Test
    //Testing POST method
    void saveMyStudent(){
        when(myService.saveStudent(any(MyModel.class))).thenReturn(student);
        assertNotNull(myService.saveStudent(new MyModel()));
    }
    
}
