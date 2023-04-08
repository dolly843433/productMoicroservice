package com.product.Entity;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name="product_detail")
	public class Product {
		@Id
		@Column(name="product_id")
		private String product_id;
		@Column(name="product_category")
		private String product_category;
		@Column(name="name")
		private String name;
		@Column(name="description")
		private String description;
		@Column(name="price")
		private long price;
		@Column(name="status")
		private  String status ;
		@Column(name="quantity")
		private int quantity;
		@Column(name="image")
		private String image; 
		@Column(name="seller_id")
		private String Seller_id;
		
		
		
		
		public Product() {
			super();
		}
		
		


        

		public Product(String product_id, String product_category, String name, String description, long price,
				String status, int quantity, String image, String seller_id) {
			super();
			this.product_id = product_id;
			this.product_category = product_category;
			this.name = name;
			this.description = description;
			this.price = price;
			this.status = status;
			this.quantity = quantity;
			this.image = image;
			Seller_id = seller_id;
		}









		public int getQuantity() {
			return quantity;
		}




		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}




		public String getImage() {
			return image;
		}




		public void setImage(String image) {
			this.image = image;
		}




		public String getProduct_id() {
			return product_id;
		}


		public void setProduct_id(String product_id) {
			this.product_id = product_id;
		}


		public String getProduct_category() {
			return product_category;
		}


		public void setProduct_category(String product_category) {
			this.product_category = product_category;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public long getPrice() {
			return price;
		}


		public void setPrice(long price) {
			this.price = price;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}
		
		
		


		public String getSeller_id() {
			return Seller_id;
		}




		public void setSeller_id(String seller_id) {
			Seller_id = seller_id;
		}

		
		



		@Override
		public String toString() {
			return "Product [product_id=" + product_id + ", product_category=" + product_category + ", name=" + name
					+ ", description=" + description + ", price=" + price + ", status=" + status + ", Seller_id="
					+ Seller_id + "]";
		}


		
		
		
		
		

		
	
		
		
		
		
		
		
		
		



	}

