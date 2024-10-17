-- 회원 리스트 table
create table userlist (
num int auto_increment,
user_id varchar(10) not null,
passwd varchar(15) not null,
nickname varchar(10),
fishrod varchar(10) default "normal",
money int default 10000,
bait int default 0,
primary key(num)
);
-- 물고기 table
create table fish (
fish_no int auto_increment,
fish_name varchar(20),
price int not null,
default_size int,
primary key(fish_no)
);
-- 인벤토리 table
create table inventory (
inven_id int auto_increment,
num int not null,
item_cnt int,
fish_no int,
fish_size int,
primary key(inven_id, item_cnt),
foreign key(num) references userlist(num),
foreign key(fish_no) references fish(fish_no)
);
-- 장소 table
create table state (
state_id varchar(10),
state_name varchar(15) not null,
enter_fee int,
primary key(state_id)
);
-- 발견장소 table
create table fish_appear(
state_id varchar(10),
fish_no int,
PRIMARY KEY (state_id, fish_no),
foreign key(state_id) references state(state_id),
foreign key(fish_no) references fish(fish_no)
);
INSERT INTO fish (fish_name, price, default_size) --size는 cm 단위
VALUES
("전어", 14900, 25),    
("광어", 25000, 45),
("갑오징어", 16900, 20),
("쭈꾸미", 14000, 20),
("장화", 0, 0),
("우럭", 20000, 30), -- 초급 특산물
("참치", 70000, 55), -- 중급 특산물
("개복치", 42000, 180); -- 고급 특산물
INSERT INTO state (state_id, state_name, enter_fee)
VALUES
("A", "왕초보 낚시터", 0),
("B", "초급 낚시터", 3000),
("C", "중급 낚시터", 5000),
("D", "고급 낚시터", 10000);
INSERT INTO fish_appear values
("A",1), ("A",2), ("A",3), ("A",4), ("A",5),
("B",1), ("B",2), ("B",3), ("B",4), ("B",5),("B",6),
("C",1), ("C",2), ("C",3), ("C",4), ("C",5),("C",6),
("D",1), ("D",2), ("D",3), ("D",4), ("D",5),("D",6);
);