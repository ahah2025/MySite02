/*******************************************
 web 계정에서 사용 - board
*******************************************/

-- web_db 사용
use web_db;


-- 테이블 목록 조회
show tables;

-- 테이블 삭제

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

select * 
from board
;