package main.java.seedsbanks.controller;

import main.java.seedsbanks.Seed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeedController {
	
	@RequestMapping("/seed")
	public @ResponseBody Seed seed(
				@RequestParam(value="key") String key){
		return new Seed(key, "patatas");
	}
	
}
