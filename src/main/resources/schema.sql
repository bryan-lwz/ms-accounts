DROP TABLE IF EXISTS ACCOUNT;
CREATE TABLE ACCOUNT (
account_id INT AUTO_INCREMENT  PRIMARY KEY,
account_no VARCHAR(50) NOT NULL,
account_holder_name VARCHAR(200) NOT NULL);