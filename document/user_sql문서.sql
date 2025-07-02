/*******************************************
 web 계정에서 사용 - user
*******************************************/

-- web_db 사용
use web_db;

-- 테이블 목록 조회
show tables;

-- 테이블 삭제
drop table user;

-- 유저(회원)테이블 생성
create table user(
	no 			int 		  primary key 	auto_increment,
    id 			varchar(20)   unique 		not null,
    password 	varchar(20)   not null,
    name 		varchar(20),
    gender 		varchar(10)   -- male  female
);

-- 회원추가
insert into user
values(null, 'aaa', '123', '정우성', 'male')
;

-- 로그인(세션)
select 	no,
        name,
        gender
from user
where id = 'aaa'
and password = '123'
;

select 	no,
		id,
        password,
        name,
        gender
from user
;

-- 회원정보 수정폼
select 	no,
		id,
        password,
        name,
        gender
from user
where no = 1
;

-- 회원정보 수정
update user
set name = '이효리',
	password = 'abc',
    gender = 'female'
where no = 1
;

-- 전체 글 갯수 구하기
select count(*) count
from board
;

-- 1 이라는 숫자 포함된것  count(105)
select count(*) count
from board
where title like '%12%'
limit 0, 10
;