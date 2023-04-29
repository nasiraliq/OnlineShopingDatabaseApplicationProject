DROP DATABASE IF EXISTS dbms_project_online_shoping;
CREATE DATABASE dbms_project_online_shoping;
USE dbms_project_online_shoping;
SHOW TABLES;

-- -------------------
-- Customers
-- -------------------
CREATE TABLE customers
	(c_id int(20) NOT NULL UNIQUE auto_increment,
     first_name varchar(15),
     middle_name varchar(15), 
     last_name varchar(15),
     c_address varchar(100),
     PRIMARY KEY(c_id)
    );


-- -------------------
-- Ordes
-- -------------------
CREATE TABLE orders
	(o_id int(20) NOT NULL UNIQUE auto_increment,
     c_id int(20) NOT NULL,
     PRIMARY KEY(o_id),
     FOREIGN KEY(c_id) REFERENCES  customers(c_id)
    );


-- -------------------
-- Category
-- -------------------
CREATE TABLE categories
	(category_id int(10) NOT NULL UNIQUE auto_increment,
     category_name varchar(20) NOT NULL UNIQUE,
     PRIMARY KEY(category_id)
    );


-- -------------------
-- Brands
-- -------------------
CREATE TABLE brands
	(b_id int(10) NOT NULL UNIQUE auto_increment,
     b_name varchar(20) NOT NULL UNIQUE,
     PRIMARY KEY(b_id)
    );


-- -------------------
-- Products
-- -------------------
CREATE TABLE products
	(p_id int(30) NOT NULL UNIQUE auto_increment,
     b_id int(10) NOT NULL,
     category_id int(5) NOT NULL,
     p_name varchar(20),
     price numeric(10,2),
     desc_ varchar(100),
     PRIMARY KEY(p_id),
     FOREIGN KEY(b_id) REFERENCES brands(b_id),
     FOREIGN KEY(category_id) REFERENCES categories(category_id)
    );
    
-- -------------------
-- Stores
-- -------------------
CREATE TABLE stores
	(store_id int(20) NOT NULL auto_increment,
     store_name varchar(70) NOT NULL UNIQUE,
     PRIMARY KEY(store_id)
    );

-- -------------------
-- Order Details
-- -------------------
CREATE TABLE order_details
	(p_id int(3) NOT NULL,
     o_id int(20) NOT NULL,
     o_date date NOT NULL,
     price numeric(10,2),
     discount int NOT NULL CHECK (discount BETWEEN 1 and 100),
     PRIMARY KEY(p_id, o_id, o_date)
    );
-- DESCRIBE order_details;

-- -------------------
-- Stock
-- -------------------
CREATE TABLE stock
	(stock_id int(20) NOT NULL auto_increment,
     p_id int(30) NOT NULL,
     quantity int(20),
     PRIMARY KEY(stock_id),
     FOREIGN KEY(p_id) REFERENCES products(p_id)
    );
    -- SHOW TABLES;
    
-- Inserting Data into Categories
    INSERT INTO categories 
    VALUES
		(1,"Laptop"),
		(2, "Phone"),
		(3, "Camera"),
		(4, "Watch");
	
-- Inserting data into brands
	INSERT INTO brands
    VALUES
		(1,"Xiaomi"),
		(2, "iPhone"),
		(3, "Samsung"),
		(4, "Sony");

-- Inserting data into products
INSERT INTO products
	VALUES
		(1,1,2,"Samsung S7", 90000,  "None"),
        (2,1,2,"Samsung S5", 40000,  "None"),
        (3,2,1,"MacBook Air", 100000,  "None");

-- Inserting data into customers
INSERT INTO customers
	VALUES
    (1,"Aslam", "Ali", "Khan", "Azizabad, Khan Road, Sukkur");
INSERT INTO customers(first_name, middle_name, last_name, c_address)
	VALUES 
		("Shoaib", "Ali", "Rana", "Military Road, Sukkur"),
        ("Ali", "Hyder", "Shaikh", "Military Road, Sukkur");

-- Inserting data into orders
SELECT * FROM orders;
SELECT * FROM categories;