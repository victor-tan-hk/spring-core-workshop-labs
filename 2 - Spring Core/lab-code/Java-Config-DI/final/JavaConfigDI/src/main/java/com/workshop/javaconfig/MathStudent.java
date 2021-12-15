package com.workshop.javaconfig;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MathStudent implements Student {
  
  @Autowired
  private Random myRandomGenerator;

  public MathStudent() {
    System.out.println("MathStudent created");
  }
  
  @Override
  public void dailyActivity() {
    int randomNumber = myRandomGenerator.nextInt(10);
    System.out.println ("A random number betweeen 1 and 10 is : " + randomNumber);
  }

}
