package com.batch.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("processor")
public class MyItemProcessor implements ItemProcessor<String, String> {
    
    private static final Log log = LogFactory.getLog(MyItemProcessor.class);

    public String process(String item) throws Exception {
        log.info("process:" + item);
        return item.toUpperCase();
    }
}
