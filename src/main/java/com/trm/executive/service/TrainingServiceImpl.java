package com.trm.executive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trm.executive.Model.Candidate;
import com.trm.executive.Model.Training;
import com.trm.executive.Model.Trm;
import com.trm.executive.dao.TrainingDaoImpl;


@Service
public class TrainingServiceImpl implements TrainingService {

	
	@Autowired
	 private TrainingDaoImpl dao;

	 @Override
	 public List<Training> getTrainings() {
	  return dao.getAll();
	 }

	 @Override
	 public Training findTrainingById(int id) {
	  return dao.findById(id);
	 }

	 @Override
	 public void addTraining(Training t) {
		 dao.add(t);
	 }

	 @Override
	 public void updateTraining(Training t) {
		 dao.update(t);
	 }
	 @Override
	 public void updateTrm(Trm t) {
		 dao.updateTrm(t);
	 }

	 @Override
	 public void deleteTraining(int id) {
		 dao.delete(id);
	 }
	 
	 @Override
	 public List<Candidate> getCandidates() {
	  return dao.getcan();
	 }
	 @Override
	 public List<Trm> getTrm() {
	  return dao.gettrm();
	 }
}
