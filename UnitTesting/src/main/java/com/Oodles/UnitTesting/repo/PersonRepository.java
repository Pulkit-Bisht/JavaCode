package com.Oodles.UnitTesting.repo;

import com.Oodles.UnitTesting.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

   // @Query(value = "SELECT CASE WHEN COUNT(s)> 0 THEN TRUE ELSE FROM Person s WHERE s.personId=?1",nativeQuery = true)
//    Boolean isPersonExistById(Integer id);

    @Query(value = "select per from Person per Where per.personal_Id=:n ")
    Boolean isPersonExistById(@Param("n") Integer id);
}
