package main.java.seedsbanks.controller;

import java.util.ArrayList;
import java.util.Date;

import main.java.seedsbanks.Birth;
import main.java.seedsbanks.Harvest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HarvestController {
	
	@RequestMapping("/harvest")
	public @ResponseBody ArrayList<Birth> harvest(){
		ArrayList<Birth> history = new ArrayList<Birth>();
		Harvest harvest1 = new Harvest("1B1F4A28", "236B5CA3", history, new Date());
		Harvest harvest2 = new Harvest("2F1B48A2", "236B5CA3", history, new Date());
		Harvest harvest3 = new Harvest("1483ABF2", "236B5CA3", history, new Date());
		Harvest harvest4 = new Harvest("BA24481F", "236B5CA3", history, new Date());
		Harvest harvest5 = new Harvest("1B48FA25", "236B5CA3", history, new Date());
		
		
		return history;
	}
	
}
