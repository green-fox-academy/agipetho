package com.gfa.petshelter.repositories;

import com.gfa.petshelter.models.Human;
import com.gfa.petshelter.models.Pet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {

  List<Human> findAll();

  Optional<Human> findById(Long id);

  Optional<Human> findByName(String name);

  //@Query(value="SELECT p.name FROM human h, pet p WHERE p.human_id = h.id AND age > :referenceAge " ,nativeQuery = true)
  @Query(value = "SELECT p.name FROM pet p JOIN human h ON h.id = p.human_id WHERE age > :referenceAge ", nativeQuery = true)
  List<String> findAllPetsWhereHumansWithAgeGreaterThan(int referenceAge);

}
