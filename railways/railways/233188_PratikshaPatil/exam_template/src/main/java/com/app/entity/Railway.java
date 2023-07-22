package com.app.entity;

import java.time.LocalDateTime;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="railway")
@JsonIgnoreType
public class Railway extends BaseEntity{

	
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	
	private LocalDateTime starttime;
	
	private  LocalDateTime endtime;

	private String source;
	private String destination;
	private int frequency;
	private  double distance;
	
	
	public Railway() {
		super();
	}


	public Railway(String name, Category category, LocalDateTime starttime, LocalDateTime endtime, String source,
			String destination, int frequency, double distance) {
		super();
		this.name = name;
		this.category = category;
		this.starttime = starttime;
		this.endtime = endtime;
		this.source = source;
		this.destination = destination;
		this.frequency = frequency;
		this.distance = distance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public LocalDateTime getStarttime() {
		return starttime;
	}


	public void setStarttime(LocalDateTime starttime) {
		this.starttime = starttime;
	}


	public LocalDateTime getEndtime() {
		return endtime;
	}


	public void setEndtime(LocalDateTime endtime) {
		this.endtime = endtime;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public double getFrequency() {
		return frequency;
	}


	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	@Override
	public String toString() {
		return "Railway [name=" + name + ", category=" + category + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", source=" + source + ", destination=" + destination + ", frequency=" + frequency + ", distance="
				+ distance + "]";
	}
	
	
}
