package com.main.service;

import java.util.List;

import com.main.document.Doctor;
 

public interface IDoctorMngtService 
{
    public String saveDoctor(Doctor doctor);
    public String saveAllDoctors(List<Doctor> dList);
    public List<Doctor> getAllDoctorsBasedOnSalaryRange(Float start, Float end);
    public List<Doctor> fetchSingleDoctorByName(String name);
	 
    
}
