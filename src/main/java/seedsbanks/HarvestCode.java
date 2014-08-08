package main.java.seedsbanks;


import java.io.UnsupportedEncodingException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import java.util.Random;

public class HarvestCode {
	private String uHarvestId;
	private String harvestCodeValidator;

	//TODO luego tiene que ser reemplazado por un valor en al base de datos
	private final AtomicLong counter = new AtomicLong();
	
	public HarvestCode(String uFarmerID, String uSeedID, ArrayList<Birth> history){
		this.uHarvestId = this.generateUHarvestId(uFarmerID, uSeedID, counter.intValue());
		if (history.size() > 0){
			String harvestCodeValidatorAnt = history.get(history.size()-1).getHarvestCodeValidator();
			this.harvestCodeValidator = this.generateHarvestCodeValidator(uFarmerID, uSeedID, harvestCodeValidatorAnt);
		}else{
			this.harvestCodeValidator = this.generateHarvestCodeValidator(uFarmerID, uSeedID);
		}
	}
	
	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len/2];
		for (int i = 0; i < len; i += 2) {
			data[i/2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
								+ Character.digit(s.charAt(i+1), 16));
		}
		return data;
	}
	
	private String generateHarvestCodeValidator(String uFarmerID,
			String uSeedID, String harvestCodeValidatorAnt) {
		byte[] uFarmerIDBytes = this.hexStringToByteArray(uFarmerID);
		byte[] uSeedIDBytes = this.hexStringToByteArray(uSeedID);
		
		byte[] harvestCodeValidatorAntBytes = this.hexStringToByteArray(harvestCodeValidatorAnt);
		
		byte[] harvestCodeValidatorBytes = new byte[4];
		
		int i = 0;
		for (byte uFarmerIDByteI : uFarmerIDBytes){
			harvestCodeValidatorBytes[i] = (byte) (uFarmerIDByteI ^ uSeedIDBytes[i] ^ harvestCodeValidatorAntBytes[i]);
			i++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (byte b : harvestCodeValidatorBytes) {
			sb.append(String.format("%02X ", b));
		}

		return sb.toString().replace(" ", "");
	}
	
	private String generateHarvestCodeValidator(String uFarmerID,
			String uSeedID) {
		byte[] uFarmerIDBytes = this.hexStringToByteArray(uFarmerID);
		byte[] uSeedIDBytes = this.hexStringToByteArray(uSeedID);
		byte[] harvestCodeValidatorAntBytes = new byte[4];
		
		new Random().nextBytes(harvestCodeValidatorAntBytes);
		
		byte[] harvestCodeValidatorBytes = new byte[4];
		
		int i = 0;
		for (byte uFarmerIDByteI : uFarmerIDBytes){
			harvestCodeValidatorBytes[i] = (byte) (uFarmerIDByteI ^ uSeedIDBytes[i] ^ harvestCodeValidatorAntBytes[i]);
			i++;
		}
		
		StringBuilder sb = new StringBuilder();
		for (byte b : harvestCodeValidatorBytes) {
			sb.append(String.format("%02X ", b));
		}

		return sb.toString().replace(" ", "");
	}

	private String generateUHarvestId(String uFarmerID, String uSeedID,
			int intValue) {
		// TODO Auto-generated method stub
		return uFarmerID + "/" + uSeedID + "/" + intValue;
	}
	
	public String getUHarvestId() {
		return uHarvestId;
	}

	public String getHarvestCodeValidator() {
		return harvestCodeValidator;
	}
}

