--liquibase formatted sql

--changeset your.name:2
create table test_table2 (  
	id int primary key,
	firstname varchar(50),
	lastname varchar(50) not null,
	state char(2)
)