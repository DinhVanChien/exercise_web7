CREATE DATABASE MANAGE_USER;

USE MANAGE_USER;

CREATE TABLE USER (
	ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(50) NOT NULL,
    AGE INT(3),
    ADDRESS VARCHAR(150),
    PHONE VARCHAR(12)
    )