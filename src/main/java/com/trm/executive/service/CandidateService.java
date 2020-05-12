package com.trm.executive.service;

import java.util.List;

import com.trm.executive.Model.Candidate;



public interface CandidateService {

 public List<Candidate> getCandidates();
	 
	 public Candidate findCandidateById(int id);
	 
	 public void addCandidate(Candidate t);
	 
	 public void updateCandidate(Candidate t);
	 
	 public void deleteCandidate(int id);
	
	
}
