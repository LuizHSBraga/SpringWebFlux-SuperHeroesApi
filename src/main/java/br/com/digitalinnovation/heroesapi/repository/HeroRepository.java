package br.com.digitalinnovation.heroesapi.repository;

import br.com.digitalinnovation.heroesapi.model.Hero;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends ReactiveMongoRepository <Hero, String> {



}
