use ssafyws;
create table housedeal(
no int auto_increment primary key,
dong varchar(50),
aptname varchar(50),
dealamount varchar(50),
buildyear varchar(50),
dealyear varchar(50),
dealmonth varchar(50),
dealday varchar(50),
area  varchar(50),
floor varchar(50),
jibun varchar(50)
)
;

create table ssafyws.houseinfo(
no int auto_increment primary key,
dong varchar(50),
aptname varchar(50),
buildyear varchar(50),
jibun varchar(50),
lat  varchar(50),
lng varchar(50)
)
;
desc ssafyws.housedeal;

insert into ssafyws.housedeal
values(1,'전민동','늘푸른',2324,1990,1994,3,12,24,9,233)
;
select * from ssafyws.housedeal;

insert into ssafyws.houseinfo values(
1,'관평','푸르지오',2004,2424,24.5,142.5
)
;

select * from ssafyws.houseinfo;
commit;