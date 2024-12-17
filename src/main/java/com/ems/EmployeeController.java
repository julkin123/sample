package com.ems;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@GetMapping("/")
	public ResponseEntity<String> getSomething(){
		
		return new ResponseEntity<String>("its working",HttpStatus.OK);
	}

}
