-- db 선택
use web_db;

-- 테이블 목록 조회
show tables;

-- 테이블생성 
create table fileupload(
    serialNo      int           auto_increment    Primary key ,
	orgName       varchar(50),   
	exName        varchar(50),   
	saveName      varchar(50),  
	filePath      varchar(50),   
	filesize      varchar(100)
);

-- 조회
select *
from fileupload
;

-- 등록
insert into fileupload
values(null,'JeonSoMin.jpg','jpg','1752552729730ca59f8dd-10fd-444f-81f9-400c63dcea17.jpg',
	   'C:\JavaStudy\upload\1752552729730ca59f8dd-10fd-444f-81f9-400c63dcea17.jpg',
       '79729')
;