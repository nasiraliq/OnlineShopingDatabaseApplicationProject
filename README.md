# OnlineShopingDatabaseApplicationProject
In this project, I built schema, database, and Java application on NetBeans accessing data and doing CRUD operations.

This is the database of online shoping of a products, based on E-Commerce, but at a small scale, with limited data.
This consists of Entities: Customers, Orders, Orders Details, Categories, Brands, Products, Stores, Stock and Payment method.

Customers     : It has Primary key (c_id).
Orders        : It has Primary key o_id and Foreign key (c_id).
Categories    : It has Primary key (category_id).
Brands        : It has Primary key (b_id).
Products      : It has Primary key (p_id) and Foreign keys (b_id) and (category_id).
Stores        : It has Primary key (store_id).
Orders Details: It has Primary key (p_id, o_id, o_date).
Stock         : It has Primary key (stock_id).