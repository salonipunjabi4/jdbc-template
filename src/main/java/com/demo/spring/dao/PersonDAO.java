package com.demo.spring.dao;

import java.util.List;

import com.demo.model.Person;

public interface PersonDAO {
	
	Person getPersonById(Long id);// select * from person where id=? 

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}

//DAO-- Data Access Object-- it is responsible to write DataBase Logics

// 1.main-class
// 2.Model-- POJO Classes
// 3. DataBase Logic