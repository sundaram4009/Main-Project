package com.trm.executive.service;

import java.util.List;

import com.trm.executive.Model.Assessment;


public interface AssessmentService {
	public List<Assessment> getCandidates();
	public void addAssessment(Assessment t);
}
