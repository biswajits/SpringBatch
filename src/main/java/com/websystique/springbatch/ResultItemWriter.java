package com.websystique.springbatch;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.websystique.springbatch.model.ExamResult;

public class ResultItemWriter  implements ItemWriter<ExamResult>{
	
	private static final String INSERT_ORDER = "update batch.exam_result1 set percentage=? where student_name =?";
	private JdbcTemplate jdbcTemplate;
	
	public ResultItemWriter(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

	@Override
	public void write(List<? extends ExamResult> results) throws Exception {
		
		List<Object[]> parameters = new ArrayList<Object[]>();
		System.out.println("to updated : "+results.size());
		for (ExamResult result : results) {
			System.out.println("updated : "+result.getDob());
			//jdbcTemplate.update(INSERT_ORDER, order.getOrderNum(),order.getCustId(), order.getCountry());
			//jdbcTemplate.update(INSERT_ORDER, new Object[]{result.getPercentage(), result.getStudentName()});
			parameters.add(new Object[] {result.getPercentage(), result.getStudentName()});
		}
		
		this.jdbcTemplate.batchUpdate(INSERT_ORDER, parameters);
	}
}
