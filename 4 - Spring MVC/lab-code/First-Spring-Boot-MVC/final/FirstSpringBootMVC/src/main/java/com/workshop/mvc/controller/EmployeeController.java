package com.workshop.mvc.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.workshop.mvc.model.EmployeeDetails;
import com.workshop.mvc.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
  
  @Autowired
  EmployeeService employeeService;
  
  private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
  
  @GetMapping("/newEmployee")
  public String showFormForNewEmployee() {
    return "new-employee-form";
  }
  
  @GetMapping("/showEmployees")
  public String showAllEmployees(Model model) {
    
    model.addAttribute("employees",employeeService.getAllEmployees());
    return "display-all-employees";
    
  }
  
  @GetMapping("/getEmployee")
  public String showFormForSingleEmployee() {
    return "get-employee-form";
  }
  
  
  @PostMapping("/processSingleEmployee")
  public String getSingleEmployee(
      @RequestParam("employeeName") String theName, ModelMap model 
      ) {
    
    EmployeeDetails employeeToReturn = employeeService.findByEmployeeName(theName);
    
    if (employeeToReturn == null) {
      employeeToReturn = new EmployeeDetails(theName + " not found ","unknown",0);
    }
    
    model.addAttribute("employee",employeeToReturn);

    
    return "display-single-employee";
    
  }
  

  @PostMapping("/processNewEmployee")
  public String addNewEmployee(
      @RequestParam("employeeName") String theName,
      @RequestParam("employeeRole") String theRole, 
      @RequestParam("employeeAge") Integer theAge
      ) {
    
    log.info("Adding a new employee");
    log.info("Employee name : " + theName);
    log.info("Employee Role : " + theRole);
    log.info("Employee Age : " + theAge);
    
    employeeService.addNewEmployee(new EmployeeDetails(theName, theRole, theAge));
    
    return "redirect:/";
    
  }  

}
