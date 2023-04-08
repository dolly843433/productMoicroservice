package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.Entity.Product;


public interface ProductRepository extends JpaRepository <Product, String>{
	
	
	@Query(value="select * from product_detail where product_category='clothing'",nativeQuery = true)
	public List<Product> getAllclothing();
	
	@Query(value="select * from product_detail  where product_category='footwear'",nativeQuery = true)
	public List<Product> getAllfootwear();
	
	@Query(value="select * from product_detail  where product_category='electronics'",nativeQuery = true)
	public List<Product> getAllelectronics();
	
	@Query(value="select * from product_detail  where product_category='jewellery'",nativeQuery = true)
	public List<Product> getAlljewellery();
	
	@Query(value="select * from product_detail where name=?",nativeQuery = true)
	public List<Product> getAllProductByName(String name);

	@Query(value="select * from product_detail where product_category=?",nativeQuery = true)
	public List<Product> getAllProductByProductCategory(String name);

}
