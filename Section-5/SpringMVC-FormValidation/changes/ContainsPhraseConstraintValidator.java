package com.workshop.mvc;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContainsPhraseConstraintValidator 
  implements ConstraintValidator<ContainsPhrase, String> {

  private String phraseToLookFor;
  
  @Override
  public void initialize(ContainsPhrase containsPhrase) {
    phraseToLookFor = containsPhrase.value();
  }

  @Override
  public boolean isValid(String valueFromUser, 
            ConstraintValidatorContext theConstraintValidatorContext) {
    
    String valueFromUserLC = valueFromUser.toLowerCase();
    String phraseToLookForLC = phraseToLookFor.toLowerCase();
    
    return valueFromUserLC.contains(phraseToLookForLC);
  }
}

