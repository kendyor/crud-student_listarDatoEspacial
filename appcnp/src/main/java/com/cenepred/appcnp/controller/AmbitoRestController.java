package com.cenepred.appcnp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenepred.appcnp.dto.model.AmbitoDTO;
import com.cenepred.appcnp.service.AmbitoService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api/v1/ambitos")
public class AmbitoRestController {
	@Autowired
	private AmbitoService service;
	
	@GetMapping
	public  ResponseEntity<List<AmbitoDTO>> getAll(){
		System.out.println("Request list of ambitos espaciales.");
		List<AmbitoDTO> list = service.list();
		if(list ==null) {
			return new ResponseEntity<List<AmbitoDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<AmbitoDTO>>(list, HttpStatus.OK);
	}
}
