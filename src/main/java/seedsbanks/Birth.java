package main.java.seedsbanks;

import java.util.Date;

public class Birth {
	private Date date;
	private String uFarmerID;
	private String harvestCodeValidator; 
	
	public Birth(Date date, String uFarmerID, String harvestCodeValidator){
		this.date = date;
		this.uFarmerID = uFarmerID;
		this.harvestCodeValidator = harvestCodeValidator;
	}

	public Date getDate() {
		return date;
	}
	
	public String getUFarmerID() {
		return uFarmerID;
	}
	
	public String getHarvestCodeValidator() {
		return harvestCodeValidator;
	}

}
