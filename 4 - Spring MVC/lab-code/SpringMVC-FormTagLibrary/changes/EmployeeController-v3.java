package com.workshop.mvc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {
  
  private static final Logger LOGGER = 
      LoggerFactory.getLogger(EmployeeController.class);
  
  @RequestMapping("/showForm")
  public String showForm(Model model) {
    
    Employee myEmployee = new Employee();
    model.addAttribute("employee",myEmployee);
    
    return "employee-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("employee") Employee myEmployee) {
    
    LOGGER.info("Employee name : " + myEmployee.getName());
    LOGGER.info("Employee background: " + myEmployee.getBackground());
    LOGGER.info("Employee country of origin : " + myEmployee.getCountry());

    return "employee-details";
  }
  
  

}
