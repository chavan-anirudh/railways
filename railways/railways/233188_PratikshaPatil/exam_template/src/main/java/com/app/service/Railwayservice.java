package com.app.service;

import com.app.dto.RailwayDto;
import com.app.entity.Category;
import com.app.entity.Railway;

public interface Railwayservice {

	Railway getRailByCat(Category cat);
	
	String addRailway(RailwayDto rdto);
	String delRailway(Long id);
}
