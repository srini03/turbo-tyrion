package com.batch.test;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
 
 
public class ExamItemPreparedStatement implements ItemPreparedStatementSetter<ExamResult> {
 
    public void setValues(ExamResult result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getStudentName());
        ps.setDate(2,new java.sql.Date(result.getDob().getTime()));
        ps.setDouble(3, result.getPercentage());
    } 
}
