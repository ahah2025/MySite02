use web_db;

create table user(
    no			integer          primary key          auto_increment,
    id			varchar(20)      not null,
    password    varchar(20),
    name	    varchar(20),
    gender	    varchar(10)
);

-- 테이블조회
select  no,
        id,
        password,
        name,
        gender
from user
;

-- id 조회
select *
from user
where id = 'aaa'
;


-- 등록
insert into user
values(null, 'ddd' ,'123','김철수', '남성')
;

