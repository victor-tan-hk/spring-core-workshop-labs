package com.workshop.mvc.repository;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.workshop.mvc.model.EmployeeDetails;

@Repository
public class InMemoryEmployeeRepository implements EmployeeRepository {
  
  private static final Logger log = LoggerFactory.getLogger(InMemoryEmployeeRepository.class);
  
  private List<EmployeeDetails> employeesList;
  
  public InMemoryEmployeeRepository() {
    
    log.info("Initializing InMemoryEmployeeRepository");
    
    employeesList = new ArrayList<EmployeeDetails>();  
    
    // Add in some dummy employees to initialize the list
    
    EmployeeDetails employee1 = new EmployeeDetails("Peter", "Developer", 35);
    EmployeeDetails employee2 = new EmployeeDetails("Susan", "Project Manager", 22);
    EmployeeDetails employee3 = new EmployeeDetails("Ahmad", "Tester", 46);
    
    employeesList.add(employee1);
    employeesList.add(employee2);
    employeesList.add(employee3);
    
  }

  @Override
  public List<EmployeeDetails> getAllEmployees() {
    return employeesList;
  }

  @Override
  public EmployeeDetails findByEmployeeName(String name) {
    
    for (EmployeeDetails ed : employeesList) {
      if (ed.getName().contentEquals(name))
        return ed;
    }
    return null;
  }

  @Override
  public void addNewEmployee(EmployeeDetails newEmployee) {
    
    employeesList.add(newEmployee);
    
  }

}
