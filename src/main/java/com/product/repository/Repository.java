package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.Entity.Model;



public interface Repository extends JpaRepository <Model, String> {
	@Query(value="SELECT * FROM security.seller_login WHERE email_id=?",nativeQuery = true)
	public Model getSellerByEmail(String email);

}
