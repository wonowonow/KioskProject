import java.util.Scanner;

public class Display {
    // 생성자
    public Display () {}

    // 메소드
    void getMain() throws InterruptedException {
        System.out.println();
        System.out.println("버커킹 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println();
        System.out.println("[ BURGERKING MENU ]");
        for (int i = 0; i < mainMenu.length; i++) {
            System.out.println(i+1 + ". " + mainMenu[i].name + " | " + mainMenu[i].explain);
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. 장바구니 확인");
        System.out.println("5. 주문 취소");
        System.out.println();
        Scanner mainScanner = new Scanner(System.in);
        int number = mainScanner.nextInt();

        if (number == 1) {
            getBurgerSetMenu();
        } else if (number == 2) {
            getBurgerMenu();
        } else if (number == 3) {
            getSideMenu();
        } else if (number == 4) {
            order.getBasket();
        } else if (number == 5) {
            order.cancleBasket();
        } else if (number == 0) {
            adminPassword();
        } else {
            System.out.println("잘못된 값을 입력했습니다. 메인으로 돌아갑니다.");
        }
    }

    void getBurgerSetMenu() throws InterruptedException {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println();
        System.out.println("버커킹 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.println("[ " + mainMenu[0].name + " MENU ]");

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
        } else {
            System.out.println("잘못된 값을 입력했습니다. 메인으로 돌아갑니다.");
        }
    }

    void getBurgerMenu() throws InterruptedException {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println();
        System.out.println("버커킹 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.println("[ " + mainMenu[1].name + " MENU ]");
        for (int i = 0; i < burgerMenu.length; i++) {
            System.out.println(i + 1 + ". " + burgerMenu[i].name +  "\t | " + burgerMenu[i].price + "\t | " + burgerMenu[i].explain );
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println((burgerMenu.length+1)+". 장바구니 확인");
        System.out.println((burgerMenu.length+2)+". 주문 취소");
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
        } else {
            System.out.println("잘못된 값을 입력했습니다. 메인으로 돌아갑니다.");
        }
    }

    void getSideMenu() throws InterruptedException {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println();
        System.out.println("버커킹 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");
        System.out.println();
        System.out.println("[ " + mainMenu[2].name + " MENU ]");
        for (int i = 0; i < sideMenu.length; i++) {
            System.out.println(i + 1 + ". " + sideMenu[i].name + "\t | " + sideMenu[i].price + "\t | " + sideMenu[i].explain);
        }
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println((sideMenu.length+1)+". 장바구니 확인");
        System.out.println((sideMenu.length+2)+". 주문 취소");
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
        } else {
            System.out.println("잘못된 값을 입력했습니다. 메인으로 돌아갑니다.");
        }
    }
    void adminPassword () {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println();
        System.out.println("[ ONLY ADMIN ]");
        System.out.println();
        System.out.println("1. 비밀번호 입력  2.돌아가기");
        System.out.println();
        int mainSelect = mainScanner.nextInt();
        if (mainSelect == 1) {
            System.out.println();
            System.out.println("[ 비밀번호를 입력하세요 ]");
            System.out.println();
            int password = mainScanner.nextInt();
            if (password == 1004) {
                getSalesTotalPrice();
            } else {
                System.out.println();
                System.out.println("비밀번호를 틀렸습니다.");
                adminPassword();
            }
        } else if (mainSelect == 2) {
            System.out.println();
            System.out.println("메인화면으로 돌아갑니다.");
        } else {
            System.out.println("잘못된 값을 입력했습니다.");
            adminPassword();
        }
    }

    void getSalesTotalPrice () {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println();
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.println("현재까지 총 판매된 금액은 [ " + order.salesTotalPrice + " ] 입니다.");
        System.out.println();
        System.out.println("1. 돌아가기");
        System.out.println();
        int mainSelect = mainScanner.nextInt();
        if (mainSelect == 1) {
            System.out.println();
            System.out.println("메인화면으로 돌아갑니다.");
        } else {
            System.out.println("잘못된 값을 입력했습니다.");
            getSalesTotalPrice();
        }
    }

    // 하위 객체
    Menu[] mainMenu = new Menu[]{
            new Menu("햄버거 세트","햄버거 세트입니다."),
            new Menu("햄버거 단품", "햄버거 단품입니다."),
            new Menu("사이드", "사이드 메뉴입니다.")
    };

    Product[] burgerSetMenu = new Product[]{
            new Product("콰트로 치즈 와퍼 세트", "네가지 고품격 치즈와 100% 순쇠고기 패티로 탄생한 버거킹의 스테디 셀러", 11300.0),
            new Product("비프 불고기 버거 세트", "불고기 소스와 불맛 가득 100% 순쇠고기 패티의 감칠맛나는 조화", 7900.0),
            new Product("트러플 머쉬룸 와퍼 세트", "트러플소스 2배로 더욱 깊어진 풍미, 네 가지 머쉬룸이 선사하는 깊고 풍부한 맛의 향연", 11900.0)
    };

    Product[] burgerMenu = new Product[]{
            new Product("콰트로 치즈 와퍼", "네가지 고품격 치즈와 100% 순쇠고기 패티로 탄생한 버거킹의 스테디 셀러", 8800.0),
            new Product("비프 불고기 버거", "불고기 소스와 불맛 가득 100% 순쇠고기 패티의 감칠맛나는 조화", 5900.0),
            new Product("트러플 머쉬룸 와퍼", "트러플소스 2배로 더욱 깊어진 풍미, 네 가지 머쉬룸이 선사하는 깊고 풍부한 맛의 향연", 9400.0)
    };

    Product[] sideMenu = new Product[]{
            new Product("치즈 프라이", "바삭한 프렌치프라이에 고소한 치즈가 듬뿍 치즈프라이", 3900.0),
            new Product("너겟킹 4조각", "바삭하고 촉촉한 부드러운 너겟킹 (4EA)", 3100.0),
            new Product("크리미모짜볼", "겉은 바삭~ 속은 부드러운 크림치즈가 쏘옥, 크리미모짜볼 (10EA)", 5600.0)
    };


    Order order = new Order();

}
