package telran.ashkelon2018.person.service;

import java.util.List;

import telran.ashkelon2018.person.domain.Address;
import telran.ashkelon2018.person.domain.Person;

public interface PersonService {
	
	boolean addPerson(Person person);
	
	void addPersons(Iterable<Person> persons);
	
	Person getPerson(String email);
	
	boolean updateAddress(String email, Address address);
	
	Person removePerson(String email);
	
	List<Person> getPersonsByAge(int minAge, int maxAge);
	
	List<Person> getPersonsByCity(String city);
	
	List<Person> getEmployeesBySalary(int minSalary, int maxSalary);

}
