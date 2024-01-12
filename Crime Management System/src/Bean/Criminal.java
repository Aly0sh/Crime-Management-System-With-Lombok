package Bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Criminal {

	private String name;
	private int age;
	private String gender;
	private String mark;
	private String address;
	private int policeStationId;  //Police Station Id where criminal first arrested
	
}
