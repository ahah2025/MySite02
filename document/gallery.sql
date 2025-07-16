-- db 선택
use web_db;

-- 테이블 목록 조회
show tables;

-- 테이블 삭제
drop table gallery;

-- 테이블생성 
create table gallery(
    no      	  int           Primary key     auto_increment,
    content		  varchar(1000),
    filePath      varchar(500),   
	orgName       varchar(200),   
	saveName      varchar(500),  
	filesize      int
);

-- 조회
select *
from gallery
;

select 	no,
		content,
		filePath,
		orgName,
		saveName,
		filesize
from gallery
order by no asc  
;        

select  g.no,
		u.no userNo,
		g.content,
        g.filePath,
		g.orgName,
        g.saveName,
        g.fileSize
from gallery g, user u
where g.no = u.no 
order by no asc
;

-- 유재석 등록
insert into gallery
values(null,'갤러리 잘 보고 갑니다','C:\JavaStudy\upload\yoo.jpg',
	   'Yoo-Jae-Suk.jpg','yoo.jpg','82185')
;

-- 강호동 등록
insert into gallery
values(null,'갤러리 보고 감','C:\JavaStudy\upload\175.jpg',
	  'Gangho-dong.jpg','175.jpg','49876')
;

-- 전소민 등록
insert into gallery
values(null,'갤러리 너무 예뻐요','C:\JavaStudy\upload\932.jpg',
	  'JeonSoMin.jpg','932.jpg','79729')
;