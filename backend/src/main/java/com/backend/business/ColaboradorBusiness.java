package com.backend.business;

import org.springframework.stereotype.Service;

import com.backend.repository.ColaboradorRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service

public class ColaboradorBusiness {
	
	@Autowired
	ColaboradorRepository colaboradorRepository;

}
