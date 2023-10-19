import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Order {

    // 필드
    int orderNumber = 0;
    double totalPrice = 0;


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
    }
    void getBasket () {
        // 주문 내역 확인 및 토탈 가격 확인
        System.out.println("[ Orders ]");
        for(int i = 0; i < this.basket.size(); i++){
            double price = this.basket.get(i).price;
            String name = this.basket.get(i).name;
            String explain = this.basket.get(i).explain;
            System.out.println(name + price + explain);
            this.totalPrice += price;
        }
        System.out.println();
        System.out.println("[ Total ]");
        System.out.println(this.totalPrice);
        System.out.println();
        System.out.print("1. 주문하기     2. 메뉴판");
        System.out.println();
        int orderSelect = orderScanner.nextInt();
        if (orderSelect == 1){
            if (this.basket.isEmpty()){
                System.out.println("장바구니가 비어있습니다.");
            } else {
                setOrderNumber();
            }
        }
        if (orderSelect == 2){
            System.out.println();
            System.out.println("메인화면으로 돌아갑니다.");
        }
    }

    void cancleBasket () {
        // 여기에 주문을 전부 취소하는 메소드가 들어갈 것
        // 진행하던 주문을 취소하시겠습니까?
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.print("1. 확인     2. 취소");
        System.out.println();
        // 스캐너로 확인, 취소
        int orderSelect = orderScanner.nextInt();
        if (orderSelect == 1){
            basket.clear();
            totalPrice = 0;
            System.out.println("진행하던 주문이 취소되었습니다.");
            // 캔슬 하면 메인으로 다시 돌아가야 함
        } else if (orderSelect == 2) {
            System.out.println("메인화면으로 돌아갑니다.");
            // 캔슬 안하면 다시 원래 메뉴로 돌아갈 것
        }
    }

    void setOrderNumber () {
        // 여기에 주문 번호를 넣어주는 메소드가 들어갈 것
        // orderNumber++..?
        System.out.println("주문이 완료되었습니다!");
        System.out.println();
        orderNumber++;
        System.out.println("대기번호는 [ " + orderNumber +" ] 번 입니다.");
        basket.clear();
        totalPrice = 0;
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
        // 주문 번호 주고 3초 뒤 메인으로 다시 돌아가야 함
        // Timer 유틸 쓸거임!! 공부하고 적용
        Timer timer = new Timer();
    }

    void returnMain () {
        // 이걸 디스플레이에 넣는 편이 더 좋을 거 같다.
        // 메인화면으로 돌아가는 메소드 작성
        System.out.println();
        display.getMain();
    }



}
