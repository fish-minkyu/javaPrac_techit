package D3ControlStatements;

import java.util.Scanner;

public class Q3ControlStatements {
  public static void main(String[] args) {
    // Q3. 정수 n이 입력된 뒤, n개의 이름이 개행을 기준으로 입력이 된다고 가정할 때,
    // n개의 이름을 입력된 순서의 반대로 출력하여라.

    // 3
    // Alex
    // Brand
    // Chad
    Scanner scanner = new Scanner(System.in);

    // 몇개의 이름을 넣을 것인지 설정
    int integer = scanner.nextInt();
    // 정수 입력 이후 개행 소모 용도
    scanner.nextLine();

    String[] names = new String[integer];
    // n개의 이름 입력 받기
    for (int i = 0; i < names.length; i++) {
      names[i] = scanner.nextLine();
    }
    // 이 시점에서 모든 이름을 받은 상태이다.
    for (int i = 0; i < names.length; i++) {
      // 0 ~ n-1까지 n개이다.
      // 제일 뒤에 있는 요소의 인덱스는 n-1이다.
      System.out.println(names[integer -1 - i]);
    }
  }
}
