create schema architect;

create table building(
	id serial primary key,
	name text not null,
	owner_id integer
);
create table owner(
	id serial primary key,
	fname text not null,
	lname text not null,
	username text unique not null,
	password text not null
);

alter table building add constraint building_owner_fk foreign key (owner_id) references owner (id);

insert into owner (fname, lname, username, password) values 
	('bobo','the clown','clownman','scared'),
	('yachak','berry','yerba','mate'),
	('mac','time','dio','cheese');

insert into building (name, owner_id) values 
	('mac attack', 3),
	('mac n chz', 3),
	('yackity yack', 2);

select * from building;
select * from building b, owner o where b.owner_id = o.id;




