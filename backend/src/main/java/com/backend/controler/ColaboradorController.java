package com.backend.controler;

import org.springframework.web.bind.annotation.RestController;

import com.backend.business.ColaboradorBusiness;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController()
public class ColaboradorController {
	
	@Autowired
	ColaboradorBusiness colaboradorBusiness;
	
	@GetMapping
	public String get() {
		return "oi";
	}

}
