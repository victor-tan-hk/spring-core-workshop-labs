package com.workshop.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
  
  @NotNull
  @Size(min=1)
  private String name;
  
  public Employee() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
