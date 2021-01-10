package com.workshop.mvc;


import java.util.LinkedHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {
  
  private static final Logger LOGGER = 
      LogManager.getLogger(EmployeeController.class.getName());
  
  @RequestMapping("/showForm")
  public String showForm(Model model) {
    
    Employee myEmployee = new Employee();
    model.addAttribute("employee",myEmployee);
    
    return "employee-form";
  }
  
  @ModelAttribute("countryMap")
  public LinkedHashMap<String, String> getCountryMap() {
    LinkedHashMap<String,String> countryMap = new LinkedHashMap<String,String>();
    countryMap.put("USA", "United States of America");
    countryMap.put("IND", "India");
    countryMap.put("CHN", "China");
    countryMap.put("AUS", "Australia");
    return countryMap;
  }  

  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("employee") Employee myEmployee) {
    
    LOGGER.info("Employee name : " + myEmployee.getName());
    LOGGER.info("Employee background: " + myEmployee.getBackground());
    LOGGER.info("Employee country of origin : " + myEmployee.getCountry());

    return "employee-details";
  }
  
  

}
