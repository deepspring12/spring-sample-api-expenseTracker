package com.deepspring12.item;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.deepspring12.tag.Tag;

@Entity
public class Item {
	
	@Id
	private String name;
	private String description;
	private int price;
	private String date_time;
	
	@ManyToOne
	private Tag tag;
	
	public Item() {}

	public Item(String name, String description, int price, String date_time) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.date_time = date_time;
		
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate_time() {
		return date_time;
	}

	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}
	
	

}
