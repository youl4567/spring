package com.callor.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.food.service.FoodService;

@Controller
@RequestMapping(value = "/food")
public class FoodController {
	
	private final FoodService foodService;
	public FoodController(FoodService foodService) {
		this.foodService = foodService;
	}
	
	@RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
	public String home() {
		String qeuryString = foodService.queryString(null);
		foodService.getFoodItems(qeuryString);
		return "home";
		
	}

}
