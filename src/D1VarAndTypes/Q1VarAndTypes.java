package D1VarAndTypes;

import java.util.Scanner;

// Q1. 사용자에게 입력받은 값을 3번 출력하시오.
public class Q1VarAndTypes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println(input);
    System.out.println(input);
    System.out.println(input);
  }
}