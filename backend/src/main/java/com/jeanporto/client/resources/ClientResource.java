package com.jeanporto.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeanporto.client.entities.Client;

@RestController
@RequestMapping( value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>>findALl(){
		List<Client> list = new ArrayList<>();
		return ResponseEntity.ok().body(list);
	}	
}
