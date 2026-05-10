package za.co.soulstice.mongo.model;

import org.springframework.data.domain.Page;

import za.co.soulstice.mongo.model.SMS;

public class ReportsResponse {
	
	private Page<SMS> smsData;
	
	private String amountDeducted;

	public Page<SMS> getSmsData() {
		return smsData;
	}

	public void setSmsData(Page<SMS> smsData) {
		this.smsData = smsData;
	}

	public String getAmountDeducted() {
		return amountDeducted;
	}

	public void setAmountDeducted(String amountDeducted) {
		this.amountDeducted = amountDeducted;
	}

	public ReportsResponse(Page<SMS> smsData, String amountDeducted) {
		super();
		this.smsData = smsData;
		this.amountDeducted = amountDeducted;
	}
	
	

}
