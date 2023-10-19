import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Order {

    // 필드
    int orderNumber;
    double totalPrice;


    // 생성자
    public Order(){

    }

    // 하위 객체
    ArrayList<Product> basket = new ArrayList<>();
    Scanner orderScanner = new Scanner(System.in);
    Display display = new Display();

    // 메소드
    void addBasket (Product orderProduct) {
        // 여기에 주문을 추가하는 메소드가 들어갈 것
        // basket에 담고 메인으로 돌아가야함

        System.out.println(orderProduct.name + orderProduct.price + orderProduct.explain);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인   2. 취소");
        orderScanner.nextInt();
        this.basket.add(orderProduct);
        System.out.println(orderProduct.name + "가 장바구니에 추가되었습니다.");
        returnMain();
    }
    void getBasket () {
        // 주문 내역 확인 및 토탈 가격 확인
        System.out.println("[ Orders ]");
        System.out.println(basket.toString());
        System.out.println("[ Total ]");
        System.out.println("가격!!!!!!!");
        System.out.println();
        System.out.print("1. 주문하기     2. 메뉴판");
        System.out.println();
        int orderSelect = orderScanner.nextInt();

        if (orderSelect == 2){
            returnMain();
        }
    }

    void cancleBasket () {
        // 여기에 주문을 전부 취소하는 메소드가 들어갈 것

        // 진행하던 주문을 취소하시겠습니까?
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        // 스캐너로 확인, 취소

        // 캔슬 하고 메인으로 다시 돌아가야 함
        returnMain();
    }

    int setOrderNumber () {
        // 여기에 주문 번호를 넣어주는 메소드가 들어갈 것
        // orderNumber++..?

        // 주문 번호 주고 3초 뒤 메인으로 다시 돌아가야 함
        // Timer 유틸 쓸거임!! 공부하고 적용
        Timer timer = new Timer();
        returnMain();
        return setOrderNumber();
    }

    void returnMain () {
        // 이걸 디스플레이에 넣는 편이 더 좋을 거 같다.
        // 메인화면으로 돌아가는 메소드 작성
        System.out.println();
        display.getMain();
    }



}
