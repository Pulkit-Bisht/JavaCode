package com.myproject.repository;

import com.myproject.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
    @Query(value = "select per from person per Where  per.personFirstName=:n")

    public List<Person> getDataByName(@Param("n") String name);

    @Query(value = "select per from person per Where  per.personEmail=:e")

    public List<Person> getDataByEmail(@Param("e") String name);

    @Query(value = "select per from person per Where  per.personId=:id")

    public List<Person> getDataById(@Param("id") String id);

    @Query("SELECT m FROM person m WHERE m.personFirstName LIKE %:p%")
    public List<Person>getDataPattern(@Param("p") String p);
}
