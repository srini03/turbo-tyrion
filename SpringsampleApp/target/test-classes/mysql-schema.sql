--------------------------------------
-- Table Customer
-- -----------------------------------------------------
DROP TABLE IF EXISTS Customer ;

CREATE  TABLE Customer (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT, 
  firstName VARCHAR(45) NOT NULL ,
  lastName VARCHAR(45) NOT NULL ,
  ssn VARCHAR(9) NOT NULL ,
  address1 VARCHAR(45) NOT NULL ,
  city VARCHAR(45) NOT NULL ,
  state VARCHAR(2) NOT NULL ,
  zip VARCHAR(9) NOT NULL ,
  PRIMARY KEY (id) );


-- -----------------------------------------------------
-- Table Account
-- -----------------------------------------------------
DROP TABLE IF EXISTS Account ;

CREATE  TABLE Account (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT, PRIMARY KEY (id),
  accountNumber VARCHAR(9) NOT NULL ,
  cashBalance DECIMAL(15,2) NOT NULL ,
  tier INT NULL ,
  Customer_id INT NOT NULL);


-- -----------------------------------------------------
-- Table Ticker
-- -----------------------------------------------------
DROP TABLE IF EXISTS Ticker ;

CREATE  TABLE Ticker (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  ticker VARCHAR(45) NOT NULL ,
  currentPrice DECIMAL(8,2) NOT NULL ,
  PRIMARY KEY (id) );


-- -----------------------------------------------------
-- Table Transaction
-- -----------------------------------------------------
DROP TABLE IF EXISTS Transaction ;

CREATE  TABLE Transaction (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT, PRIMARY KEY (id),
  transactionType INT NOT NULL ,
  executedTime DATETIME NOT NULL ,
  dollarAmount DECIMAL(15,2) NOT NULL ,
  qty INT NULL ,
  tickerId INT NOT NULL ,
  fee VARCHAR(45) NULL ,
  Account_id INT NOT NULL);