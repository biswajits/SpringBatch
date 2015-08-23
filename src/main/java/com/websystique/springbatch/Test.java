package com.websystique.springbatch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;

public class Test implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext context)
			throws Exception {
		System.out.println("starging.....");
		ExecutionContext jobContext=context.getStepContext().getStepExecution().getJobExecution().getExecutionContext();
		  jobContext.put("threadSize",3);
		return null;
	}
	
	
}
