-- src/main/resources/schema.sql
CREATE TABLE salesperson (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  age INT,
  salary DECIMAL
);

CREATE TABLE customer (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  city VARCHAR(50),
  industryType VARCHAR(50)
);

CREATE TABLE orders (
  id INT PRIMARY KEY,
  amount DECIMAL,
  order_date DATE,
  customer_id INT,
  salesperson_id INT,
  FOREIGN KEY (customer_id) REFERENCES customer(id),
  FOREIGN KEY (salesperson_id) REFERENCES salesperson(id)
);
