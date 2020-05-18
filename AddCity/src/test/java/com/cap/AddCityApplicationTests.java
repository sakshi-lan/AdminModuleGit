package com.cap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cap.Bean.CityTab;
import com.cap.service.AddServiceI;

@SpringBootTest
class AddCityApplicationTests {
	
	@Autowired
	private AddServiceI service;

	@Test
	public void addCity() {
		CityTab city = new CityTab ();
		city.setCity_Id(10);
		city.setCity_Name("mumbai");
		
		CityTab city1= service.addCity(city);
		System.out.println(city1.toString());
		Assertions.assertEquals(city.toString(), city1.toString());
	}

}
