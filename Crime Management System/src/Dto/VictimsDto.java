package Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VictimsDto {
	private String name;
	private int age;
	private String gender;
	private String address;
	private String description;

	@Override
	public String toString() {
		return "Victim's Name:- " + name +"\n"+
				"Age:- " + age +"\n"+
				"Gender:- " + gender +"\n"+
				"Address:- " + address +"\n"+
				"Description of Crime happend to Victim:- " + description +"\n";
	}
}
