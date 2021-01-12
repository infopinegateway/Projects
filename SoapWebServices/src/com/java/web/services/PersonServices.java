package com.java.web.services;

import com.java.web.beans.Person;

public interface PersonServices {
	
	public boolean addPerson(Person p);
	
	public boolean deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}
