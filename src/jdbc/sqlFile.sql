-- 기록용 나중에 유저와 비번 db를 확인한 목적
create user 'javaUser'@'localhost' identified by 'mysql';
create database javadb;
grant all privileges on javadb.* to 'javaUser'@'localhost' with grant option;
flush privileges;

exit;
mysql -ujavaUser -pmysql
use javadb

create table product(
pno int auto_increment,
pname varchar(50) not null,
price int default 0,
regdate datetime default now(),
madeby text,
primary key(pno));
-- db는 수정되거나 추가되면 변경 구문을 써놓아야함