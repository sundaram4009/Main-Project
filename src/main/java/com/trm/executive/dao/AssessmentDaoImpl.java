package com.trm.executive.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trm.executive.Model.Assessment;
import com.trm.executive.Model.AssessmentRowMapper;
import com.trm.executive.Model.Candidate;
import com.trm.executive.Model.Training;

@Transactional
@Repository
public class AssessmentDaoImpl implements AssessmentDao {

	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Assessment> getAll() {
		 String query = "SELECT a.*,b.name FROM assessment a, candidate b where a.candidateId=b.id;";
		  RowMapper<Assessment> rowMapper = (RowMapper<Assessment>) new AssessmentRowMapper();
		  List<Assessment> list = jdbcTemplate.query(query, rowMapper);
		  
		  return list;
	}
	@Override
	public List<Assessment> findById(int id) {
		String query = "SELECT * FROM assessment WHERE id = ?";
		  RowMapper<Assessment> rowMapper = (RowMapper<Assessment>) new AssessmentRowMapper();
		  List<Assessment> candidate = jdbcTemplate.query(query, rowMapper);
		  
		  return candidate;
	}
	@Override
	 public void add(Assessment training) {
	  String query = "INSERT INTO assessment(id, date, dateOfSubmission, marks, candidateId) "
	  								+ "VALUES (?,?,?,?,?)";
	  jdbcTemplate.update(query,training.getId(),training.getDate(),training.getDateOfSubmission(),training.getMarks(),training.getCandidateId());
	  System.out.print("called add");
	 }
}