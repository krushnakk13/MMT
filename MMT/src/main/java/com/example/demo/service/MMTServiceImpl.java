package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Train;

@Service
public class MMTServiceImpl implements MMTrainService{
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public ResponseEntity getAllTrains() {
	
	ResponseEntity responseEntity = 	restTemplate.getForEntity("http://localhost:8080/trains",List.class);
	
	List<Train> lt = (List<Train>) responseEntity.getBody();
	
		return responseEntity;
	}
	
	 
	
	
}

