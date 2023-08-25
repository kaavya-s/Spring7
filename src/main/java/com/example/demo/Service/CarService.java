package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repository.CarRepo;

@Service
public class CarService {
	@Autowired
	CarRepo cr;
	
	public List<Car> savedetails(List<Car> c)
	{
		return (List<Car>)cr.saveAll(c);
	}
	public List<Car> getOwners(int o){
		return cr.getOwner(o);
	}
	public List<Car> getAdd(String a)
	{
		return cr.getAddress(a);
	}
	public List<Car> getCarn(String a)
	{
		return cr.getCarname(a);
	}
	public List<Car> getCtOwn(int o,String a)
	{
		return cr.getcarAndOwner(o, a);
	}

}
