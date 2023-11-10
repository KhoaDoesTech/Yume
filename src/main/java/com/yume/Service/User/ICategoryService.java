package com.yume.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yume.Dto.ProductsDto;

@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
}
