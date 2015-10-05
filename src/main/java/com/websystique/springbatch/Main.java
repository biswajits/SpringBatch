package com.websystique.springbatch;
 
import java.util.List;
import java.util.Set;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main implements Runnable{
 
    
    public static void main(String areg[]){
         new Thread(new Main()).start();
        new Thread(new Main()).start();
        
    }

	@Override
	public void run() {
		for(int i=0;i<200;i++){
			System.out.println(i);
			try {
				this.executeBatch();
			} catch (NoSuchJobException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void executeBatch() throws NoSuchJobException{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");
		
	     JobExplorer explorer = (JobExplorer) context.getBean("jobExplorer");
	        
	        List<JobInstance> executions=explorer.getJobInstances("examResultJob", 0, 10);
	        System.out.println("##############>"+executions.size());
	        if (executions != null && !executions.isEmpty())
	        	System.out.println("job is running");

		
		JobParameters jobParameters = 
				  new JobParametersBuilder()
				  .addLong("time",System.currentTimeMillis()).toJobParameters();

        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("examResultJob");
      
        try {
            JobExecution execution = jobLauncher.run(job, jobParameters);
            System.out.println("Job Exit Status : "+ execution.getStatus());
      
        } catch (JobExecutionException e) {
            System.out.println("Job ExamResult failed");
            e.printStackTrace();
        }
        

   
//        // Fetching all job instances.
//        List<JobInstance> jobInstances = explorer.getJobInstances("examResultJob", 0, 10);
//
//        // Fetching the last job instance.
//        JobInstance lastJobInstance = null;
//        if(jobInstances.size() > 0){
//        lastJobInstance = jobInstances.get(0);
//
//        //Obtain all executions for last job instance.
//        List<JobExecution> executions = explorer.getJobExecutions(lastJobInstance);
//
//        // fetching last job execution
//        JobExecution lastJobExecution = executions.get(0);
//
//        System.out.println("Is my last Job running? \nAns:"+lastJobExecution.isRunning());
//        }
	}
 
}