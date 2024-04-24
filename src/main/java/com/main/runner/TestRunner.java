package com.main.runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.main.document.Doctor;
import com.main.service.IDoctorMngtService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMngtService service;
	
	@Override
	public void run(String... args) throws Exception {
		 
          try
          {
        	  //save single record
//        	  Doctor d = new Doctor();
//        	  d.setId(new Random().nextInt(100000));
//        	  d.setName("Sukanta");
//        	  d.setSalary(12000f);
//        	  d.setAddr("Bhadrak");
//        	  d.setAdult(true);
//        	  d.setDob(LocalDateTime.now());
//        	  d.setSpecialization("Surgery A1");
//        	  System.out.println(service.saveDoctor(d));
        	  
        	  //save bulk of records
				/*Doctor d1 = new Doctor();
				d1.setId(new Random().nextInt(100000));
				d1.setName("Test5");
				d1.setSalary(14000f);
				d1.setAddr("Bhadrak");
				d1.setAdult(true);
				d1.setDob(LocalDateTime.now());
				d1.setSpecialization("Surgery A5");
				
				Doctor d2 = new Doctor();
				d2.setId(new Random().nextInt(100000));
				d2.setName("Test6");
				d2.setSalary(27000f);
				d2.setAddr("Bhadrak");
				d2.setAdult(true);
				d2.setDob(LocalDateTime.now());
				d2.setSpecialization("Surgery A6");
				
				Doctor d3 = new Doctor();
				d3.setId(new Random().nextInt(100000));
				d3.setName("Test7");
				d3.setSalary(40000f);
				d3.setAddr("Bhadrak");
				d3.setAdult(true);
				d3.setDob(LocalDateTime.now());
				d3.setSpecialization("Surgery A7");
				
				Doctor d4 = new Doctor();
				d4.setId(new Random().nextInt(100000));
				d4.setName("Test8");
				d4.setSalary(35000f);
				d4.setAddr("Bhadrak");
				d4.setAdult(true);
				d4.setDob(LocalDateTime.now());
				d4.setSpecialization("Surgery A8");
				
				System.out.println(service.saveAllDoctors(List.of(d1, d2, d3, d4)));*/
        	  //find records based on passing salary range value
        	  //service.getAllDoctorsBasedOnSalaryRange(20000f, 40000f).forEach(System.out::println);
        	  
        	  //find single record based on doctor name
        	  service.fetchSingleDoctorByName("Test1").forEach(System.out::println);
        	  
          }
          catch (Exception e) {
			 e.printStackTrace();
		}
	}

}
