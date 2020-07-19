package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Bus;
import com.example.demo.bean.BusRowMapper;

@Repository
public class BusRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	public List<Bus> getBus()
	{
		
		
		return jdbcTemplate.query("select * from searchbus", new BusRowMapper());
	}
	
	public Bus findByBusDetails(String sourcecity, String destinationcity, Date traveldate)
	{
        String sql = "SELECT * FROM searchbus WHERE sourcecity = ? ";
        try {
        	return(Bus) this.jdbcTemplate.queryForObject(
        			sql, new Object[] {sourcecity},new BusRowMapper());
        }
        catch(EmptyResultDataAccessException ex){
            return null;
        }
	}
	


}
