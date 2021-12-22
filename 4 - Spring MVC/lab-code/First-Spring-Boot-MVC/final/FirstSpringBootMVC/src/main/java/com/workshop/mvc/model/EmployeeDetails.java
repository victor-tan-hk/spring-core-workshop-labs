package com.workshop.mvc.model;

public class EmployeeDetails {
  
  private String name;
  private String jobRole;
  private int age;
  
  public EmployeeDetails() {
    
  }
  
  public EmployeeDetails(String name, String jobRole, int age) {
    super();
    this.name = name;
    this.jobRole = jobRole;
    this.age = age;
  }



  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getJobRole() {
    return jobRole;
  }
  public void setJobRole(String jobRole) {
    this.jobRole = jobRole;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  
  

}
