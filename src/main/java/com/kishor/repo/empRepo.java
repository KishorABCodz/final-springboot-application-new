package com.kishor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishor.model.employee;

public interface empRepo extends JpaRepository<employee, Integer>{

}
