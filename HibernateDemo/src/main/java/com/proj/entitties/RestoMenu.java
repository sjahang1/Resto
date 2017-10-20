package com.proj.entitties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="RESTO_MENU")
public class RestoMenu {
	
 @Id
 @GeneratedValue(generator="increment")
 @GenericGenerator(name="increment", strategy = "increment")
 @Column(name="MENU_ID")
 private Integer menuId;
 
 @Column (name="CATEGORY")
 private String category;
 
 @Column (name="NAME")
 private String name;
 
 @Column (name="DESCRIPTION")
 private String description;
 
 @Column (name="IMAGE")
 private String image;
 
 @Column (name="SERVING_SIZE")
 private String servingSize;
 
 @Column (name="PRICE")
 private double price;
 
 @Column (name="ACTIVE_IND")
 private String activeInd;
 
 @Column (name="RECIPE_ID")
 private Integer recipeId;
 
 @Column (name="RESTAURANT_SPECIAL_IND")
 private String restaurantSpecialInd;
 
 @Column (name="VEGETARIAN_IND")
 private String vegetarianInd;
 
 @Column (name="NOTES")	
 private String notes;

 public Integer getMenuId() {
	return menuId;
}

public void setMenuId(Integer menuId) {
	this.menuId = menuId;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
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

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String servingSize() {
	return servingSize;
}

public void setServingSize(String servingSize) {
	this.servingSize = servingSize;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getActiveInd() {
	return activeInd;
}

public void setActiveInd(String activeInd) {
	this.activeInd = activeInd;
}

public Integer getRecipeId() {
	return recipeId;
}

public void setRecipeId(Integer recipeId) {
	this.recipeId = recipeId;
}

public String getRestaurantSpecialInd() {
	return restaurantSpecialInd;
}

public void setRestaurantSpecialInd(String restaurantSpecialInd) {
	this.restaurantSpecialInd = restaurantSpecialInd;
}

public String getVegetarianInd() {
	return vegetarianInd;
}

public void setVegetarianInd(String vegetarianInd) {
	this.vegetarianInd = vegetarianInd;
}

public String getNotes() {
	return notes;
}

public void setNotes(String notes) {
	this.notes = notes;
}

 

}
