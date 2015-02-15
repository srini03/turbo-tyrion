package com.batch.test;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SayGoodNightTaskletStep implements Tasklet {

    public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception {
        System.out.println("---------- Good Night! ---------");
        System.out.println("---------- Good Night2! ---------");
        System.out.println("---------- Good Night3! ---------");
        
        return RepeatStatus.FINISHED;
    }
}
