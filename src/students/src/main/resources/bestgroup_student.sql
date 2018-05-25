create table student(
	name varchar(50) not null,
	ser_name varchar(50) not null,
	phone varchar(30) not null,
	email varchar(70) not null,
	constraint student_phone_uindex
		unique (phone),
	constraint student_email_uindex
		unique (email)
)