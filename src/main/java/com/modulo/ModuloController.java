package com.modulo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ModuloController {
	@Autowired
	private IModuloService service;

	@GetMapping(value = "/modulo")
	public String getProduct(Integer number) {

		return service.calculateFizzOrBuzz(number);
	}
}
