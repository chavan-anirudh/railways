package com.app.dto;

import java.time.LocalDateTime;

import com.app.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RailwayDto {
	
	private String name;
	
	private Category category;
	private LocalDateTime starttime;
	
	private  LocalDateTime endtime;

	private String source;
	private String destination;
	private int frequency;
	private  double distance;
	

}
