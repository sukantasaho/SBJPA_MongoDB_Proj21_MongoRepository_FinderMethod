package com.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.document.Doctor;
import com.main.repository.IDoctorRepo;

@Service("empService")
public class DoctorServiceImp implements IDoctorMngtService {

	@Autowired
	private IDoctorRepo repo;
	
	
	@Override
	public String saveDoctor(Doctor doctor) {
		 Integer id =  repo.save(doctor).getId();
		return "Record saved with id-"+id;
	}


	@Override
	public String saveAllDoctors(List<Doctor> dList) {
		 
		 List<Integer> idList = repo.saveAll(dList).stream().map(emp->emp.getId()).collect(Collectors.toList());
		return "Bulk of record is saved with ids-"+idList;
	}
	@Override
	public List<Doctor> getAllDoctorsBasedOnSalaryRange(Float start, Float end)
	{	 
		return repo.findBySalaryBetween(start, end);
	}


	@Override
	public List<Doctor> fetchSingleDoctorByName(String name) 
	{
		 
		return repo.findByName(name);
	}

	 

}
