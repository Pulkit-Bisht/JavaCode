package com.oodles.Query;

import com.oodles.Query.model.Person;
import com.oodles.Query.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class QueryPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(QueryPracticeApplication.class, args);
		PersonRepository personRepository=context.getBean(PersonRepository.class);
	//	Insert Data
/*
		Person p=new Person();
		p.setName("Pushkar Bisht");
		p.setMobno("7017698507");
		p.setCompany("Oodles");
		p.setCity("Kashipur");

		Person p1=new Person();
		p1.setName("Pushkar Bisht");
		p1.setMobno("7017698507");
		p1.setCompany("Oodles");
		p1.setCity("Kashipur");

		System.out.println(personRepository.save(p));
		List<Person> personList= Arrays.asList(p,p1);

		Iterable<Person>per=personRepository.saveAll(personList);

		per.forEach(person -> {
			System.out.println(person);
		});
*/


//		Update
/*
		Optional<Person>optionalPerson =personRepository.findById(6);
		Person person=optionalPerson.get();
//		System.out.println(person);
		person.setName("xyz");
		personRepository.save(person);

 */

		//Getdata
/*
		Iterable<Person>personIterable=personRepository.findAll();
		personIterable.forEach(person -> {
			System.out.println("Name: "+person.getName()+", City: "+person.getCity()+", Mobile: "+person.getMobno());
		});

 */

/*
//		delete Person

//		personRepository.deleteById(6);

	Iterable<Person>personIterable=	personRepository.findAll();
	personRepository.deleteAll(personIterable);

 */

		//Derived Query

//		List<Person>person=	personRepository.findById(7);
//		System.out.println(person);
//		person.forEach(person1->{
//			System.out.println("Name: "+person1.getName()+", City: "+person1.getCity()+", Mobile: "+person1.getMobno());
//		});

//		List<Person>personList=personRepository.findByNameAndCity("Pushkar Bisht","Kashipur");
//		System.out.println(personList);

//		List<Person>personList=personRepository.findByNameStartingWith("Pus");
//		System.out.println(personList);

//		List<Person>personList=personRepository.findByNameStartingWith("P");
//		System.out.println(personList);

//		List<Person>personList=personRepository.findByNameContaining("z");
//		System.out.println(personList);

		//	List<Person>personList=personRepository.Alldata();
//		System.out.println(personList);
//		personList.forEach(person -> {System.out.println(person);});

//		List<Person> personList=personRepository.getDataByName("Pushkar Bisht");
//		System.out.println(personList);

//		List<Person>personList=personRepository.getDataByNC("Pushkar Bisht","Kashipur");
//				System.out.println(personList);

		personRepository.Delete();

	}

}
