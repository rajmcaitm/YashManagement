package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Limit;

@RestController
public class LimitController {

	@Autowired(required=true)
	private Limit limit;
	
	@GetMapping("/limits")
	public Limit returnLimit() {
		
		return new Limit(limit.getMaximum(), limit.getMinimum());
	}
}
