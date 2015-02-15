package com.batch.fieldset;

//import java.sql.Date;
public class ExamResult {

	private String StudentName;
	private double age;
	private double percentage;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
/**	@Override
	public String toString() {
		//return "ExamResult [studentName=" + StudentName + ", age=" + age
		//		+ ", percentage=" + percentage + "]";
		
		return "ExamResult [studentName=" + StudentName +", percentage=" + percentage 
				+ ", age=" + age + "]";
				
	
	}*/
	
}
