package com.poc.powerbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.powerbi.services.PowerBiService;

@RestController
@RequestMapping("/api")
public class PowerBiController {

	@Autowired
	private PowerBiService service;

	@GetMapping("/{id}")
	public ResponseEntity<?> getReportJSONFromPowerBi(@PathVariable("id") String id) {

		return service.getJson(id);
	}
}
