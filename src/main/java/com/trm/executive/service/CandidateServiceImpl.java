package com.trm.executive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trm.executive.Model.Candidate;
import com.trm.executive.dao.CandidateDaoImpl;


@Service
public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	 private CandidateDaoImpl dao;

	@Override
	public List<Candidate> getCandidates() {
		return dao.getAll();
	}

	@Override
	public Candidate findCandidateById(int id) {
		
		return dao.findById(id);
	}

	@Override
	public void addCandidate(Candidate t) {
		dao.add(t);
		
	}

	@Override
	public void updateCandidate(Candidate t) {
		dao.update(t);
		
	}

	@Override
	public void deleteCandidate(int id) {
		dao.delete(id);
		
	}
	
	

}