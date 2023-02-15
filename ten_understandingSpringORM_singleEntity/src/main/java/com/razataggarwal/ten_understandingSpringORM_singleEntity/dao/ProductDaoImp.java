package com.razataggarwal.ten_understandingSpringORM_singleEntity.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.razataggarwal.ten_understandingSpringORM_singleEntity.entities.Product;

@Repository
public class ProductDaoImp implements ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate; 

	@Transactional
	public Product addProduct(Product p) throws SQLException{
		Long id = (Long) this.hibernateTemplate.save(p);
		p.setId(id);
		return p;
	}

	public Optional<Product> getProductById(Long id) throws SQLException{
		Product p = this.hibernateTemplate.get(Product.class, id);
		return Optional.ofNullable(p);
	}

	public List<Product> getAllProducts() throws SQLException{
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	@Transactional
	public Product updateProductById(Long id, Product p) throws SQLException{
		Product newp = new Product(p.getName(),p.getPrice(),p.getMfg_dt());
		Optional<Product> oldp = this.getProductById(id); 
		if(oldp.isPresent()) {
			newp.setId(id);
			this.hibernateTemplate.update(newp);
		}else
			throw new SQLException("No Product with id: "+id +" exists in DB");
		return newp;
	}
	
	@Transactional
	public void deleteProductById(Long id) throws SQLException {
		Optional<Product> p = this.getProductById(id);
		if(p.isPresent()) {
			this.hibernateTemplate.delete(p.get());
		}else {
			throw new SQLException("No Product with id: "+id +" exists in DB");
		}
	}

}
