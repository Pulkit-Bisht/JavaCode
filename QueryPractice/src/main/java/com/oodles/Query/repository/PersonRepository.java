package com.oodles.Query.repository;

import com.oodles.Query.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Integer> {

//    Derived Query

    public List<Person> findByName(String name);
    public List<Person> findById(int name);
    public List<Person> findByNameAndCity(String name,String city);
    public  List<Person> findByNameStartingWith(String prefix);
    public List<Person> findByNameEndingWith(String postfix);
    public  List<Person>findByNameContaining(String words);

//    @Query(value = "Select * from Person where p_id=0",nativeQuery = true)
    @Query(value = "select per from Person per")
    public List<Person>Alldata();

    @Query(value = "select per from Person per Where  per.name=:n")

    public List<Person>getDataByName(@Param("n") String name);

    @Query(value = "select per from Person per Where per.name=:n and per.city=:c")
    public List<Person>getDataByNC(@Param("n") String name,@Param("c") String city);
}
