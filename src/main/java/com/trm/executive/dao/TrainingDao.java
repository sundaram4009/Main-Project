package com.trm.executive.dao;

import java.util.List;

import com.trm.executive.Model.Candidate;
import com.trm.executive.Model.Training;
import com.trm.executive.Model.Trm;


public interface TrainingDao {
	 public List<Training> getAll();
	 
	 public Training findById(int id);
	 
	 public void add(Training t);
	 
	 public void update(Training t);
	 
	 public void delete(int id);

	public List<Candidate> getcan();
	public List<Trm> gettrm();
	public void updateTrm(Trm t);
}
