package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService cs;
	@PostMapping("/")
	public List<Car> addDet(@RequestBody List<Car> c)
	{
		return cs.savedetails(c);
	}
	 
	 @GetMapping("/owner/{owners}")
	 public List<Car> getown(@PathVariable int owners)
	 {
		 return cs.getOwners(owners);
	 }
	 @GetMapping("/address/{address}")
	 public List<Car> getAd(@PathVariable String address)
	 {
		 return cs.getAdd(address);
	 }
	 @GetMapping("/carname/{carName}")
	 public List<Car> getcn(@PathVariable String carName)
	 {
		 return cs.getCarn(carName);
	 }
	 
	 @GetMapping("/owners/{owners}/cartype/{carType}")
	 public List<Car> getco(@PathVariable int owners,@PathVariable String carType)
	 {
		 return cs.getCtOwn(owners, carType);
	 }

}
