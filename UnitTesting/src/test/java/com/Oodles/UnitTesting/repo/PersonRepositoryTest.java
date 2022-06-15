package com.Oodles.UnitTesting.repo;

import com.Oodles.UnitTesting.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository repository;

    @Test
    void isPersonExistById() {
        //first create person then test
//        Person p = new Person(124, "Pooja", "KSP");
        repository.delete(123);
//        Boolean exist = repository.isPersonExistById(124);
//        now we check
//        assertThat(exist).isFalse();


    }
}