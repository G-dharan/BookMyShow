package Models;

import java.util.Date;

public class Show extends BaseModel {
	private ShowType showType;
	private Date StartTime;
	private Date endTime;
	
	
	Show(ShowType showType) {
		this.showType = showType;
	}
	
	
}
