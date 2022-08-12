package com.test.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.demo.entity.country;

public interface countryDao extends JpaRepository<country, Long>{

}
