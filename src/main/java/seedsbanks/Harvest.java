package main.java.seedsbanks;

import java.util.ArrayList;
import java.util.Date;

public class Harvest {
	public HarvestCode harvestCode;

	public Harvest(String uFarmerID, String uSeedID, ArrayList<Birth> history, Date date){
		this.harvestCode = new HarvestCode(uFarmerID, uSeedID, history);
		history.add(new Birth(date, uFarmerID, this.harvestCode.getHarvestCodeValidator()));
	}
}
