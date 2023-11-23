package D3ControlStatements;

import java.util.Scanner;

public class Q5ControlStatements {
  public static void main(String[] args) {
    // Q5.
//    한 정수를 입력받는다. 이 정수는 잔고이다.
//    이후 반복해서 인출할 돈을 정수로 계속 입력받는다.
//    인출한 결과를 "성공: 잔고"의 형태로 출력하고,
//    잔고가 부족할 경우 "잔고가 부족합니다". 라고 출력 뒤 프로그램을 종료하여라.
    Scanner scanner = new Scanner(System.in);

    // way1
    int account = scanner.nextInt();

    while ( account >= 0) {
      int draw = scanner.nextInt();
      account -= draw;
      if (account >= 0) {
        System.out.println(String.format("성공: ₩ %d", account) );
      } else {
        System.out.println(String.format("잔고가 부족합니다.: ₩ %d", account) );
      }
    }

    // way2
    int bank = scanner.nextInt();
    while (true) {
      // 인출할 금액 입력
      int withdraw = scanner.nextInt();
      // 인출할 금액이 잔고보다 많을 경우
      if (withdraw > bank) {
        System.out.println("잔고가 부족합니다.");
        break;
      }
      bank -= withdraw;
    }
  };
};
