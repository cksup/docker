package com.docker.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cks {
	
	@GetMapping("/cks1")
	public String cks1() {
		return "chang 안녕!!!";
	}
}
