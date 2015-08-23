package com.websystique.springbatch;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ExecutionContext;

public class StepListener implements StepExecutionListener{

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		ExecutionContext jobExecutionContext = stepExecution.getJobExecution().getExecutionContext();

        jobExecutionContext.put("threadSize", 4);
		return null;
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		ExecutionContext jobExecutionContext = stepExecution.getJobExecution().getExecutionContext();

        jobExecutionContext.put("threadSize", 4);
		
	}

}
