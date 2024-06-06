package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.model.Person;
import com.demo.spring.config.AppConfig;
import com.demo.spring.dao.PersonDAO;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonDAO personDAO = context.getBean(PersonDAO.class);

		/*
		 * System.out.println("List of person is:");
		 * 
		 * for (Person p : personDAO.getAllPersons()) { System.out.println(p); }
		 */

		/*
		 * System.out.println("\nGet person with ID 4");
		 * 
		 * Person personById = personDAO.getPersonById(4l);
		 * System.out.println(personById);
		 */

		
		 System.out.println("\nCreating person: "); Person person = new Person(6L, 36,
		 "Sergey", "Emets"); System.out.println(person);
		 
		 personDAO.createPerson(person);
		 
		 System.out.println("\nList of person is:");
		 
		 //for (Person p : personDAO.getAllPersons()) { System.out.println(p); }
		 

//		System.out.println("\nUpdate person with ID 4");
//
//		Person pperson = personDAO.getPersonById(1l);
//
//		pperson.setLastName("Black");
//		personDAO.updatePerson(pperson);
//
//		System.out.println("\nList of person is:");
//		for (Person p : personDAO.getAllPersons()) {
//			System.out.println(p);
//		}

		/*
		 * System.out.println("\nDeleting person with ID 4"); if
		 * (personDAO.deletePerson(personDAO.getPersonById(4l))) {
		 * System.out.println("record deleted successfully"); }
		 */

		context.close();
	}
}

/*
 * Gone through this problem yesterday and Here is the solution.
 * 
 * Open Eclipse Open window in menu bar -> preferences -> java ->installed jre
 * add new jre which is installed in system(c:program files->java->jre->bin) add
 * it. Select the new added jre and run it
 */
