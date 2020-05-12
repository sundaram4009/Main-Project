package com.trm.executive.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TrmMapper implements RowMapper<Trm> {
	
	@Override
	public Trm mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		Trm t = new Trm();
		System.out.println("abc");
		t.setTrm(rs.getString("trm"));
		t.setAvailability(rs.getInt("availability"));
		return t;

}

}
