package com.batch.test;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SayGoodMorningTaskletStep implements Tasklet {

    public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception {
        System.out.println("---------- Good Morning! ---------");
        return RepeatStatus.FINISHED;
    }

}
