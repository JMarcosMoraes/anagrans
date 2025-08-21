-- Tabela: Salesperson
INSERT INTO salesperson (id, name, age, salary) VALUES (1, 'Abe', 61, 140000);
INSERT INTO salesperson (id, name, age, salary) VALUES (2, 'Bob', 34, 44000);
INSERT INTO salesperson (id, name, age, salary) VALUES (5, 'Chris', 34, 44000);
INSERT INTO salesperson (id, name, age, salary) VALUES (7, 'Dan', 41, 52000);
INSERT INTO salesperson (id, name, age, salary) VALUES (8, 'Ken', 57, 115000);
INSERT INTO salesperson (id, name, age, salary) VALUES (11, 'Joe', 38, 38000);

-- Tabela: Customer
INSERT INTO customer (id, name, city, industryType ) VALUES (4, 'Samsonic', 'Pleasant', 'J');
INSERT INTO customer (id, name, city, industryType) VALUES (6, 'Panasung', 'Oaktown', 'J');
INSERT INTO customer (id, name, city, industryType) VALUES (7, 'Samony', 'Jackson','B');
INSERT INTO customer (id, name, city, industryType) VALUES (9, 'Orange', 'Jackson','B');

-- Tabela: Order
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (10, 540, '2023-01-20', 4, 2);
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (20, 1800, '2023-01-20', 4, 8);
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (30, 460, '2023-01-20', 9, 1);
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (40, 2400, '2023-01-25', 7, 2);
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (50, 600, '2023-01-25', 6, 7);
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (60, 720, '2023-01-25', 6, 7);
INSERT INTO orders (id, amount, order_date, customer_id, salesperson_id) VALUES (70, 150, '2023-01-25', 9, 7);

