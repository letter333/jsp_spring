insert into mvc_board(bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values
(nextval('mvc_board'), '이름', '제목', '게시글내용', 0, currval('mvc_board'), 0, 0);
select * from mvc_board;
update mvc_board set bHit = bHit + 1 where bId=1;