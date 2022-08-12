package com.test.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.country;
import com.test.demo.Dao.*;


@Service
public class CountryService {
	@Autowired
	private countryDao countryDao;
	
	public country getCountryData(int id) {
		Optional<country> stu=countryDao.findById((long) id);
		return stu.get();
	}
}
