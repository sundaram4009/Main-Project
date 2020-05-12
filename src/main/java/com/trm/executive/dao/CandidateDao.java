package com.trm.executive.dao;

import java.util.List;

import com.trm.executive.Model.Candidate;




public interface CandidateDao {
	
	public List<Candidate> getAll();
	 
	 public Candidate findById(int id);
	 
	 public void add(Candidate t);
	 
	 public void update(Candidate t);
	 
	 public void delete(int id);

}
