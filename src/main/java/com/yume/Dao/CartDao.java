package com.yume.Dao;

import java.util.HashMap;

import com.yume.Dto.ProductsDto;

public class CartDao extends BaseDao {
	
ProductsDao productsDao = new ProductsDao();
	
		public CartDto AddCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductsDto product = productsDao.FindProductByID(id);
		if(product != null) {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		return itemCart;
	}
}
