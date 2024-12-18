package com.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/")
	public ResponseEntity<String> getSomething(){
		
		return new ResponseEntity<String>("its working",HttpStatus.OK);
	}
@PostMapping("/create")
	public ResponseEntity<String > post(@RequestBody Employee employee){
	employeeService.createEmployee(employee);
		
		return  new ResponseEntity<String>("item posted",HttpStatus.OK);
	}
@PutMapping("/edit/{id}")
public ResponseEntity<String > update(@RequestBody Employee employee, @PathVariable int id){
	employeeService.update(id);
	return  new ResponseEntity<String>("item updated",HttpStatus.OK);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String > delete(@PathVariable int id){
	employeeService.delete(id);
	return  new ResponseEntity<String>("item deleted",HttpStatus.OK);
}
}
