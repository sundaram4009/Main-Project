package com.trm.executive.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CandidateRowMapper implements RowMapper<Candidate> {
	
	@Override
	public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		Candidate t = new Candidate();
		//System.out.println("abc");
		t.setId(rs.getInt("id"));
		t.setName(rs.getString("name"));
		t.setEmail(rs.getString("email"));
		t.setPhone(rs.getString("phone"));
		t.setAttendance(rs.getInt("attendance"));
		t.setTrainingId(rs.getInt("trainingId"));
		t.setRemarks(rs.getString("remarks"));
		return t;

}
}