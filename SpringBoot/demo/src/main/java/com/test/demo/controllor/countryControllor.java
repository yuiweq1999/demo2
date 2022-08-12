package com.test.demo.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.country;
import com.test.demo.service.CountryService;

import io.swagger.v3.oas.annotations.tags.Tag;


// @後加alt / 可以叫出import清單,就不用自己打import
//這邊我們需要 下面3隻 做controllor用,並先給好位置 
@RequestMapping
@RestController
@Tag(name="Example API",description ="Example API")
public class countryControllor {
	
	@Autowired
	CountryService countryS; //
	
	
	
	
	//GetMapping只能在內部呼叫,所以外部選不到
	@GetMapping("/{numbers}")
	public country query(@PathVariable int numbers) {
		
		country result=this.countryS.getCountryData(numbers);
		return result;
//		return "Hello World";
	}
	//注意如果沒有成功,可以先去工作管理員清掉詳細資料裡面多開的java ,再重開IDE後執行
	//注意要執行的controllor路徑,不對的話也會一樣跳出8080port已經被用掉了
}
