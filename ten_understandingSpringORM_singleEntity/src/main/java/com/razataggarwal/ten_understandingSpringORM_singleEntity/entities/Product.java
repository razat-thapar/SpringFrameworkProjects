package com.razataggarwal.ten_understandingSpringORM_singleEntity.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="product",schema="springorm")
public class Product implements Serializable {
	@Transient
	private static final long serialVersionUID = -1194198921573940857L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length=255,nullable=false,unique=true)
	private String name; 
	@Column(scale=3)
	private Double price;
	@Temporal(value=TemporalType.DATE)
	private Date mfg_dt;
	//default constructor
	public Product() {
		
	}
	//parameterized constructor.
	public Product(String name, Double price, Date mfg_dt) {
		super();
		this.name = name;
		this.price = price;
		this.mfg_dt = mfg_dt;
	}
	//getters and setters.
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getMfg_dt() {
		return mfg_dt;
	}
	public void setMfg_dt(Date mfg_dt) {
		this.mfg_dt = mfg_dt;
	}
	//toString
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", mfg_dt=" + mfg_dt + "]";
	}
	
	
	
	
}
