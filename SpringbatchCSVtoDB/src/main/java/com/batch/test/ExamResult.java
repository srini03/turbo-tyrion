package com.batch.test;

import java.util.Date;
//import java.sql.Date;
public class ExamResult {

	private String StudentName;
	private Date Dob;
	private double percentage;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "ExamResult [studentName=" + StudentName + ", dob=" + Dob
				+ ", percentage=" + percentage + "]";
	
	}
}
