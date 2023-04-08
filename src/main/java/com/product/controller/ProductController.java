package com.product.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.product.Entity.Product;
import com.product.idGenerator.productIdGenerator;
import com.product.jwt.jwtUtelis;
import com.product.repository.ProductRepository;


@CrossOrigin("http://localhost:4200")
@RestController
public class ProductController {
	
	@Autowired
	productIdGenerator idgenerator;
	
	@Autowired
	ProductRepository productrepository;
	
	@Autowired
	jwtUtelis utils;
	
	@PostMapping("/product/{token}")
	public String insertproductname(@RequestBody Product product,@PathVariable("token") String token) throws IOException {
		product.setProduct_id(idgenerator.productidgenerator());
		product.setStatus("NotSold");
		System.out.println(utils.extractUsername(token));
		product.setSeller_id(utils.extractUsername(token));
//		BufferedImage bImage = ImageIO.read(new File(product.getImage()));
//	      ByteArrayOutputStream bos = new ByteArrayOutputStream();
//	      ImageIO.write(bImage, "jpg", bos );
//	      byte [] data = bos.toByteArray();
//		product.setImage(data.toString());
		productrepository.save(product);
		return "product saved";
	}
	
	@GetMapping("/getAllClothing")
	public List<Product> getclothing() {
		return productrepository.getAllclothing();
	}
	
	@GetMapping("/getAllfootwear")
	public List<Product> getfootwear() {
		return productrepository.getAllfootwear();
	}

	
	@GetMapping("/getAllelectronics")
	public List<Product> getelectronics() {
		return productrepository.getAllelectronics();
	}
	
	@GetMapping("/getAlljewellery")
	public List<Product> getjewellery() {
		return productrepository.getAlljewellery();
	}
	
	@GetMapping("/getproduct")
	public List<Product> getproducts(){
		return (List<Product>)productrepository.findAll();
	}

	



	@GetMapping("/getproduct/{product_id}")
	public Product getproductdetail(@PathVariable("product_id") String id) {
		return productrepository.findById(id).get();
	}
	
	
	
	@GetMapping("/getAllByName/{name}")
	public List<Product> getAllByName(@PathVariable("name") String name){
		 if(!productrepository.getAllProductByProductCategory(name).isEmpty()) {
				return productrepository.getAllProductByProductCategory(name);
			}
		 else {
		 if(!productrepository.getAllProductByName(name).isEmpty()) {
			return productrepository.getAllProductByName(name);
			}
		 else {
			 return null;
		 }
		 }
	}
	


}



