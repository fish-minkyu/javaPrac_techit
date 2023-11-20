import java.util.Scanner;

public class HelloJava {
  public static void main(String[] args) {
    System.out.println("Hello, World");

    // 주석

    /* 슬래시 별 + 별 슬래시 사이의 내용은 주석이 된다. */
    System.out.println("간단하게 한가지만 더!");

    // 사용자 입력도 받기
    Scanner scanner = new Scanner(System.in);
    // scanner.nextLine()
    // : 사용자 입력을 받기 위한 코드
    System.out.println(scanner.nextLine());
  }
}
