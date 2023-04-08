package com.product.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.product.Entity.Model;
import com.product.repository.Repository;


@Service

public class ProductUserService implements UserDetailsService{

	@Autowired
	public Repository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Model  model=(Model) repo.getSellerByEmail(username);
		
		return new ProductUserDetail(model);
	}

}
