##############################################
# guestbook 만들기
##############################################

-- -----------------------------------------
# guestbook 계정에서 실행
-- -----------------------------------------
 
-- db 선택
use web_db;

-- 테이블 목록 조회
show tables;

-- 테이블 삭제
drop table guestbook;

-- 테이블생성 
create table guestbook(
    no			int              primary key          auto_increment,
    name		varchar(80)      not null,
    password   	varchar(20),
    content	    text,
    reg_date    datetime
);

-- 테이블조회
select * from guestbook;

select  no,
        name,
        password,
        content,
        reg_date as regDate
from guestbook
order by no desc
;

select  no,
        name,
        password,
        content,
        reg_date
from guestbook
where no = 5
;

-- 등록
insert into guestbook
values(null, '이광수','123','다녀갑니다.',now())
;

insert into guestbook
values(null, '최수종','123','다녀갑니다.',now())
;

insert into guestbook
values(null,'차은우','123','다녀갑니다',now())
;

-- 수정
update guestbook
set  name = '유재석' , 
     password = '5555',
     content = '안녕하세요. 유재석입니다.' 
where no = 18
;

-- 삭제
delete from guestbook
where no = 12
and password = 2222
;
