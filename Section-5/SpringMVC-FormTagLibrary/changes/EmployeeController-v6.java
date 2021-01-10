package com.workshop.mvc;


import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("employee")
@PropertySource(value="classpath:frameworks.properties")
public class EmployeeController {
  
  private static final Logger LOGGER = 
      LogManager.getLogger(EmployeeController.class.getName());
  
  @Value("#{countryMap}")
  private Map<String, String> countryMap;
  
  @Value("${framework.options}")
  private String[]  frameworkList;
  
  @RequestMapping("/showForm")
  public ModelAndView showForm(Model model) {
    
    Employee myEmployee = new Employee();
    
    ModelAndView mav = new ModelAndView("employee-form");
    
    mav.addObject("employee",myEmployee);
    mav.addObject("theCountryMap",countryMap);
    mav.addObject("theFrameworkList",frameworkList);
    
    return mav;
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
