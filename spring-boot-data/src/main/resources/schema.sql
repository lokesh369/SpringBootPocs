
drop table if exists stock;

create table stock(
	stock_id int,
	company_name varchar(50),
	symbol varchar(10),
	price decimal(10,2)
);

insert into stock values(1,'TMobile','Mobile',12.21);
insert into stock values(1,'AT&T','Comm',45.32);
insert into stock values(1,'VMWare','VMW',5.34);
insert into stock values(1,'Dell','Computer',55.25);
insert into stock values(1,'HP','Computer',10.87);
