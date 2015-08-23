package com.javahash.batch;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.batch.item.ItemWriter;

public class OrderItemWriter implements ItemWriter<Order> {

	//private static final String INSERT_ORDER = "insert into batch.order ( ordernum, cust_id, country ) values(?,?,?)";
	private static final String INSERT_ORDER = "update batch.order set country=? where cust_id =?";
	private JdbcTemplate jdbcTemplate;

	@Override
	public void write(List<? extends Order> orders) throws Exception {

		for (Order order : orders) {

			//jdbcTemplate.update(INSERT_ORDER, order.getOrderNum(),order.getCustId(), order.getCountry());
			jdbcTemplate.update(INSERT_ORDER, new Object[]{order.getCountry(),order.getCustId()});

		}

	}

	public OrderItemWriter(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}

}