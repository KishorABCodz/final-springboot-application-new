package com.kishor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishor.model.employee_log;

public interface empLogRepo extends JpaRepository<employee_log, Integer> {
List<employee_log> findAllByEmail(String email);
}
