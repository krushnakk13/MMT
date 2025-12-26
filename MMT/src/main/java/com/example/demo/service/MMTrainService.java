package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.entity.Train;

public interface MMTrainService {
	
	ResponseEntity<List> getAllTrains();

}
