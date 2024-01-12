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
public class VictimsDto {
	String name;
	int age;
	String gender;
	String address;
	String description;

	@Override
	public String toString() {
		return "Victim's Name:- " + name +"\n"+
				"Age:- " + age +"\n"+
				"Gender:- " + gender +"\n"+
				"Address:- " + address +"\n"+
				"Description of Crime happend to Victim:- " + description +"\n";
	}
}
