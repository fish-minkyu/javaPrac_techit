package D3ControlStatements;

import java.util.Scanner;

public class Q2ControlStatements {
  public static void main(String[] args) {
    // Q2. 정수 n과 n개의 정수가 순서대로 입력된다. 이 때 n개의 정수의 총합, 평균을 출력하여라

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += scanner.nextInt();
    }
    System.out.println(sum);
    System.out.println((double) sum / n);
  }
}
