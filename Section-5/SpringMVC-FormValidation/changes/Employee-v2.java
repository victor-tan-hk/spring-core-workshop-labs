package com.workshop.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
  
  @NotNull
  @Size(min=1, message="Name is required !")
  private String name;

  @NotNull(message="Age is required !")
  @Min(value=12, message="Employee cannot be that young !")
  @Max(value=100, message="Employee cannot be that old !")
  private Integer age;
  

  public Employee() {
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
