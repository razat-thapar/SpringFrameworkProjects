#creating the schema.
create schema springjdbc;

#using the schema
use springjdbc; 

#creating table inside the schema. 
create table Student(
	 id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
     name VARCHAR(100) NOT NULL,
     city VARCHAR(100)
);

#inserting a record. 
insert into Student(name , city) values ("Razat Aggarwal" , "patiala") ; 

#selecting a record
select * from Student;