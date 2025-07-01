/*******************************************
 web 계정에서 사용 - board
*******************************************/

-- web_db 사용
use web_db;


-- 테이블 목록 조회
show tables;

-- 테이블 삭제
drop table board;

-- board(게시판)테이블 생성
create table board(
	no 			int 		  primary key 	auto_increment,
    user_no 	int,
    title 		varchar(500)  not null,
    content 	text,
    hit 		int,
    reg_dete 	datetime	  not null,
    constraint board_fk foreign key(user_no)
    references user(no)
);

-- 조회
select * 
from user
;

-- 게시물 등록
insert into board
values(null, 6, '여섯번째 게시물제목', '여섯번째 게시물내용', 0, now())
;

insert into board
values(null, 7, '일곱번째 게시물제목', '일곱번째 게시물내용', 0, now())
;


-- 전체리스트
select 	b.no,
		b.title,
        b.content,
        b.hit,
        date_format(b.reg_date, "%Y-%m-%d") regDate,
        u.no userNo,
        u.name userName
from user u, board b
where u.no = b.user_no
;


-- 전체조회
select *
from board
;