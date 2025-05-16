CREATE TABLE card 
(consumerId VARCHAR(10) -- 고객아이디
, amount int -- 수량
);

CREATE TABLE ticket 
(consumerId VARCHAR(10) -- 고객아이디
, countnum int CHECK(countnum < 5)  -- 갯수 /5장이상 못사게
);

select * from card;
select * from ticket;

delete from card;
delete from ticket;