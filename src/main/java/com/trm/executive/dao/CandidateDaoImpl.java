package com.trm.executive.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.trm.executive.Model.Candidate;
import com.trm.executive.Model.CandidateRowMapper;


@Transactional
@Repository
public class CandidateDaoImpl implements CandidateDao {

	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@Override
	 public void add(Candidate candidate) {
	  String query = "INSERT INTO candidate(id,name, email, phone, trainingId, attendance, remarks) "
	  								+ "VALUES (?,?,?,?,?,?,?)";
	  jdbcTemplate.update(query,candidate.getId(),candidate.getName(),candidate.getEmail(),candidate.getPhone(),candidate.getTrainingId(),candidate.getAttendance(),candidate.getRemarks());
	  System.out.print("called add");
	 }

	@Override
	 public void update(Candidate candidate) {
	  String query = "UPDATE candidate SET attendance=?,remarks=? WHERE id=?";
	  jdbcTemplate.update(query,candidate.getAttendance(),candidate.getRemarks(),candidate.getId());
		 
	 }
	 

	 @Override
	 public void delete(int id) {
	  String query = "DELETE FROM candidate WHERE id=?";
	  jdbcTemplate.update(query, id);
	 }

	@Override
	public List<Candidate> getAll() {
		 String query = "SELECT * from candidate";
		  RowMapper<Candidate> rowMapper = (RowMapper<Candidate>) new CandidateRowMapper();
		  List<Candidate> list = jdbcTemplate.query(query, rowMapper);
		  
		  return list;
	}

	@Override
	public Candidate findById(int id) {
		String query = "SELECT * FROM candidate WHERE id = ?";
		  RowMapper<Candidate> rowMapper = new BeanPropertyRowMapper<Candidate>(Candidate.class);
		  Candidate candidate = jdbcTemplate.queryForObject(query, rowMapper, id);
		  
		  return candidate;
	}
}
