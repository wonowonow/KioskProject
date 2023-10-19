import java.util.*;

public class Main {
    public static void main(String[] args) {
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
                        new Product("햄버거 세트 1", "햄버거 세트 1입니다.", 5000.0),
                        new Product("햄버거 세트 2", "햄버거 세트 2입니다.", 5000.0),
                        new Product("햄버거 세트 3", "햄버거 세트 3입니다.", 5000.0)
                };
                System.out.println("버커킹 에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
                System.out.println();
//            System.out.println("[ " + mainMenu[0].name + " MENU ]");

                for (int i = 0; i < burgerSetMenu.length; i++) {
                    System.out.println(i + 1 + ". " + burgerSetMenu[i].name + " | " + burgerSetMenu[i].explain + " | " + burgerSetMenu[i].price);
                }
                System.out.println("4. 장바구니 확인");
                System.out.println();
                int setOrder = mainScanner.nextInt();
                if (setOrder == 1) {
                    order.addBasket(burgerSetMenu[0]);
                }
                if (setOrder == 4) {
                    order.getBasket();
                }
            } else if (number == 2) {
                Product[] burgerMenu = new Product[]{
                        new Product("햄버거 단품 1", "햄버거 단품 1입니다.", 5000.0),
                        new Product("햄버거 단품 2", "햄버거 단품 2입니다.", 5000.0),
                        new Product("햄버거 단품 3", "햄버거 단품 3입니다.", 5000.0)
                };
                System.out.println("버커킹 에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
                System.out.println();
//            System.out.println("[ " + mainmenu[1].name + " MENU ]");
                for (int i = 0; i < burgerMenu.length; i++) {
                    System.out.println(i + 1 + ". " + burgerMenu[i].name + " | " + burgerMenu[i].explain + " | " + burgerMenu[i].price);
                }
            } else if (number == 3) {
                Product[] sideMenu = new Product[]{
                        new Product("사이드 1", "사이드 1입니다.", 5000.0),
                        new Product("사이드 2", "사이드 2입니다.", 5000.0),
                        new Product("사이드 3", "사이드 3입니다.", 5000.0)
                };
                System.out.println("버커킹 에 오신걸 환영합니다.");
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
                System.out.println();
//            System.out.println("[ " + mainmenu[2].name + " MENU ]");
                for (int i = 0; i < sideMenu.length; i++) {
                    System.out.println(i + 1 + ". " + sideMenu[i].name + " | " + sideMenu[i].explain);
                }
            }
        }
    }
}
