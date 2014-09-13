package main.java.seedsbanks.controller;

import main.java.seedsbanks.Variety;
import main.java.seedsbanks.dao.VarietyDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/variety")
public class VarietyController {
	private VarietyDao varietyDao;
	
	/*@Autowired
	public void setVarietyDao(VarietyDao varietyDao) {
	this.varietyDao = varietyDao;
	}*/

	
	@RequestMapping(value = "/{uVarietyID}", method = RequestMethod.GET)
	@ResponseBody
	public Variety getVariety(
			@PathVariable("uVarietyID") String uVarietyID){
		return new Variety(uVarietyID, "patatas rojas");//varietyDao.getVariety(uVarietyID);
	}
	
	/*@RequestMapping(method = RequestMethod.POST)
	public View saveVariety(@RequestBody Variety variety) {
		varietyDao.saveVariety(variety);
		return new RedirectView("/variety/" + variety.getuVarietyID());
	}*/

	
}
