package telran.ashkelon2018;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import telran.ashkelon2018.person.service.PersonService;

@SpringBootApplication
public class PersonInheritanceMongoDbApplication implements CommandLineRunner{
	
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(PersonInheritanceMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// every time we start appl, it tries to add persons again
		// we need them just once - normally server works non-stop
//		List<Person> persons = new ArrayList<>();
//		Address[] addresses = {
//				new Address("Ashkelon", "Bar Kochba", 209, 100500),
//				new Address("Rehovod", "Plaut", 10, 3),
//				new Address("Holon", "Herzl", 3, 15)
//		};
//		persons.add(new Child("peter@gmail.com", "Peter", LocalDate.of(2014, 4, 12),
//				addresses[2], "Shalom"));
//		persons.add(new Child("vasya@gmail.com", "Vasya", LocalDate.of(2014, 4, 12),
//				addresses[2], "Shalom"));
//		persons.add(new Employee("john@gmail.com", "John", LocalDate.of(1996, 6, 15), 
//				addresses[1], "Motorolla", 16000));
//		persons.add(new Employee("jane@gmail.com", "Jane", LocalDate.of(1999, 11, 8), 
//				addresses[0], "IBM", 21000));
//		personService.addPersons(persons);
		
	}
}
