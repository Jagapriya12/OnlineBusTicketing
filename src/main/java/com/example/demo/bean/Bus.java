package com.example.demo.bean;

import java.sql.Time;
import java.util.Date;

public class Bus {
	
	private int busnumber;
	private String sourcecity;
	private String destinationcity;
	Date traveldate = new Date();
	private String operatorname;
	private String departure;
	@SuppressWarnings("deprecation")
	Time arrivaltime = new Time(busnumber, busnumber, busnumber);
	Time duration = new Time(busnumber, busnumber, busnumber);
	private double price;
	
	
	public int getBusnumber() {
		return busnumber;
	}
	public void setBusnumber(int busnumber) {
		this.busnumber = busnumber;
	}
	public String getSourcecity() {
		return sourcecity;
	}
	public void setSourcecity(String sourcecity) {
		this.sourcecity = sourcecity;
	}
	public String getDestinationcity() {
		return destinationcity;
	}
	public void setDestinationcity(String destinationcity) {
		this.destinationcity = destinationcity;
	}
	public Date getTraveldate() {
		return traveldate;
	}
	public void setTraveldate(Date traveldate) {
		this.traveldate = traveldate;
	}
	public String getOperatorname() {
		return operatorname;
	}
	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Date getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(Time arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
