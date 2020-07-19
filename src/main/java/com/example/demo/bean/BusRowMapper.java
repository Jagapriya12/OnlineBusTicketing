package com.example.demo.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BusRowMapper implements RowMapper<Bus>{

	public Bus mapRow(ResultSet rs, int rowNum) throws SQLException {
      
		Bus bus = new Bus();
        
     
        bus.setBusnumber(rs.getInt("busnumber"));
        bus.setSourcecity(rs.getString("sourcecity"));
        bus.setDestinationcity(rs.getString("destinationcity"));
        bus.setTraveldate(rs.getDate("traveldate"));
        bus.setOperatorname(rs.getString("operatorname"));
        bus.setDeparture(rs.getString("departure"));
        bus.setArrivaltime(rs.getTime("arrivaltime"));
        bus.setDuration(rs.getTime("duration"));
        bus.setPrice(rs.getDouble("price"));


        return bus;
	}

}
