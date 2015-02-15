package com.spring.wystique;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ExamResultRowMapper implements RowMapper<ExamResult>{
	 
    @Override
    public ExamResult mapRow(ResultSet rs, int rowNum) throws SQLException {
 
        ExamResult result = new ExamResult();
        result.setStudentName(rs.getString("student_name"));
        result.setDob((rs.getDate("dob")));
        result.setPercentage(rs.getDouble("percentage"));
             
        return result;
    } 
 
}