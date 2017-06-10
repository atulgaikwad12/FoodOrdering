package com.atul.BackEnd.dto;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String name;
	private String brand;

	@Column(name = "pimg")
	private String pimg_url;
	@JsonIgnore
	private String description;
	@Column(name = "unit_price")
	private double unitprice;
	@Column(name = "is_active")
	@JsonIgnore
	private boolean active = true;
	@Column(name = "category_id")
	@JsonIgnore
	private int catid;
	@Column(name = "supplier_id")
	@JsonIgnore
	private int spid;
	private int quantity;
	private int purchases;
	private int views;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(){
	
		this.code = "PRD"+UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPimg_url() {
		return pimg_url;
	}
	public void setPimg_url(String pimg_url) {
		this.pimg_url = pimg_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public int getPurchases() {
		return purchases;
	}
	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", brand=" + brand + ", pimg_url=" + pimg_url
				+ ", description=" + description + ", unitprice=" + unitprice + ", active=" + active + ", catid="
				+ catid + ", spid=" + spid + ", quantity=" + quantity + ", purchases=" + purchases + ", views=" + views
				+ "]";
	}
	
}
