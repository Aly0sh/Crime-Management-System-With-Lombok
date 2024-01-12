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
public class CriminalArrestedDto {
	String name;
	int age;
	String gender;
	String mark;
	String address;
	String policeStationname;
	
	@Override
	public String toString() {
		
		return "Criminal Name:- " + name +"\n"+
				"Age:- " + age +"\n"+
				"Gender:- " + gender +"\n"+
				"Identification Mark:- " + mark +"\n"+
				"Address:- " + address +"\n"+
				"P.S Name where Criminal Arrested:- " + policeStationname +"\n\n";
	}
}
