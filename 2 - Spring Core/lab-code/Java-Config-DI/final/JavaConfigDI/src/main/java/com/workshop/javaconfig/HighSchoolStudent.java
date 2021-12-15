package com.workshop.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HighSchoolStudent implements Student {
  
  @Autowired
  @Qualifier("joggingExercise") 
  private Exercise myExercise;
  
  @Value("${myHighSchool}")
  private String highSchoolName;

  @Value("${myAge}")
  private int age;
  
  public HighSchoolStudent() {
    System.out.println("HighSchoolStudent created");
  }
  
  public Exercise getMyExercise() {
    return myExercise;
  }

  public String getHighSchoolName() {
    return highSchoolName;
  }
  
  public int getAge() {
    return age;
  }

  @Override
  public void dailyActivity() {
    System.out.println ("Going to high school : " + highSchoolName);
    System.out.println ("My age is : " + age);    
    myExercise.doExercise();
  }


}
