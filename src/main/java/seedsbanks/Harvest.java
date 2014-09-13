package main.java.seedsbanks;

import java.util.ArrayList;
import java.util.Date;

public class Harvest {
	public HarvestCode harvestCode;
	public Birth birth;
	public Variety variety;
	public Harvest mather;

	public Harvest(String uFarmerID, String uVarietyID, ArrayList<Birth> history, Date date){
		this.harvestCode = new HarvestCode(uFarmerID, uVarietyID, history);
		history.add(new Birth(date, uFarmerID, this.harvestCode.getHarvestCodeValidator()));
	}
}