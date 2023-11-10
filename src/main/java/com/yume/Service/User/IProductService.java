package com.yume.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yume.Dto.ProductsDto;

@Service
public interface IProductService {
	public ProductsDto GetProductByID(long id);
	
	public List<ProductsDto> GetProductByIDCategory(int id);
}
