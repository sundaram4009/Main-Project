package com.trm.executive.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.trm.executive.Model.Trm;
import com.trm.executive.Model.TrmMapper;

@Transactional
@Repository
public class TrmDaoImpl implements TrmDao {

	@Autowired
	 private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Trm> getAll() {
		 String query = "SELECT * from candidate; ";
		  RowMapper<Trm> rowMapper = (RowMapper<Trm>) new TrmMapper();
		  List<Trm> list1 = jdbcTemplate.query(query, rowMapper);
		  System.out.println(list1);
		  return list1;
	}
}
