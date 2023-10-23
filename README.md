# KioskProject

개발 기간 (2023-10-18 ~ 2023-10-23)

<h1>2023-10-18</h1>
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F14N8V%2FbtsyLGN4qCe%2FBZHkq7kvRK6rkSTtUYkvZ0%2Fimg.png"><br>
Menu Class
메뉴 클래스 인스턴스화를 배열로 시켜 생성자에 매개변수를 Name, Explain으로 받고<br>
메인화면에 출력시킬 것이다<br>
 
Product Class
메뉴 클래스 설명과 비슷한데, 추가로 필드에 price를 추가하고 생성자에 매개변수를 Name, Explain, Price로 받고 상품 선택화면에 출력할 것이다.<br>
 
Order Class<br>
basket이라는 List에 주문한 것을 담아야한다.<br>
addOrder 메소드를 이용해 담아 줄 것이고<br>
cancleOrder 메소드를 통해 주문을 취소하면 List 클리어를 할 것이다.<br>
getOrder메소드를 사용하면 basket에 담긴 리스트를 보여줄것이고<br>
orderNumber메소드 통해 주문 번호를 뽑아주는 메소드<br>
returnMain 메소드를 통해 메인화면으로 돌아가는 메소드를 만들 것이다.<br>

이렇게 계획했다.<br>

근데 메인 클래스가 너무 지저분하다.. 그래서 생각한 것이<br>
화면 전용 클래스를 만들고 화면 메소드를 새로 만들자이다....<br>

내일은 상품 메뉴 등등 디스플레이에 넣고... 키오스크가 계속 돌아가게 하는 것도 구현하고...<br>
Order 클래스에 있는 returnMain 이걸 Display에 넣어주고 깃 푸쉬하고<br>
계속 리팩토링 하면서 Class의 사용처를 명확히 하고 코드 정리를 좀 해야겠다는 생각..<br>

<h1>2023-10-19</h1>

장바구니
장바구니에 상품 추가
장바구니에 담긴 상품 확인 + 장바구니 내의 상품 가격 합계
장바구니 비우기
주문 및 주문번호 출력

이제 리팩토링을 해야하는데 진짜 감이 안잡힌다..
사실 진짜 뼈대만 잡아놓은 느낌이라서
Class의 사용처를 명확히 하고 메소드를 진짜 잘활용하는 과정으로 리팩토링을 하고 싶은데...

<h1>2023-10-20</h1>
자바의 정석 공부

<h1>2023-10-23</h1>

Display 클래스 적극 활용하기 위해 Main에 있던 것들 Display 메소드로 변경<br>
Order에 있었던 SalesTotalPrice 메소드 Display에 넣기<br>
판매 상품 목록 SalesTotalProduct 메소드 추가<br>
- Admin<br>
  Admin Menu 추가<br>
  판매 상품 목록 SalesTotalProduct 메소드 추가<br>
  Admin 비밀번호 변경 기능 추가<br>

