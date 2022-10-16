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

create sequence board_num;
delete sequence board_num;

-- SQLINES LICENSE FOR EVALUATION USE ONLY
create table board(
num number(10) not null primary key,
writer varchar2(10) not null,
email varchar2(30),
subject varchar2(255) not null,
password varchar2(16) not null,
reg_date timestamp(0) not null,
readcount number(10) default 0,
ref number(10) not null,
re_step number(5) not null,
re_level number(5) not null,
content clob not null,
ip varchar2(20) not null
);

delete sequence board_seq;
-- Generate ID using sequence and trigger
create sequence board_seq start with 1 increment by 1;

create or replace trigger board_seq_tr
 before insert on board for each row
 when (new.num is null)
begin
 select board_seq.nextval into :new.num from dual;
end;
/
