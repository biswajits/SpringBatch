package com.websystique.springbatch;
 
import org.springframework.batch.item.ItemProcessor;
 
import com.websystique.springbatch.model.ExamResult;
 
public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult>{
 
    @Override
    public ExamResult process(ExamResult result) throws Exception {
        System.out.println("Processing result :"+result);
 
        /*
         * Only return results which are equal or more than 80%
         *
         */
        if(result ==null){
            return null;
        }
        
        
        return result;
    }
 
}