package com.trm.executive.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AssessmentRowMapper implements RowMapper<Assessment> {

	@Override
	public Assessment mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	
		Assessment t = new Assessment();
		//System.out.println("abc");
		t.setId(rs.getInt("id"));
		t.setName(rs.getString("name"));
		t.setDate(rs.getString("date"));
		t.setDateOfSubmission(rs.getString("dateOfSubmission"));
		t.setMarks(rs.getInt("marks"));
		t.setCandidateId(rs.getInt("candidateId"));
		return t;

}
}
