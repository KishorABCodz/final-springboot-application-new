package com.kishor.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishor.model.employee;
import com.kishor.model.employee_log;
import com.kishor.repo.empLogRepo;
import com.kishor.repo.empRepo;

@Service
public class service {
@Autowired
empRepo empRepo;

@Autowired
empLogRepo empLogRepo;


public void registerUserData(employee emp, employee_log empLog) {
	// TODO Auto-generated method stub
	empRepo.save(emp);
	empLog.setEmpId(emp);
	empLogRepo.save(empLog);
}


public List<employee_log> chkLogin(String email) {
	// TODO Auto-generated method stub
	List<employee_log>emlog=empLogRepo.findAllByEmail(email);
	return emlog;
}


public List<employee_log> getAllDetails() {
	// TODO Auto-generated method stub
	List<employee_log> log=empLogRepo.findAll();
	return log;
}


public void deleteEmpById(int id) {
	// TODO Auto-generated method stub
	employee_log emp=empLogRepo.findById(id).get();
	int emid=emp.getEmpId().getId();
	empLogRepo.deleteById(id);
//	empRepo.deleteById(emid);
	
}


public employee_log viewById(int id) {
	// TODO Auto-generated method stub
	return empLogRepo.findById(id).get();
	
	
}


public void update(employee_log emplogdl) {
	// TODO Auto-generated method stub
	empLogRepo.save(emplogdl);

	
}


}
