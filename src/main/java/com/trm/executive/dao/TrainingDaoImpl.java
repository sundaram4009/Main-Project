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
import com.trm.executive.Model.Training;
import com.trm.executive.Model.TrainingRowMapper;
import com.trm.executive.Model.Trm;
import com.trm.executive.Model.TrmMapper;


@Transactional
@Repository
public class TrainingDaoImpl implements TrainingDao {
 
 @Autowired
 private JdbcTemplate jdbcTemplate;

 @Override
 public void add(Training training) {
  String query = "INSERT INTO training(name, trainerId, vertical, startDate, endDate, status, nodays, roomno) "
  								+ "VALUES (?,?,?,?,?,?,?,?)";
  jdbcTemplate.update(query,training.getName(),training.getTrainerId(),training.getVertical(),training.getStartDate(),training.getEndDate(),training.getStatus(),training.getNodays(),training.getRoomno());
  System.out.print("called add");
 }

 @Override
 public void update(Training training) {
  String query = "UPDATE training SET status=? WHERE id=?";
  jdbcTemplate.update(query,training.getStatus(),training.getId());
  
 }
 @Override
 public void updateTrm(Trm trm) {
  String query = "UPDATE trmtable SET availability=availability-1 WHERE trm=?";
  jdbcTemplate.update(query,trm.getTrm());
  
 }

 @Override
 public void delete(int id) {
  String query = "DELETE FROM training WHERE id=?";
  jdbcTemplate.update(query, id);
 }

@Override
public List<Training> getAll() {
	 String query = "SELECT * from training";
	  RowMapper<Training> rowMapper = (RowMapper<Training>) new TrainingRowMapper();
	  List<Training> list = jdbcTemplate.query(query, rowMapper);
	  
	  return list;
}

@Override
public Training findById(int id) {
	String query = "SELECT * FROM training WHERE id = ?";
	  RowMapper<Training> rowMapper = new BeanPropertyRowMapper<Training>(Training.class);
	  Training Training = jdbcTemplate.queryForObject(query, rowMapper, id);
	  
	  return Training;
}
@Override
public List<Candidate> getcan() {
	 String query = "SELECT * from candidate";
	  RowMapper<Candidate> rowMapper = (RowMapper<Candidate>) new CandidateRowMapper();
	  List<Candidate> list = jdbcTemplate.query(query, rowMapper);
	  
	  return list;
}
@Override
public List<Trm> gettrm() {
	 String query = "SELECT * from trmtable";
	  RowMapper<Trm> rowMapper = (RowMapper<Trm>) new TrmMapper();
	  List<Trm> list = jdbcTemplate.query(query, rowMapper);
	  
	  return list;
}

}