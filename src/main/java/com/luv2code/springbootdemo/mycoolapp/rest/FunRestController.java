package com.luv2code.springbootdemo.mycoolapp.rest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// expose "/" that return "Hello World"
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the server is " + LocalDateTime.now();
	}
	
	
	@GetMapping("/human/{humanId}")
	public Human giveHumanDetails(@PathVariable int humanId) {
		Human theHuman = null;
		if(humanId == 5) {
		
		theHuman = new Human("female", 45, "Shirley", "Married");
		}else {
			theHuman = new Human("male", 24, "Mike", "Unmarried");
		}
		return theHuman;
	}
	
	@GetMapping("/human")
	public List<Human> giveAllHumanDetails() {
		List<Human> humans = new ArrayList<>();;
		 humans.add(new Human("female", 45, "Shirley", "Married"));
		 humans.add(new Human("male", 76, "Mark", "Married"));
		 humans.add(new Human("male", 35, "Frank", "Unmarried"));
		 humans.add(new Human("female", 45, "Kate", "Married"));
		 humans.add(new Human("male", 21, "Shawn", "Unmarried"));
		return humans;
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	// expose a new endpoint for "fortune"
	@GetMapping("/fortune")
	public String getFortune() {
		return "Today is your lucky day";
	}
	
}
