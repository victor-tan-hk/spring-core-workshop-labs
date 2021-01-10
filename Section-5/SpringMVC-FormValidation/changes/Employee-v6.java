package com.workshop.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
  
  @NotNull(message="Name is required !")
  @Size(min=1, message="Name is required !")
  private String name;

  @NotNull(message="Age is required !")
  @Min(value=12, message="Employee cannot be that young !")
  @Max(value=100, message="Employee cannot be that old !")
  private Integer age;
  
  @NotNull(message="Email is required !")
  @Pattern(regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", 
      message="A valid email address format is required !")
  private String email;
  
  @ContainsPhrase(value="Java EE", 
      message="Must involve work with Java EE")
  private String jobDescription;
  
  
  public Employee() {
  }
  
  public String getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }  
  
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
