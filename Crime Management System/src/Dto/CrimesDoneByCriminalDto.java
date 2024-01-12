package Dto;

import java.sql.Date;

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
public class CrimesDoneByCriminalDto {
	Date dateOfCrime;
	String criminalName;
	String description;
	String detailDescription;

	@Override
	public String toString() {
		return "CrimesDoneByCriminal"+"\n"+"====================================="
	+"\n"+"Criminal Name:- " + criminalName+"\n"+"Date Of Crime:- " + dateOfCrime +"\n"+ 
	"Criminal description:- " + description +"\n"+ "Criminal detailDescription:- " + detailDescription+"\n";
	}
}
