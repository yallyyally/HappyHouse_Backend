use happyhouse;

create table happyhouse.seoulGu(
	no int primary key auto_increment,
    guName varchar(40)
)
;

create table happyhouse.seoulDong(
	no int primary key auto_increment,
    guNum int,
    dong varchar(40),
   foreign key(guNum)
   references seoulGu(no)
)
;
-- houseinfo 안에 있는 동 모아서 동 테이블에 넣기..
insert into seoulDong(dong) 
select dong from (select distinct dong from houseinfo) h
;
-- 서울 구 입력
insert into seoulGu(guName)
values('종로구'),('중구'),('용산구'),('성동구'),('광진구'),('동대문구'),('중랑구'),('성북구'),
('강북구'),('도봉구'),('노원구'),('은평구'),('서대문구'),('마포구'),('양천구'),('강서구'),('구로구'),
('금천구'),('영등포구'),('동작구'),('관악구'),('서초구'),('강남구'),('송파구'),('강동구')
;

-- safe 모드 해제 필요
set SQL_SAFE_UPDATES = 0;
-- 구 ~ 동 연계
-- 종로구
update seoulDong
set guNum=1
where dong in('청운효자동','사직동','삼청동','부암동','평창동','무악동','교남동','가회동','종로1가','종로2가','종로3가')
;

-- 중구
update seoulDong
set guNum=2
where dong in('소공동','회현동','명동','필동','장충동','광희동','을지로동','신당동','다산동','약산동',
'청구동','신당5동','동화동','황학동','중림동')
;

-- 용산구
update seoulDong
set guNum=3
where dong in('후암동','용산2가동','남영동','청파동','원효로1동','원효로2동','효창동','용문동','한강로동',
'이촌1동','이촌2동','이태원1동','이태원2동','한남동','서빙고동','보광동')
;

-- 성동구
update seoulDong
set guNum=4
where dong in('왕십리도선동','왕십리2동','마장동','사근동','행당1동','행당2동','응봉동','금호1가동','금호2·3가동',
'금호4가동','옥수동','성수1가1동','성수1가2동','성수2가1동','성수2가3동','송정동','용답동')
;

-- 광진구
update seoulDong
set guNum=5
where dong in('중곡1동','중곡2동','중곡3동','중곡4동','능동','구의1동','구의2동','구의3동',
'광장동','자양1동','자양2동','자양3동','자양4동','화양동','군자동'
)
;
-- 동대문구
update seoulDong
set guNum=6
where dong in('용신동','제기동','전농1동','전농2동','답십리1동','답십리2동','장안1동',
'장안2동','청량리동','회기동','휘경1동','휘경2동','이문1동','이문2동')
;
-- 중랑구
update seoulDong
set guNum=7
where dong in('면목본동','면목2동','면목3동','면목8동','면목4동','면목5동','면목7동','상봉1동',
'상봉2동','중화1동','중화2동','묵1동','묵2동','망우본동','망우3동','신내1동','신내2동')
;

-- 성북구
update seoulDong
set guNum=8
where dong in('성북동','삼선동','동선동','돈암1동','돈암2동','안암동','보문동','정릉1동','정릉2동',
'정릉3동','정릉4동','길음1동','길음2동','종암동','월곡1동','월곡2동','장위1동','장위2동','장위3동','석관동'
)
;

-- 강북구
update seoulDong
set guNum=9
where dong in('삼양동','미아동','송중동','송천동','삼각산동','번1동','번2동','번3동','수유1동','수유2동','수유3동',
'우이동','인수동')
;

-- 도봉구
update seoulDong
set guNum=10
where dong in('쌍문1동','쌍문2동','쌍문3동','쌍문4동','방학1동','방학2동','방학3동','창1동','창2동','창3동','창4동','창5동',
'도봉1동','도봉2동'
);

-- 노원구
update seoulDong
set guNum=11
where dong in('월계1동','월계2동','월계3동','공릉1동','공릉2동','하계1동','하계2동','중계본동','중계1동','중계2동','중계3동',
'중계4동','상계1동','상계2동','상계3동','상계4동','상계5동','상계6동','상계7동','상계8동','상계9동','상계10동')
;
-- 은평구
update seoulDong
set guNum=12
where dong in ('녹번동','불광1동','불광2동','갈현1동','갈현2동','구산동','대조동','응암1동','응암2동','응암3동','역촌동'
,'신사1동','신사2동','증산동','수색동','진관동')
;

-- 서대문구
update seoulDong
set guNum=13
where dong in('충현동','천연동','북아현동','신촌동','연희동','홍제1동','홍제2동','홍제3동','홍은1동','홍은2동','남가좌1동',
'남가좌2동','북가좌1동','북가좌2동'
)
;

