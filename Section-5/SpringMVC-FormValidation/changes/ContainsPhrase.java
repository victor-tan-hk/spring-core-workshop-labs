package com.workshop.mvc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ContainsPhraseConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface ContainsPhrase {

  // define default phrase
  public String value() default "Spring";
  
  // define default error message
  public String message() default "Must involve work with Spring !";
  
  // define default groups
  public Class<?>[] groups() default {};
  
  // define default payloads
  public Class<? extends Payload>[] payload() default {};
}
