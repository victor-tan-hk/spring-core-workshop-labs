package com.workshop.mvc.repository;

import java.util.List;

import com.workshop.mvc.model.EmployeeDetails;

public interface EmployeeRepository {
  
  public List<EmployeeDetails> getAllEmployees();
  
  public EmployeeDetails findByEmployeeName(String name);
  
  public void addNewEmployee(EmployeeDetails newEmployee);
  
  

}
