package com.jdbc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
	@Autowired 
	Serviceclass service;
   @RequestMapping("/all")
   public List<Employee> returnAll()
   {
	   return service.returnAll();
   }
   @RequestMapping("/all/{id}")
   public Employee getEmp(@PathVariable Integer id)
   {
	   return service.getEmp(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="/all")
   public void addEmp(@RequestBody Employee emp)
   {
	    service.addEmp(emp);
   }
   @RequestMapping(method=RequestMethod.DELETE,value="/all/{id}")
   public void deleteEmp(@PathVariable Integer id)
   {
	   service.deleteEmp(id);
   }
   @RequestMapping(method=RequestMethod.PUT,value="/all/{id}")
   public void updateEmp(@RequestBody Employee emp,@PathVariable Integer id)
   {
	   service.updateEmp(id, emp);
   }
   
}
