create table Student(
sno int auto_increment,
sid int not null,
sname varchar(50) not null,
birth varchar(20),
phone varchar(20),
address text,
regdate datetime default now(),
primary key(sno));