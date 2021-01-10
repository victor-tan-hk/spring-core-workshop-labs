package com.workshop.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Employee {
  
  private String name;
  private String background;
  private String country;
  private LinkedHashMap<String, String> countryMap;
  
  public Employee() {
    initializeCountries();
  }
  
  private void initializeCountries() {
    countryMap = new LinkedHashMap<String,String>();
    countryMap.put("USA", "United States of America");
    countryMap.put("IND", "India");
    countryMap.put("CHN", "China");
    countryMap.put("AUS", "Australia");
  }
  
  public LinkedHashMap<String, String> getCountryMap() {
    return countryMap;
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
