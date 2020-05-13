package com.gfa.petshelter.repositories;

import com.gfa.petshelter.models.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HumanRepository extends CrudRepository <Human, Long>{

  List<Human> findAll();
  Optional<Human> findById(Long id);
}
