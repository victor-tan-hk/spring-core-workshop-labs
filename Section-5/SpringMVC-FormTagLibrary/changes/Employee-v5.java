package com.workshop.mvc;

public class Employee {
  
  private String name;
  private String background;
  private String country;
  private String status;
  private String[] frameworkAbilities;
  
  
  public Employee() {
  }
  
  
  public String[] getFrameworkAbilities() {
    return frameworkAbilities;
  }

  public void setFrameworkAbilities(String[] frameworkAbilities) {
    this.frameworkAbilities = frameworkAbilities;
  }


  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  
  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
