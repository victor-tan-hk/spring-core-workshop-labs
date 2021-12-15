package com.workshop.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class JoggingExercise extends Exercise {
  
  @Autowired
  private SimpleCounter counter;
  
  @Override
  public void doExercise() {
    counter.increment();
    System.out.println ("Value of counter : " + counter.getMyCount());
    System.out.println ("Jogging is fun !");
  }

}



