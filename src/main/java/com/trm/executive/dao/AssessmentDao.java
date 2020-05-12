package com.trm.executive.dao;

import java.util.List;

import com.trm.executive.Model.Assessment;



public interface AssessmentDao {
	public List<Assessment> getAll();
	public List<Assessment> findById(int id);
	public void add(Assessment t);
}
