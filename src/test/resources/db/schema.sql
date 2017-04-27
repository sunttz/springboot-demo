create table user
(
	id bigint not null auto_increment
		primary key,
	name varchar(32) null,
	age int(3) null,
	sex tinyint(1) null
);