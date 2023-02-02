package com.myAPI.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.myAPI.demo.models.MyModel;

//Interface that extends from CRUD Repository, in order to access to the most common consulting methods
@Repository
public interface MyRepository extends CrudRepository<MyModel, Long> {
 
}