
DROP TABLE IF EXISTS stores CASCADE;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS order_products;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS addresses;

/* Table creation*/
CREATE TABLE addresses (
        address_id serial NOT NULL,
        street_address varchar(64) NOT NULL,
        city varchar(64) NOT NULL,
        state varchar(3) NOT NULL,
        zipcode integer,
        lat double precision NOT NULL,
        long double precision NOT NULL,
        
        CONSTRAINT pk_addresses_address_id PRIMARY KEY (address_id)
);

CREATE TABLE categories (
        category_id serial NOT NULL,
        name varchar(32) NOT NULL,
        
        CONSTRAINT pk_categories_category_id PRIMARY KEY (category_id)

);

CREATE TABLE stores (
        store_id serial NOT NULL,
        address_id integer NOT NULL,
        
        CONSTRAINT pk_stores_store_id PRIMARY KEY (store_id),
        CONSTRAINT fk_address_id FOREIGN KEY (address_id) REFERENCES addresses(address_id) 
);

CREATE TABLE products (
        product_id serial NOT NULL,
        name varchar(64) NOT NULL,
        sale_price numeric(6,2) NOT NULL,
        cost numeric(6,2) NOT NULL,
        category_id integer NOT NULL,
                
        CONSTRAINT pk_products_product_id PRIMARY KEY (product_id),
        CONSTRAINT fk_categories_id FOREIGN KEY (category_id) REFERENCES categories(category_id)
);

CREATE TABLE customers (
        customer_id serial NOT NULL,
        address_id integer NOT NULL,
        first_name varchar(32) NOT NULL,
        last_name varchar(32) NOT NULL,
        email varchar(64) NOT NULL,
        
        CONSTRAINT pk_customers_customer_id PRIMARY KEY (customer_id),
        CONSTRAINT fk_address_id FOREIGN KEY (address_id) REFERENCES addresses(address_id) 
);

CREATE TABLE orders (
        order_id serial NOT NULL,
        order_date timestamp without time zone NOT NULL,
        
        store_id integer,
        customer_id integer,
        
        CONSTRAINT pk_orders_order_id PRIMARY KEY (order_id),
        CONSTRAINT fk_store_id FOREIGN KEY (store_id) REFERENCES stores(store_id),
        CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(customer_id)

);

CREATE TABLE order_products (
        order_product_id serial NOT NULL,
        order_id integer NOT NULL,
        product_id integer NOT NULL,
        
        CONSTRAINT pk_order_products_order_products_id PRIMARY KEY (order_product_id),
        CONSTRAINT fk_order_id FOREIGN KEY (order_id) REFERENCES orders(order_id),
        CONSTRAINT fk_product_id FOREIGN KEY (product_id) REFERENCES products(product_id)
);