-- 마포구
update seoulDong
set guNum=14
where dong in('공덕동','아현동','도화동','용강동','대흥동','염리동','신수동','서강동','서교동','합정동','망원1동',
'망원2동','연남동','성산1동','성산2동','상암동')
;

-- 강서구
update seoulDong
set guNum=16
where dong in ('염창동','등촌1동','등촌2동','등촌3동','화곡본동','화곡1동','화곡2동','화곡3동','화곡4동','화곡6동','화곡8동','우장산동','가양1동','가양2동','가양3동','발산1동','공항동','방화1동','방화2동','방화3동');

-- 구로구
update seoulDong
set guNum=17
where dong in 
('신도림동','구로1동','구로2동','구로3동','구로4동','구로5동','가리봉동','수궁동','고척1동','고척2동','개봉1동',
'개봉2동','개봉3동','오류1동','오류2동','항동');

-- 금천구
update seoulDong
set guNum=18
where dong in('가산동','독산1동','독산2동','독산3동','독산4동','시흥1동','시흥2동','시흥3동','시흥4동','시흥5동'
)
;

-- 영등포구
update seouldong
set gunum=19
where dong in('영등포본동','영등포동','여의동','당산1동','당산2동','도림동','문래동','양평1동','양평2동','신길1동',
'신길3동','신길4동','신길5동','신길6동','신길7동','대림1동','대림2동','대림3동');

-- 동작구
update seouldong
set gunum=20
where dong in('노량진1동','노량진2동','상도1동','상도2동','상도3동','상도4동','흑석동','사당1동','사당2동','사당3동','사당4동',
'사당5동','대방동','신대방1동','신대방2동')
;
-- 관악구
-- select * from seouldong-- 
update seouldong
set gunum=21
where dong in('보라매동','은천동','성현동','중앙동','청림동','행운동','청룡동','낙성대동','인헌동','남현동','신림동','신사동',
'조원동','미성동','난곡동','난향동','서원동','신원동','서림동','삼성동','대학동');

-- 서초구
-- select * from seouldong-- 
update seouldong
set gunum=22
where dong in('서초1동','서초2동','서초3동','서초4동','잠원동','반포본동','반포1동','반포2동','반포3동','반포4동','방배본동','방배1동',
'방배2동','방배3동','방배4동','양재1동','양재2동','내곡동'
);

-- 강남구
-- select * from seouldong
update seouldong
set gunum=23
where dong in('신사동','압구정동','청담동','논현1동','논현2동','삼성1동','삼성2동','대치1동','대치2동','대치4동',
'역삼1동','역삼2동','도곡1동','도곡2동','개포1동','개포2동','개포4동','일원본동','일원1동','일원2동','수서동','세곡동'
)
;

-- 송파구-- 
update seouldong
set gunum=24
where dong in('풍납1동','풍납2동','거여1동','거여2동','마천1동','마천2동','방이1동','방이2동','오륜동','오금동','송파1동',
'송파2동','석촌동','삼전동','가락본동','가락1동','가락2동','문정1동','문정2동','장지동','위례동','잠실본동','잠실2동','잠실3동',
'잠실4동','잠실6동','잠실7동');

-- 강동구
update seouldong
set gunum=25
where dong in('강일동','상일동','명일1동','명일2동','고덕1동','고덕2동','암사1동','암사2동','암사3동','천호1동','천호2동','천호3동','성내1동','성내2동',
'성내3동','길동','둔촌1동','둔촌2동');

-- 구 정보에 없던 동들 보충 (guNum null 대비)
update seouldong
set gunum = (select no from seoulgu where guname = '종로구')
where dong='내수동'
;


update seouldong
set gunum = (select no from seoulgu where guname = '종로구')
where dong='견지동'
;

update seouldong
set gunum = (select no from seoulgu where guname = '종로구')
where dong='효제동'
;

update seouldong
set gunum = (select no from seoulgu where guname = '중구')
where dong='흥인동'
;


update seouldong
set gunum = (select no from seoulgu where guname = '동대문구')
where dong='휘경동'
;

update seouldong
set gunum = (select no from seoulgu where guname = '중구')
where dong like '%회현%'
;

