package telran.ashkelon2018.person.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telran.ashkelon2018.person.dao.PersonRepository;
import telran.ashkelon2018.person.domain.Address;
import telran.ashkelon2018.person.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository repository;

	@Override
	public boolean addPerson(Person person) {
		if(repository.existsById(person.getEmail())) {
			return false;
		}
		repository.save(person);
		return true;
	}

	@Override
	public void addPersons(Iterable<Person> persons) {
		repository.saveAll(persons);
	}

	@Override
	public Person getPerson(String email) {
		return repository.findById(email).orElse(null);		
	}

	@Override
	public boolean updateAddress(String email, Address address) {
		Person person = repository.findById(email).orElse(null);
//	OR:	Person person = getPerson(email);
		if(person == null) {
			return false;
		}
		person.setAddress(address);
		repository.save(person);
		return true;
	}

	@Override
	public Person removePerson(String email) {
		Person person = repository.findById(email).orElse(null);
		repository.deleteById(email);
		return person;
	}

	@Override
	public List<Person> getPersonsByAge(int minAge, int maxAge) {
		LocalDate from = LocalDate.now().minusYears(maxAge);
		LocalDate to = LocalDate.now().minusYears(minAge);
		return repository.findByBirthDateBetween(from, to);
	}

	@Override
	public List<Person> getPersonsByCity(String city) {
		return repository.findByAddressCity(city);
	}

	@Override
	public List<Person> getEmployeesBySalary(int minSalary, int maxSalary) {
		return repository.findBySalaryBetween(minSalary, maxSalary);
	}

}
