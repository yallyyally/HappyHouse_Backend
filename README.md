## 프로젝트 기획

![1](https://user-images.githubusercontent.com/44567793/122078454-90a22280-ce37-11eb-8106-6c25ab5b2b50.png)

- 서울특별시 전월세가 공공 데이터와 관련된 주변 데이터들을 지오코딩하여 위경도 데이터를 전처리 한 후 Naver Map을 이용해  매물정보과 다양한 정보를 제공하는 홈페이지

---

## 팀원 소개

![2](https://user-images.githubusercontent.com/44567793/122078468-939d1300-ce37-11eb-91ec-e0af475d8329.png)
---

## 사용 언어 및 프로그램

![3](https://user-images.githubusercontent.com/44567793/122078471-94ce4000-ce37-11eb-9112-293f8053a704.png)
---

## 시스템 구조
### 전체 시스템 구조
![4](https://user-images.githubusercontent.com/44567793/122078535-a0216b80-ce37-11eb-86ad-2f3f269b8dc5.png)

### 프론트엔드, 백엔드
![5](https://user-images.githubusercontent.com/44567793/122078538-a1529880-ce37-11eb-90b8-022b8bf65629.png)

### 백엔드, 데이터베이스, Naver Directions 15 API
![6](https://user-images.githubusercontent.com/44567793/122078540-a1529880-ce37-11eb-9272-3cf713f72c71.png)
---

## 화면설계서

### - 메인화면

![9](https://user-images.githubusercontent.com/44567793/122078544-a283c580-ce37-11eb-86ac-4c73fbc75dba.png)
### - 회원가입

![10](https://user-images.githubusercontent.com/44567793/122078548-a31c5c00-ce37-11eb-828e-48bb2995384a.png)

### - 로그인
![12](https://user-images.githubusercontent.com/44567793/122078552-a3b4f280-ce37-11eb-9f56-7547ccf1de6c.png)

- 로그인 성공 시 상단 우측에 있는 로그아웃, 마이페이지가 활성화 된다.

![13](https://user-images.githubusercontent.com/44567793/122078554-a3b4f280-ce37-11eb-9d03-7e91568a251b.png)

### - 자유게시판 - 페이지네이션 구현
![20](https://user-images.githubusercontent.com/44567793/122078572-a6174c80-ce37-11eb-8046-862a769ea5b4.png)

![Untitled_20](https://user-images.githubusercontent.com/44567793/122080379-2ee2b800-ce39-11eb-9bf5-faff76065af5.png)


### - QnA

![Untitled_22](https://user-images.githubusercontent.com/44567793/122081189-dbbd3500-ce39-11eb-90bd-244ecef6b4f6.png)

### - 공지사항 - 메모장 형식으로 구성

![Untitled_23](https://user-images.githubusercontent.com/44567793/122081211-dfe95280-ce39-11eb-8582-efeef5478880.png)
### - 매물정보 - 지역별 매물
![Untitled_24](https://user-images.githubusercontent.com/44567793/122081320-f8f20380-ce39-11eb-8758-cfc2630027ba.png)
- 원하는 시와 동을 선택시 매물 리스트와 교통(지하철, 버스, 따릉이) 정보 및 교육(학교, 유치원) 정보가 마커로 지도에 표시된다.
![Untitled_25](https://user-images.githubusercontent.com/44567793/122081332-fabbc700-ce39-11eb-813d-ef226736ad5b.png)
![Untitled_26](https://user-images.githubusercontent.com/44567793/122081335-fabbc700-ce39-11eb-81c8-66db12c73591.png)
- 매물리스트에서 매물을 선택하면 상세 정보 및 거래 내역을 차트로 제공한다.

### - 매물정보 - 매물별 길찾기

![Untitled_27](https://user-images.githubusercontent.com/44567793/122081338-fb545d80-ce39-11eb-8504-9fa6bea76984.png)

![Untitled_28](https://user-images.githubusercontent.com/44567793/122081339-fb545d80-ce39-11eb-8a54-5ea1281b7de8.png)

- 원하는 구와 동을 검색하여 지도상에서 원하는 위치를 선택 하면 선택 위치 근처 매물 리스트를 조회할 수 있다.
- 근처 매물의 실시간 예상 이동시간 및 비용 정보를 참고할 수 있다.

### - 동네정보

![Untitled_29](https://user-images.githubusercontent.com/44567793/122081341-fbecf400-ce39-11eb-9ded-4457d6fadaf5.png)

![Untitled_30](https://user-images.githubusercontent.com/44567793/122081344-fc858a80-ce39-11eb-8fb2-0d1dbdb4e589.png)

![Untitled_31](https://user-images.githubusercontent.com/44567793/122081347-fc858a80-ce39-11eb-9756-f43ece81ddb5.png)
- 원하는 구를 선택하면 동별로 인구정보를 랜덤한 색상의 막대 그래프로 제공한다.
- 동별로 전입 및 전출의 인구 수를 표로 제공하고, 증감 현황을 파악할 수 있으며, 1인부터 5인 이상 가구별 인원을 파이차트로 조회할 수 있다.
- 지도상에서 문화 정보(도서관, 미술관, 박물관,공연장, 기타 문화 공간) 위치를 조회하고 선택 문화 공간 마커를 클릭 시 상세 정보를 제공한다.

---

## 기능 설계 세부사항


![Untitled_32](https://user-images.githubusercontent.com/44567793/122081348-fd1e2100-ce39-11eb-897d-db7fdadaefa9.png)
![Untitled_33](https://user-images.githubusercontent.com/44567793/122081352-fd1e2100-ce39-11eb-9dd1-deb27b5859b8.png)
![Untitled_34](https://user-images.githubusercontent.com/44567793/122081356-fdb6b780-ce39-11eb-9e7d-96c46df085d1.png)
![Untitled_35](https://user-images.githubusercontent.com/44567793/122081358-fdb6b780-ce39-11eb-977c-b51b3ef4bca2.png)
![Untitled_36](https://user-images.githubusercontent.com/44567793/122081360-fe4f4e00-ce39-11eb-8975-2ec244abe32c.png)
![Untitled_37](https://user-images.githubusercontent.com/44567793/122081361-fe4f4e00-ce39-11eb-8323-b38de19355fd.png)
![Untitled_38](https://user-images.githubusercontent.com/44567793/122081362-fee7e480-ce39-11eb-95f3-ed08ff073bec.png)
![Untitled_39](https://user-images.githubusercontent.com/44567793/122081364-ff807b00-ce39-11eb-817a-271a60d5fc41.png)
![Untitled_40](https://user-images.githubusercontent.com/44567793/122081368-ff807b00-ce39-11eb-9a05-f42d9e42f854.png)
