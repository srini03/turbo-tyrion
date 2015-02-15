package com.spring.wystique;

import org.springframework.batch.item.ItemProcessor;

public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult>{
	 
    @Override
    public ExamResult process(ExamResult result) throws Exception {
        System.out.println("Processing result :"+result);
 
        /*
         * Only return results which are equal or more than 80%
         *
         */
        if(result.getPercentage() < 80){
        	System.out.println("Processing result1 :"+result);
            return null;

        }
 
        return result;
    }
 
}
