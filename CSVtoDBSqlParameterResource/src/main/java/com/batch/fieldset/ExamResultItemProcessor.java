package com.batch.fieldset;


import java.util.Map.Entry;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.file.transform.FieldSet;

public class ExamResultItemProcessor implements ItemProcessor<FieldSet, FieldSet>{

	
	
	public FieldSet process(FieldSet item) throws Exception {
		
		for (Entry<Object, Object> entry : item.getProperties().entrySet()) {
	    	System.out.println("Processing :"+entry.getKey().toString() + entry.getValue());
		System.out.println("Processing result :"+item);
		
		/*
		 * Only return results which are more than 75%
		 * 
		 */
		/*if(result.getPercentage() < 75){
			return null;
		}*/
		
		
	}
		return item;

	}
}


