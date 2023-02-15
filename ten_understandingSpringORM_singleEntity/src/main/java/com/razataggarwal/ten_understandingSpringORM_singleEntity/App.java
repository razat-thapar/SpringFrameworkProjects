package com.razataggarwal.ten_understandingSpringORM_singleEntity;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.ten_understandingSpringORM_singleEntity.dao.ProductDao;
import com.razataggarwal.ten_understandingSpringORM_singleEntity.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //beans
        ProductDao productDao = context.getBean(ProductDao.class);
    
        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------Add a new product---------------------------");
        Product p1 = new Product("MacBook Air Pro",150000.00,new Date());
        Product p2 = new Product("MacBook Air Pro 2",160000.00,new Date());
        try {
			productDao.addProduct(p1);
			System.out.println(p1);
		} catch (Exception e) {
			System.out.println("Unable to add due to following exception: "+e.getMessage());
		}
        try {
			productDao.addProduct(p2);
		} catch (Exception e) {
			System.out.println("Unable to add due to following exception: "+e.getMessage());
		}
		System.out.println(p2);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------get a product by id---------------------------");
        try {
			System.out.println(productDao.getProductById(7L));
		} catch (Exception e) {
			System.out.println("Unable to find due to following exception: "+e.getMessage());
		}
        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------get all products---------------------------");
        try {
        	List<Product> products = productDao.getAllProducts();
        	for(Product p : products) {
        		System.out.println(p);
        	}
		} catch (Exception e) {
			System.out.println("Unable to getAll due to following exception: "+e.getMessage());
		}
        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------Update a product---------------------------");
        Product p = new Product("MacBook Air Pro",150023.00,new Date());
        try {
			productDao.updateProductById(19L, p);
			System.out.println(p);
		} catch (Exception e) {
			System.out.println("Unable to update due to following exception: "+e.getMessage());
		}
        System.out.println("-------------------------------------------------------------------");
        System.out.println("----------------------Delete a product---------------------------");
        try {
			productDao.deleteProductById(19L);
		} catch (Exception e) {
			System.out.println("Unable to delete due to following exception: "+e.getMessage());
		}
        try {
			productDao.getAllProducts();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        context.close();
    }
}
