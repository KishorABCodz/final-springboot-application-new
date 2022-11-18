package com.kishor.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employeeLog")
public class employee_log {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	
private String email;
	
private String password;

	@OneToOne(cascade = CascadeType.ALL)
private employee empId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public employee getEmpId() {
		return empId;
	}
	public void setEmpId(employee empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "employee_log [id=" + id + ", email=" + email + ", password=" + password + ", empId=" + empId + "]";
	}

}
