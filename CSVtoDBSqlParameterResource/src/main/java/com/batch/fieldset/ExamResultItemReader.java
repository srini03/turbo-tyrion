package com.batch.fieldset;


import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * Account field mapper takes FieldSet object for each row in input 
 * file and maps it to an Account model object
 * 
 */

public class ExamResultItemReader implements FieldSetMapper<ExamResult>
{
	
	/** 
	 * Map provided fieldset to Account POJO using keys defined in the names 
	 * attribute of the DelimitedLineTokenizer object
	 */
	public ExamResult mapFieldSet(FieldSet fieldSet_p) throws BindException
	{
		ExamResult result = new ExamResult();
		result.setStudentName(fieldSet_p.readString("StudentName"));
		result.setPercentage(fieldSet_p.readDouble("Percentage"));
		result.setAge(fieldSet_p.readDouble("Age"));
	
		return result;
	}
}
