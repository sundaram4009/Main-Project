package com.trm.executive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trm.executive.Model.Assessment;
import com.trm.executive.dao.AssessmentDaoImpl;


@Service
public class AssessmentServiceImpl implements AssessmentService {

	@Autowired
	 private AssessmentDaoImpl dao;
	
	@Override
	public List<Assessment> getCandidates() {
		return dao.getAll();
	}
	
	@Override
	 public void addAssessment(Assessment t) {
		 dao.add(t);
	 }
	

}
