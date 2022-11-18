package com.kishor.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kishor.model.employee;
import com.kishor.model.employee_log;
import com.kishor.service.service;



@Controller
public class controller {
@Autowired
service service;
	
	
	
	//============================================
	
	//---------normal mappings----------------------------------------------
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	

	@RequestMapping("login")
	public String loginPage() {
		return "login";
	}
	@RequestMapping("index")
	public String indexPagenew() {
		return "index";
	}
	
	
// =============================================================================
	
	//-------register ---------------------------------------
	
	
	@RequestMapping("/registration" )
	public String regUser(Model m) {
	m.addAttribute("employee",new employee());
	m.addAttribute("employeeLog",new employee_log());
	return "registration";
		
	}
	@RequestMapping("/regUser")
	public String registerUser(@ModelAttribute("employee")employee emp,@ModelAttribute("employeeLog") employee_log empLog) {
		service.registerUserData(emp,empLog);
		return "login";
	}
	
	
	

// ==========================================================================================================
//----------LOGIN------------------logout----------------------------------------------
@PostMapping("/loginUser")
public String loginUserVal(@RequestParam("email")String email,@RequestParam("password")String password,Model m,HttpSession session) {
	System.out.println("hello login");
	List<employee_log>emplog=service.chkLogin(email);
	System.out.println(emplog);
	if(emplog.isEmpty()) {
		System.out.println("is empty");
		return "login";
		
	}
	else {
		System.out.println("else error");
		employee_log eml=emplog.get(0);
		if(eml.getPassword().equals(password)) {
			if(eml.getEmail().equals("admin@gmail.com")) {
				List<employee_log> alldtl=service.getAllDetails();
				m.addAttribute("adminuser",alldtl);
				return "admin";
			}
			
		session.setAttribute("userLoginDetails", eml);
		m.addAttribute("newUserDetails",eml);
		return "profilePage";
		
	}
		else {
			System.out.println("error");
			return "login";
		}
}
}
@RequestMapping("/logout")
public String logoutUser(HttpSession session) {
	session.invalidate();
	return "index";
}
//=============Delete and Update ===========================================

//--------------------------------------------------------------------------

@GetMapping("/deleteUser/{id}")
public String deleteUserData(@PathVariable("id")int id,Model m) {
	service.deleteEmpById(id);
	List<employee_log> alldtl=service.getAllDetails();
	m.addAttribute("adminuser",alldtl);
	return "admin";
	
}
@GetMapping("/updateUser/{id}")
public String updateUserData(@PathVariable("id")int id,Model m) {
	employee_log dtl=service.viewById(id);
	m.addAttribute("updtDetails",dtl);
	return "editform";
}
@PostMapping(value = "/updateUserDetails")
public String update(@ModelAttribute("employee")employee emp,@ModelAttribute("employeeLog") employee_log empLog,HttpSession session) {
	service.registerUserData(emp, empLog);
	session.invalidate();
	return "login";
}
}
