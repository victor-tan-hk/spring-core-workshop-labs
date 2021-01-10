package com.workshop.mvc;


import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {
  
  private static final Logger LOGGER = 
      LogManager.getLogger(EmployeeController.class.getName());
  
  @Value("#{countryMap}")
  private Map<String, String> countryMap;
  
  @RequestMapping("/showForm")
  public String showForm(Model model) {
    
    Employee myEmployee = new Employee();
    model.addAttribute("employee",myEmployee);
    model.addAttribute("theCountryMap",countryMap);
    
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
