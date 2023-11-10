package com.yume.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yume.Entity.MapperSlides;
import com.yume.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao{
	
	public List<Slides> GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	} 
}
