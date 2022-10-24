select * from sequences;
call create_sequence('test');

select nextval('test');
select currval('test');