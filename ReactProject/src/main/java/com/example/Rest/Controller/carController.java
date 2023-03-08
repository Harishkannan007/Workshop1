package com.example.Rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.Service.carService;
import com.example.Rest.model.cardetails;


@RestController
@CrossOrigin
public class carController {
	
	@Autowired
	
	carService cs;
	
	@PostMapping("/add")
	public cardetails addInfo(@RequestBody cardetails c)
	{
		return cs.add(c);
	}

	@GetMapping("/g")
	public List<cardetails> showDetails() {
		return cs.getDetails();

	}
	@GetMapping("/gg")
	
	public List<cardetails> info()
	{
		return cs.showInfo();
	}
	
	@PutMapping("/update")
	public cardetails updateInfo(@RequestBody cardetails st) {
		return cs.updateDetails(st);
	}
	@DeleteMapping("/deleteid/{carid}")
	   public String deleteCarId(@PathVariable("carid") int carid) {
	      cs.deleteCarById(carid);
	      return "Details deleted";
	}
}