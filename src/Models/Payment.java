package Models;

import java.util.List;

public class Payment extends BaseModel {
	private PaymentStatus paymentStatus;
	private List<PaymentMode> paymentModes;
	private long refId;
	private int amount;
	
}
