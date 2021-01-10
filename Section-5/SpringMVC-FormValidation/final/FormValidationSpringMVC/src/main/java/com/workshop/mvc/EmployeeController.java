package com.workshop.mvc;


import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("employee")
public class EmployeeController {
  
  private static final Logger LOGGER = 
      LogManager.getLogger(EmployeeController.class.getName());
 
  
  @InitBinder
  public void initBinder(WebDataBinder dataBinder) {
    
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
    
    dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
  }

  
  @RequestMapping("/showForm")
  public String showForm(Model model) {
    
    Employee myEmployee = new Employee();
    model.addAttribute("employee",myEmployee);
    
    return "employee-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@Valid @ModelAttribute("employee") Employee myEmployee,
      BindingResult bindingResult) {
    
    if (bindingResult.hasErrors()) {
      LOGGER.info("Errors in form : " + bindingResult);
      return "employee-form";
    }
    else {
      return "employee-details";
    }

    

  }
  
  

}
