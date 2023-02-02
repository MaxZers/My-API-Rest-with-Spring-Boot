package com.myAPI.demo.services;

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
import com.myAPI.demo.repositories.MyRepository;

public class MyServiceTests {
    
    //mock of our repository
    @Mock
    private MyRepository myRepository;

    //Injecting mocks of the service and model
    @InjectMocks
    private MyService myService;
    private MyModel student;

    @BeforeEach
    void SetUp(){
        //Draft of our object student
        MockitoAnnotations.openMocks(this);
        student = new MyModel();
        student.setId((long) 1);
        student.setName("Palomito");
        student.setLastName("Palomo");
        student.setAge(23);
        student.setEmail("pPalomo@gmail.com");
    }

    @Test
    //Testing the getAllStudents method
    void getAllStudents(){
        when(myRepository.findAll()).thenReturn(Arrays.asList(student));
        assertNotNull(myService.getAllStudents());
    }

    @Test
    //Testing the saveStudent method
    void saveStudent(){
        when(myRepository.save(any(MyModel.class))).thenReturn(student);
        assertNotNull(myService.saveStudent(new MyModel()));
    }
}