update seouldong
set gunum = (select no from seoulgu where guname = '강서구')
where dong like '%화곡%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%홍파%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%홍제%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%성동%')
where dong like '%홍익%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%홍은%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%현저%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%현석%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%행촌%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%성동%')
where dong like '%행당%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%한강로%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%하중%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%하월곡%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%하왕십%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%노원%')
where dong like '%하계%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%필운동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%필동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%풍납%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%평동%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%토정%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%충정로%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%충신동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%청파%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%청운%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%청암%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강동%')
where dong like '%천호%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%천왕%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%창천%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%창전%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%창신%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%도봉%')
where dong = '창동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중랑%')
where dong like '중화동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong='중동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%광진%')
where dong like '%중곡동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%노원%')
where dong like '%중계%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%정릉동%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '정동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동대문%')
where dong like '%전농%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%장충동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%장위%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%동대문%')
where dong like '%장안동%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%잠실%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%광진%')
where dong like '%자양%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%자곡%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%일원동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%인현동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%인의동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%익선%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%이화%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%이태원%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%이촌동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동대문%')
where dong like '%이문동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%은평%')
where dong like '%응암%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%을지로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%노원%')
where dong like '%월계%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%율현%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%원효로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서초%')
where dong like '%우면%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%용산%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동대문%')
where dong like '%용두%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%온수동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%옥인동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%오장동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%오류%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%예장%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%영천동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%영등포동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%연건%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%역삼%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%여의도%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%양평동%'
;

update seouldong
set gunum = (select no from seoulgu where guname like '%서초구%')
where dong like '%양재%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강동%')
where dong like '%암사%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%안암동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%도봉%')
where dong like '%쌍문%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%신천동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%신창동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%양천%')
where dong like '%신정동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%양천%')
where dong like '%신월%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%신영%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동대문%')
where dong like '%신설동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동작구%')
where dong like '%신대방%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중랑%')
where dong like '%신내동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%신길동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%신공덕동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%신계동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%금천%')
where dong like '%시흥%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%숭인%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%순화%';
update seouldong
set gunum = (select no from seoulgu where guname like '%강북%')
where dong like '%수유%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%송파%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성동%')
where dong like '%성수동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포구%')
where dong like '%성산%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%성북%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강동구%')
where dong like '%성내%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서초%')
where dong like '%서초%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%상월곡%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성동%')
where dong like '%상왕십리%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%상수동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중랑%')
where dong like '%상봉%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동작%')
where dong like '%상도%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%노원%')
where dong like '%상계%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%삼선동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%산천동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%산림동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동작%')
where dong like '%사당동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%은평%')
where dong like '%불광%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%북가좌%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%관악구%')
where dong like '%봉천%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동작구%')
where dong ='본동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북구%')
where dong like '%보문동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강북%')
where dong ='번동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강서%')
where dong like '%방화동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%도봉%')
where dong like '%방학동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%방이동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%문정동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서초%')
where dong like '%방배동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서초%')
where dong like '%반포%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%문배동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%문래동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%묵정%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중랑%')
where dong ='묵동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%양천%')
where dong = '목동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강동%')
where dong like '%명일%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%명륜%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중랑%')
where dong like '%면목%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%망원%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중랑%')
where dong like '%망우%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%마포%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%마천%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강서%')
where dong like '%마곡%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강서%')
where dong like '%등촌%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강동%')
where dong like '%둔촌%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%동자%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%동숭동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%동소문%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%동선%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%동빙고%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%돈암%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%금천%')
where dong like '%독산%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%도원%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성동%')
where dong like '%도선%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%도봉%')
where dong like '%도봉%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%도곡%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%대현동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%대치%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%대림%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%당주%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%영등포%')
where dong like '%당산%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동대문%')
where dong like '%답십리%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%누상%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%논현%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%동작%')
where dong like '%노량진%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%마포%')
where dong like '%노고산%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%냉천%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강서%')
where dong like '%내발산%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%충무로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%남창동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%중구%')
where dong like '%남대문%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%서대문%')
where dong like '%남가좌%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성북%')
where dong like '%길음%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%성동%')
where dong like '%금호동%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong ='궁동'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%광진%')
where dong like '%구의%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%구로%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%구기%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%종로%')
where dong like '%교북%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%노원%')
where dong like '%공릉%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%고척%' and gunum is null
;
update seouldong
set gunum = (select no from seoulgu where guname like '%노원%')
where dong like '%공릉%' 
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%고척%' and gunum is null;

update seouldong
set gunum = (select no from seoulgu where guname like '%강동%')
where dong like '%고덕%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%거여%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강남%')
where dong like '%개포%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%구로%')
where dong like '%개봉%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%은평%')
where dong like '%갈현%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%용산%')
where dong like '%갈월%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%강서%')
where dong like '%가양%'
;
update seouldong
set gunum = (select no from seoulgu where guname like '%송파%')
where dong like '%가락%'
;

-- 동, 구번호, 구 이름 조회시
SELECT seouldong.no '동번호', seouldong.dong '동이름',seouldong.guNum '구 번호',seoulgu.guName '구 이름' FROM seouldong left join seoulgu
on seouldong.guNum = seoulgu.no
;

delete from seouldong where dong= 'dong';
commit;
