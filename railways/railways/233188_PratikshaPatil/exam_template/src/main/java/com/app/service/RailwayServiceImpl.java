package com.app.service;



import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customexception.RailwayException;
import com.app.dto.RailwayDto;
import com.app.entity.Category;
import com.app.entity.Railway;
import com.app.repo.RailwayRepo;

@Service
@Transactional
public class RailwayServiceImpl implements Railwayservice {
	@Autowired
	private RailwayRepo railrepo;

	@Autowired
	private ModelMapper mapper;
	@Override
	public Railway getRailByCat(Category cat) {
		
		Railway rail=railrepo.findByCategory(cat).orElseThrow(()->new RailwayException("Category not found"));
		return rail;
	}

	@Override
	public String addRailway(RailwayDto rdto) {
		
		
		if(rdto.getFrequency()>0&& rdto.getDistance()>0 &&rdto.getStarttime().isBefore(rdto.getEndtime()))
		{
			Railway r=mapper.map(rdto, Railway.class);
			railrepo.save(r);
			return "railway added sucessfully!!!";
		}
		else
		{
			return "railway cannot be added !!!";
		}
		
	}

	@Override
	public String delRailway(Long id) {
		String msg="Railway not deletded";
		if(railrepo.existsById(id))
		{
			railrepo.deleteById(id);
			msg="Railway deleted sucessfully";
		}
		return msg;
	}
	
	
}
