package Dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CriminalsCrimeDto {
	String criminalName;
	int age;
	String gender;
	String mark;
	String address;
	String description;
	
	@Override
	public String toString() {
		
		return "Criminal Name:- " + criminalName +"\n"+
				"Age:- " + age +"\n"+
				"Gender:- " + gender +"\n"+
				"Identification Mark:- " + mark +"\n"+
				"Address:- " + address +"\n"+
				"Description of Crime:- " + description +"\n";
	}
}
