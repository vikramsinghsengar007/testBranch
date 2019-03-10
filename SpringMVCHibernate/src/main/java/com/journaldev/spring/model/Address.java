package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	
	@Column(name="address_name")
	private String addressName;

	/*create table address (
			address_id int NOT NULL AUTO_INCREMENT,
			   recipes_id int NOT NULL,
			   address_name VARCHAR(30) NOT NULL,
			   PRIMARY KEY (address_id),
			   CONSTRAINT address_recipes FOREIGN KEY (recipes_id) REFERENCES recipes (recipes_id) ON UPDATE CASCADE ON DELETE CASCADE
			);*/
	
	 @ManyToOne(optional = false)
	    @JoinColumn(name="recipes_id")
	private Recipes recipes;
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
}
