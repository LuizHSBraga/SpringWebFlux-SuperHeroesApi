package br.com.digitalinnovation.heroesapi.exception;

public class HeroNotFoundException extends RuntimeException{

  public HeroNotFoundException(String heroId) {
    super("Hero not found with id " + heroId);
  }

}
