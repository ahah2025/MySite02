-- db 선택
use web_db;

-- 테이블 목록 조회
show tables;

-- 테이블 삭제
drop table file;

-- 테이블생성 
create table file(
    serialNo      int           auto_increment    Primary key ,
	orgName       varchar(50)   not null,   
	exName        varchar(50)   not null,   
	saveName      varchar(50)   not null,  
	filePath      varchar(50)   not null,   
	filesize      varchar(100)
);

-- 조회
select  serialNo,
		orgName,
        exName,
		saveName,
        filePath,
        filesize
from file
;

-- 등록
insert into file
values(null,'Yoo-Jae-Suk.jpg','jpg','yoo.jpg',
	   'C:\JavaStudy\upload\yoo.jpg',
       '82185')
;

insert into file
values(null,'Gangho-dong.jpg','jpg','175.jpg',
	   'C:\JavaStudy\upload\175.jpg',
       '49876')
;

insert into file
values(null,'JeonSoMin.jpg','jpg','932.jpg',
	   'C:\JavaStudy\upload\932.jpg',
       '79729')
;