package com.razataggarwal.ten_understandingSpringORM_singleEntity.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.razataggarwal.ten_understandingSpringORM_singleEntity.entities.Product;

public interface ProductDao {
	public abstract Product addProduct(Product p) throws SQLException;
	public abstract Optional<Product> getProductById(Long id) throws SQLException;
	public abstract List<Product> getAllProducts() throws SQLException;
	public abstract Product updateProductById(Long id,Product p) throws SQLException;
	public abstract void deleteProductById(Long id) throws SQLException;
}
