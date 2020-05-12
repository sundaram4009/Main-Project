package com.trm.executive.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TrainingRowMapper implements RowMapper<Training> {
	

	@Override
	public Training mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		//'trainerId', 'vertical', 'startDate', 'endDate', 'status', 'dateOfTraining', 'dayOfTraining'
		Training t=new Training();
		t.setId(rs.getInt("id"));
		t.setName(rs.getString("name"));
		t.setTrainerId(rs.getInt("trainerId"));
		t.setVertical(rs.getString("vertical"));
		t.setStartDate(rs.getString("startDate"));
		t.setEndDate(rs.getString("endDate"));
		t.setStatus(rs.getString("status"));
		t.setNodays(rs.getInt("nodays"));
		t.setRoomno(rs.getString("roomno"));
		
		return t;
	}

}
