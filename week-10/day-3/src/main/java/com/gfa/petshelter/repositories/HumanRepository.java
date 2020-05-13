package com.gfa.petshelter.repositories;

import com.gfa.petshelter.models.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends CrudRepository <Human, Long>{

  List<Human> findAll();
}
