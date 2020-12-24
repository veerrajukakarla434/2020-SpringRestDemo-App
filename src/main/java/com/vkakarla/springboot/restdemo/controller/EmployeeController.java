package com.vkakarla.springboot.restdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {
   
	  @RequestMapping(value = "emp/{name}", method = RequestMethod.GET, produces = "application/json")
	  public @ResponseBody String getEmployee(@PathVariable String name){
		 
		  String response = null;
		  response = "Employee Name : "+name;
		  return response;
	  }
	  
	  @RequestMapping(value = "/{empName}", method = RequestMethod.GET, produces = "application/json")
	  public ResponseEntity<Object>  getEmployees(@PathVariable String empName){
		  
		  ResponseEntity<Object> response = null;
		  response = new ResponseEntity<>("Employee Name"+empName, HttpStatus.OK);
		  return response;
	  } 
	  
}
