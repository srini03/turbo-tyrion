package com.spring.wystique;


import java.util.Date;
 
 
public class ExamResult {
     
    private String studentName;
    private Date dob;
    private double percentage;
     
 
    public String getStudentName() {
        return studentName;
    }
     
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
     
    public Date getDob() {
        return dob;
    }
     
    public void setDob(Date dob) {
        this.dob = dob;
    }
     
    public double getPercentage() {
        return percentage;
    }
     
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
 
    @Override
    public String toString() {
        return "ExamResult [studentName=" + studentName + ", dob=" + dob + ", percentage=" + percentage + "]";
    }
     
     
}
