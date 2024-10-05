

show databases;

create database movie_ticket;

use movie_ticket;

create table d_movies_tbl
(
  movie_id int auto_increment primary key NOT NULL,
  movie_name varchar(100) NOT NULL,
  release_year int NOT NULL,
  collection double NOT NULL,
  budget double NOT NULL
);

insert into d_movies_tbl (movie_name,release_year, collection, budget) values ('Fighter', 2024,350,250), ('Kalki',2024,1000,600),('Stree 2', 2024,900,60);
insert into d_movies_tbl (movie_name,release_year, collection, budget) values ('Jawan', 2023,300,1200), ('Animal',2023,1000,100),('Gadar 2', 2023,700,55);

insert into d_movies_tbl (movie_name,release_year, collection, budget) values ('Jigra', 2024,200,500);

create table accounts
(
   account_no int auto_increment primary key NOT NULL,
   account_name varchar(100) NOT NULL,
   balance double NOT NULL DEFAULT 100
);

insert into accounts (account_name,balance) values ("Shimbhu",7000),("Payal",11000);

Select * from accounts where accountNo = 1 AND accounts.balance >= 1100;