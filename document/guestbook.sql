select * 
from guestbook
;

select * 
from guestbook
ORDER BY no aSC;
;

select max(no)
from guestbook
;

select  no,
		name,
        content,
        reg_date regDate
from guestbook
where no = no
;