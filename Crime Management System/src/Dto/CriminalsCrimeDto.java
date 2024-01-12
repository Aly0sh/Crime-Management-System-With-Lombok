package Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CriminalsCrimeDto {
	private String criminalName;
	private int age;
	private String gender;
	private String mark;
	private String address;
	private String description;
	
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
