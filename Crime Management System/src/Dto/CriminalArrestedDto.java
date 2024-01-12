package Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CriminalArrestedDto {
	private String name;
	private int age;
	private String gender;
	private String mark;
	private String address;
	private String policeStationname;
	
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
