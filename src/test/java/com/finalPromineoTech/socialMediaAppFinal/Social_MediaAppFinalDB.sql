CREATE database if not exists social_MediaAppFinal;

use social_MediaAppFinal;

drop table if exists users;
drop table if exists adminUser;
drop table if exists post;



create table users (
	userID int(11) not null auto_increment,
	first_name varchar(30) not null,
	username varchar(64) not null,
	password char(32),
	PRIMARY KEY (userID)
);

create table adminUser(
	id int auto_increment primary key,
	adminUser_ID int(11) not null,
	first_name varchar (30) not null,
	primary key (id)
);

create table post (
	userID int not null,
	newPost varchar (100)
	comment "text",
	foreign key (userID) references users (userID)
);	
	