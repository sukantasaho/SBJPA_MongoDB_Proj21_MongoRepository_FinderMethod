package com.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.main.document.Doctor;
 

public interface IDoctorRepo  extends MongoRepository<Doctor, Integer>, CrudRepository<Doctor, Integer>
{
      public  List<Doctor> findBySalaryBetween(Float start, Float end);
      public  List<Doctor> findByName(String name);
}
