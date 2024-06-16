package com.example.DbUsingProfile.contro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DbUsingProfile.Entity.userEntity;
import com.example.DbUsingProfile.serve.Servicee;

@RestController
public class Controler {

	@Autowired
	private Servicee objService;
	@GetMapping("/getData")
	public List<userEntity> getdata() {
		
		return objService.getData();
		
	}
	
	
	
	@PostMapping("/addData")
	public userEntity adddata(@RequestBody userEntity inputdata) {
		

		return objService.addData(inputdata);
		
	}
	
	
	
	
}
