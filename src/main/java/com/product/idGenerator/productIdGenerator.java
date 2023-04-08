package com.product.idGenerator;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class productIdGenerator {

	
	public String productidgenerator(){
		
		Random random=new Random();
		String a="";
		
		for(int i=0;i<15;i++) {
			a=a+random.nextInt(10);
		}
		
		return "P"+a;
	}
}
