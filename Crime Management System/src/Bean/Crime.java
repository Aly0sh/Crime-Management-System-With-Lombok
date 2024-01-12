package Bean;

import java.sql.Date;

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
public class Crime {
	private int crimeId;
	private String description;
	private int policeStationId;
	private String detailDescription;
	private String status;
	private Date date;
}
