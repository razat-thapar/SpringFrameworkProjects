package com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig"})
public class JavaConfig {
	
//	@Value("${database.driverClassName}")
//	private String driverClassName;
//	@Value("${database.url}")
//	private String url;
//	@Value("${database.username}")
//	private String username; 
//	@Value("${database.password}")
//	private String password; 
	
	@Bean(name="dataSource")
	public DataSource getDataSourceBean() {
		//new datasource object
		DriverManagerDataSource ds = new DriverManagerDataSource(); 
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds; 
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		DataSource dataSource = this.getDataSourceBean();
		return new JdbcTemplate(dataSource);
	}
	

}
