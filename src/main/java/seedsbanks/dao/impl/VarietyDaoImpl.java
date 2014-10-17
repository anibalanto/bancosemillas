package main.java.seedsbanks.dao.impl;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.java.seedsbanks.dao.VarietyDao;
import main.java.seedsbanks.domain.Variety;

@Component
public class VarietyDaoImpl implements VarietyDao {
	
	//@Autowired
	//private DataSource dataSource;
	
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
