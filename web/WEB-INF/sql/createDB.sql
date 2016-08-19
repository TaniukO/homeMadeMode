CREATE DATABASE IF NOT EXISTS Saniok_SiteShop collate utf8_general_ci;
USE Saniok_SiteShop;

CREATE TABLE IF NOT EXISTS users 
(
    idU INT NOT NULL AUTO_INCREMENT,
    login VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL,
    passw VARCHAR(45) NOT NULL,
    firstname VARCHAR(45) NOT NULL,
    sorname VARCHAR(45),
    dateBirth DATE NOT NULL,
    dateReg DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    cityKey INT,
    PRIMARY KEY (idU)
);

CREATE TABLE IF NOT EXISTS products (
    idP INT NOT NULL AUTO_INCREMENT,
    nameP VARCHAR(45) NOT NULL,
    description VARCHAR(45) NOT NULL,
    prise DECIMAL(10) NOT NULL,
    mainImage VARCHAR(45),
    images INT,
    category VARCHAR(45) NOT NULL,
    PRIMARY KEY (idP)
);

CREATE TABLE IF NOT EXISTS imagesInPr (
    idP INT NOT NULL,
    ImUrl VARCHAR(45) NOT NULL,
    INDEX imageOnPrIndex (idP)
);

CREATE TABLE IF NOT EXISTS productFeatures (
    idP INT NOT NULL,
    feature VARCHAR(45) NOT NULL,
    valueF VARCHAR(45) NOT NULL,
    INDEX featIndex (idP)
);

 CREATE TABLE IF NOT EXISTS orders (
    idO INT NOT NULL AUTO_INCREMENT,
    userId INT NOT NULL,
    productId_s INT NOT NULL,
    sumPrise DECIMAL NOT NULL,
    MuveToSity INT NOT NULL,
    phone VARCHAR(13),
    companyToMove INT DEFAULT 1,
    note VARCHAR(45),
    dateOrder DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (idO)
);

CREATE TABLE IF NOT EXISTS ordersMovers (
    idO INT NOT NULL,
    idM INT NOT NULL,
    INDEX orderMovIndex (idO)
);

CREATE TABLE IF NOT EXISTS productsInOrder (
    idO INT NOT NULL,
    idP INT NOT NULL,
    INDEX prInOrderIndex (idO)
);

CREATE TABLE IF NOT EXISTS movers (
    idM INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    description VARCHAR(255) NOT NULL,
    PRIMARY KEY (idM)
);



