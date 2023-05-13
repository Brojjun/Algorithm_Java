select book_id, author_name, Date_format(published_date,"%Y-%m-%d") as published_date
from book b join author u
on b.author_id = u.author_id
where category="경제"
order by published_date;
