package com.websystique.springbatch;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class TableDetails {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}
	
	public int getTableRowCount(){
		String sql = "select count(*) from exam_result"; 
		return jdbcTemplate.queryForObject(
                sql, new Object[] { "id" }, Integer.class);	
	}

}
