package com.trm.executive.service;

import java.util.List;

import com.trm.executive.Model.Candidate;
import com.trm.executive.Model.Training;
import com.trm.executive.Model.Trm;


public interface TrainingService {

	 public List<Training> getTrainings();
	 
	 public Training findTrainingById(int id);
	 
	 public void addTraining(Training t);
	 
	 public void updateTraining(Training t);
	 
	 public void deleteTraining(int id);
	 
	 public  List<Candidate> getCandidates();
	 public  List<Trm> getTrm();
	 public void updateTrm(Trm t);
}
