import java.util.Scanner;

public class Display {
    // 생성자
    public Display () {}

    // 메소드
    void getMain() {
        System.out.println("버커킹 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println();
        for (int i = 0; i < mainMenu.length; i++) {
            System.out.println(i+1 + ". " + mainMenu[i].name + " | " + mainMenu[i].explain);
        }
        System.out.println();
    }

    // 하위 객체
    Menu[] mainMenu = new Menu[]{
            new Menu("햄버거 세트","햄버거 세트입니다."),
            new Menu("햄버거 단품", "햄버거 단품입니다."),
            new Menu("사이드", "사이드 메뉴입니다.")
    };
}