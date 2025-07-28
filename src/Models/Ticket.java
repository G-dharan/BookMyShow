package Models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel{
	private String cityName;
	private String movieName;
	private String theatreName;
	private String screenName;
	private ShowType showType;
	private List<Seat> seats;
	private SeatType seatType;
	private Date startTime;
	private Date endTime;	
	private PaymentStatus paymentStatus;
	private List<PaymentMode> paymentModes;
	private long refId;
	private int amount;
	private List<Feature> features;
	
	
}
