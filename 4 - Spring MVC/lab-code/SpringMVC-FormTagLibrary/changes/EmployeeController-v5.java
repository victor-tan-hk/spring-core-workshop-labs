package com.workshop.mvc;


import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {
  
  private static final Logger LOGGER = 
      LoggerFactory.getLogger(EmployeeController.class);
  
  @Value("#{${country.options}}")
  private Map<String, String> countryMap;
  
  @Value("${framework.options}")
  private String[]  frameworkList;
  
  @RequestMapping("/showForm")
  public String showForm(Model model) {
    
    Employee myEmployee = new Employee();
    model.addAttribute("employee",myEmployee);
    model.addAttribute("theCountryMap",countryMap);
    model.addAttribute("theFrameworkList",frameworkList);
    
    return "employee-form";
  }
  
  @ModelAttribute("statusMap")
  public LinkedHashMap<String, String> getStatusMap() {
    LinkedHashMap<String,String> statusMap = new LinkedHashMap<String,String>();
    statusMap.put("Citizen", "Citizen");
    statusMap.put("Permanent Resident", "Permanent Resident");
    statusMap.put("Work Visa", "Work Visa");
    return statusMap;
  }    
  

  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("employee") Employee myEmployee) {
    
    LOGGER.info("Employee name : " + myEmployee.getName());
    LOGGER.info("Employee background: " + myEmployee.getBackground());
    LOGGER.info("Employee country of origin : " + myEmployee.getCountry());
    LOGGER.info("Employee resident status : " + myEmployee.getStatus());
    
    LOGGER.info("Employee's framework abilities : ");
    int count = 1;
    for (String ability : myEmployee.getFrameworkAbilities())
      LOGGER.info(count++ + ") " + ability);

    return "employee-details";
  }
  
  

}
