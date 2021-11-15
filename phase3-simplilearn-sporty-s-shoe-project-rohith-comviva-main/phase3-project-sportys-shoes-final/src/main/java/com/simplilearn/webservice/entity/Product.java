package com.simplilearn.webservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="show_room_details")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private long id;
	
	@Column(name="brand_name")
	private String name;
	
	@Column(name="product_desc")
	private String description;
	
	@Column(name="product_price")
	private double price;
	
	@Column(name="size")
	private long size;
	
	@Column(name="Category")
	private String category;

	public Product(long id, String name, String description, double price, long size, String category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
		this.category = category;
	}

	public Product() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", size="
				+ size + ", category=" + category + "]";
	}
	
	

	
	
	
}
