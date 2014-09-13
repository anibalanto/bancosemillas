package main.java.seedsbanks.dao;

import java.util.ArrayList;

import main.java.seedsbanks.Variety;

public class VarietyDao {
	public ArrayList<Variety> getSeed(){
		return new ArrayList<Variety>();
	}
	
	public Variety getVariety(String uVarietyID){
		return new Variety(uVarietyID, "patatas rojas");
	}
	
	public void saveVariety(Variety variety){
		variety.setuVarietyID("AABBCCDD");
	}
}
