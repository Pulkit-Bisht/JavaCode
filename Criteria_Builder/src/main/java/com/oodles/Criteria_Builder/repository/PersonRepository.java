package com.oodles.Criteria_Builder.repository;

import com.oodles.Criteria_Builder.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
