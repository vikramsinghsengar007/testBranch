package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recipes")
public class Recipes {

	@Id
	@Column(name="recipes_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int RecipesId;
	
	@Column(name="recipes_name")
	private String RecipesName;
	
	@Override
	public String toString() {
		return "Recipes [RecipesId=" + RecipesId + ", RecipesName=" + RecipesName + "]";
	}
	public int getRecipesId() {
		return RecipesId;
	}
	public void setRecipesId(int recipesId) {
		RecipesId = recipesId;
	}
	
	public String getRecipesName() {
		return RecipesName;
	}
	public void setRecipesName(String recipesName) {
		RecipesName = recipesName;
	}
}
