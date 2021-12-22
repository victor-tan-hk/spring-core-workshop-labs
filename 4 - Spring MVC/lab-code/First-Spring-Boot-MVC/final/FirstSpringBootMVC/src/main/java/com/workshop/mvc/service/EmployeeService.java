package com.workshop.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mvc.model.EmployeeDetails;
import com.workshop.mvc.repository.EmployeeRepository;

@Service
public class EmployeeService {
  
  @Autowired
  EmployeeRepository repositoryToUse;
  
  public List<EmployeeDetails> getAllEmployees() {
    return repositoryToUse.getAllEmployees();
  }

  public EmployeeDetails findByEmployeeName(String name) {
    return repositoryToUse.findByEmployeeName(name);
  }

  public void addNewEmployee(EmployeeDetails newEmployee) {
    repositoryToUse.addNewEmployee(newEmployee);
  }

}
