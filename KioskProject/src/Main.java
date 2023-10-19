import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Order order = new Order();
        Display display = new Display();
        // 메인 화면을 불러오는 메소드
        boolean runner = false;

        while (!runner) {
            display.getMain();

            Scanner mainScanner = new Scanner(System.in);
            int number = mainScanner.nextInt();

            if (number == 1) {
                Product[] burgerSetMenu = new Product[]{
                        new Product("콰트로 치즈 와퍼 세트", "네가지 고품격 치즈와 100% 순쇠고기 패티로 탄생한 버거킹의 스테디 셀러", 11300.0),
                        new Product("더블 비프 불고기 버거 세트", "달콤한 불고기 소스에 더블 패티로 더욱 깊어진 감칠맛", 7900.0),
                        new Product("트러플 머쉬룸 와퍼 세트", "트러플소스 2배로 더욱 깊어진 풍미, 네 가지 머쉬룸이 선사하는 깊고 풍부한 맛의 향연", 11900.0)
                };
                System.out.println();
                System.out.println("버커킹 에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
                System.out.println();
//            System.out.println("[ " + mainMenu[0].name + " MENU ]");

                for (int i = 0; i < burgerSetMenu.length; i++) {
                    System.out.println(i + 1 + ". " + burgerSetMenu[i].name + "\t | " + burgerSetMenu[i].price + "\t | " + burgerSetMenu[i].explain);
                }
                System.out.println();
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. 장바구니 확인");
                System.out.println("5. 주문 취소");
                System.out.println();
                int setOrder = mainScanner.nextInt();
                if (setOrder == 1) {
                    order.addBasket(burgerSetMenu[0]);
                } else if (setOrder == 2) {
                    order.addBasket(burgerSetMenu[1]);
                } else if (setOrder == 3) {
                    order.addBasket(burgerSetMenu[2]);
                } else if (setOrder == 4) {
                    order.getBasket();
                } else if (setOrder == 5) {
                    order.cancleBasket();
                }
            } else if (number == 2) {
                Product[] burgerMenu = new Product[]{
                        new Product("콰트로 치즈 와퍼", "네가지 고품격 치즈와 100% 순쇠고기 패티로 탄생한 버거킹의 스테디 셀러", 8800.0),
                        new Product("더블 비프 불고기 버거", "달콤한 불고기 소스에 더블 패티로 더욱 깊어진 감칠맛", 5900.0),
                        new Product("트러플 머쉬룸 와퍼", "트러플소스 2배로 더욱 깊어진 풍미, 네 가지 머쉬룸이 선사하는 깊고 풍부한 맛의 향연", 9400.0)
                };
                System.out.println();
                System.out.println("버커킹 에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
                System.out.println();
//            System.out.println("[ " + mainmenu[1].name + " MENU ]");
                for (int i = 0; i < burgerMenu.length; i++) {
                    System.out.println(i + 1 + ". " + burgerMenu[i].name +  "\t | " + burgerMenu[i].price + "\t | " + burgerMenu[i].explain );
                }
                System.out.println();
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. 장바구니 확인");
                System.out.println("5. 주문 취소");
                System.out.println();
                int setOrder = mainScanner.nextInt();
                if (setOrder == 1) {
                    order.addBasket(burgerMenu[0]);
                } else if (setOrder == 2) {
                    order.addBasket(burgerMenu[1]);
                } else if (setOrder == 3) {
                    order.addBasket(burgerMenu[2]);
                } else if (setOrder == 4) {
                    order.getBasket();
                } else if (setOrder == 5) {
                    order.cancleBasket();
                }
            } else if (number == 3) {
                Product[] sideMenu = new Product[]{
                        new Product("트러플 치즈 프라이", "트러플소스와 바삭한 프렌치프라이에 고소한 치즈까지", 3900.0),
                        new Product("너겟킹 4조각", "바삭하고 촉촉한 부드러운 너겟킹", 3100.0),
                        new Product("크리미모짜볼 10조각", "겉은 바삭~ 속은 부드러운 크림치즈가 쏘옥, 크리미모짜볼", 5600.0)
                };
                System.out.println();
                System.out.println("버커킹 에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
                System.out.println();
//            System.out.println("[ " + mainmenu[2].name + " MENU ]");
                for (int i = 0; i < sideMenu.length; i++) {
                    System.out.println(i + 1 + ". " + sideMenu[i].name + "\t | " + sideMenu[i].price + "\t | " + sideMenu[i].explain);
                }
                System.out.println();
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. 장바구니 확인");
                System.out.println("5. 주문 취소");
                System.out.println();
                int setOrder = mainScanner.nextInt();
                if (setOrder == 1) {
                    order.addBasket(sideMenu[0]);
                } else if (setOrder == 2) {
                    order.addBasket(sideMenu[1]);
                } else if (setOrder == 3) {
                    order.addBasket(sideMenu[2]);
                } else if (setOrder == 4) {
                    order.getBasket();
                } else if (setOrder == 5) {
                    order.cancleBasket();
                }
            } else if (number == 4) {
                order.getBasket();
            } else if (number == 5) {
                order.cancleBasket();
            } else if (number == 0) {
                order.adminPassword();
            }
        }
    }
}
