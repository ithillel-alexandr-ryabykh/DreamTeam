create table Clients (ID INT PRIMARY KEY, FIRST_NAME VARCHAR, LAST_NAME VARCHAR,
EMAIL VARCHAR, PASSWORD VARCHAR, TELNUMBER VARCHAR, CREATEDBY INT,  CREATEDAT DATE);

create table Dish (ID INT PRIMARY KEY, Dishes INT ARRAY, NAME VARCHAR, DESCRIPTION VARCHAR, 
DISHID INT, AVAILABILITY BOOLEAN, COST FLOAT, CREATEDBY INT,CREATEDAT DATE,);

create table Order (ID INT PRIMARY KEY, Dishes INT ARRAY, CLIENTID INT references Client(ID), TABLENUMBER INT,
 CREATEDBY INT,  CREATEDAT DATE);

CREATE TABLE Payment (ID INT PRIMARY KEY, CREATEDAT DATE, CREATEDBY INT, AMOUNT INT, CLIENTID INT);


