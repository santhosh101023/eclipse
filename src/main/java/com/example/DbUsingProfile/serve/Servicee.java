package com.example.DbUsingProfile.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DbUsingProfile.Entity.userEntity;
import com.example.DbUsingProfile.repo.repo;

@Service
public class Servicee {

	
	@Autowired
	private repo objRepo;

	public List<userEntity> getData() {
		// TODO Auto-generated method stub
		return objRepo.findAll();
	}

	public userEntity addData(userEntity inputdata) {
		// TODO Auto-generated method stub
		return objRepo.save(inputdata);
	}
	
}
