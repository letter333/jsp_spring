create table member (
id varchar2(50) not null primary key,
password varchar2(16) not null,
name varchar2(255) not null,
reg_date timestamp not null
);

create table test (
num_id int not null primary key,
title varchar2(50) not null,
content long not null
);

insert into member(id, password, name, reg_date) values ('kingdora@dragon.com', '12345', '±è°³µ¿', sysdate);
insert into member(id, password, name, reg_date) values ('honkd@aaa.com', '1111', 'È«±æµ¿', sysdate);
select * from member;
delete from member;