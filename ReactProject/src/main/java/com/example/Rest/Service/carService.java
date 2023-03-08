package com.example.Rest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Rest.Repo.carRepo;
import com.example.Rest.model.cardetails;




@Service
public class carService {
	@Autowired
	carRepo r;
	
	public cardetails add(cardetails m) {
		return r.save(m);
	}
	
	public List<cardetails> getDetails() {
		return r.findAll();
	}
	
	public List<cardetails> showInfo()
	{
		return r.findAll();
	}
	
	public cardetails updateDetails(cardetails e1) {
		return r.saveAndFlush(e1);
	}
	public void deleteCarById(int carid) {
	      r.deleteById(carid);
	}
}