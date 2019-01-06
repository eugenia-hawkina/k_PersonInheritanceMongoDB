package telran.ashkelon2018.person.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode (of = {"email"})
@ToString
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) 
// which class to use for real object
public abstract class Person {
	@Id
	// @id m.b. necessarily indicated if _id has different name (e.g.: e-mail) 
	// if field is called id - @id c.b. omitted
	String email;
	@Setter String name;
	@JsonFormat (pattern = "yyyy-MM-dd")
	LocalDate birthDate;
	@Setter Address address;

}
