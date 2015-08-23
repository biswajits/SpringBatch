package com.websystique.springbatch;
 
import java.util.List;
 




import org.joda.time.DateTime;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ExecutionContext;
 
public class ExamResultJobListener implements StepExecutionListener{
 
    private DateTime startTime, stopTime;
 
//    @Override
//    public void beforeJob(JobExecution jobExecution) {
//        startTime = new DateTime();
//        System.out.println("ExamResult Job starts at :"+startTime);
//    }
// 
//    @Override
//    public void afterJob(JobExecution jobExecution) {
//        stopTime = new DateTime();
//        System.out.println("ExamResult Job stops at :"+stopTime);
//        System.out.println("Total time take in millis :"+getTimeInMillis(startTime , stopTime));
// 
//        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
//            System.out.println("ExamResult job completed successfully");
//            //Here you can perform some other business logic like cleanup
//        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
//            System.out.println("ExamResult job failed with following exceptions ");
//            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
//            for(Throwable th : exceptionList){
//                System.err.println("exception :" +th.getLocalizedMessage());
//            }
//        }
//    }
 
//    private long getTimeInMillis(DateTime start, DateTime stop){
//        return stop.getMillis() - start.getMillis();
//    }

	@Override
	public ExitStatus afterStep(StepExecution execution) {
		 if (execution.getReadCount() > 0) {  
			 //System.out.println(execution.getExecutionContext());
             //return execution.getExitStatus();  
        } else {  
         // System.out.println("failed");
           //  return ExitStatus.FAILED;  
        }  
		return null;
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		ExecutionContext jobExecutionContext = stepExecution.getJobExecution().getExecutionContext();
		System.out.println(jobExecutionContext.get("threadSize"));
		
	}
 
}