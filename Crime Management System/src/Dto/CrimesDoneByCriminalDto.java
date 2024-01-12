package Dto;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CrimesDoneByCriminalDto {
	private Date dateOfCrime;
	private String criminalName;
	private String description;
	private String detailDescription;

	@Override
	public String toString() {
		return "CrimesDoneByCriminal"+"\n"+"====================================="
	+"\n"+"Criminal Name:- " + criminalName+"\n"+"Date Of Crime:- " + dateOfCrime +"\n"+ 
	"Criminal description:- " + description +"\n"+ "Criminal detailDescription:- " + detailDescription+"\n";
	}
}
