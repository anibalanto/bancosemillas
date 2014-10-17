package main.java.seedsbanks.dao;

import java.util.ArrayList;

import main.java.seedsbanks.domain.Variety;

public interface VarietyDao {

	public ArrayList<Variety> getSeed();
	public Variety getVariety(String uVarietyID);
	public void saveVariety(Variety variety);
}
