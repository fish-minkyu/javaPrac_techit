package D7Generics.H7.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class H7_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> inputList = new ArrayList<>();

    while (true) {
      String input = scanner.nextLine();
      // 종료 조건
      if ("q".equals(input)) break;
      try {
        // 번역 시도
        Integer inputInt = Integer.parseInt(input);
        inputList.add(inputInt);
      } catch (NumberFormatException ignored) {
        // 숫자가 아닌 에러는 무시, ignored를 하면 intellij가 실행문이 비어도 신경 쓰지 않는다.
      }
    }
    int sum = 0;
    for (int i = 0; i <inputList.size(); i++) {
      sum += inputList.get(i); // get을 쓰면 값을 가져올 수 있다.
      System.out.print(inputList.get(i));
      if ( i != inputList.size() -1) {
        System.out.print(" + "); // 1줄로 출력하기 위해 print 사용
      }
    }

    System.out.println(String.format(" = %d", sum));
  }
}
// 파싱: 문자에서 다른 유의미한 규칙을 뽑아내기 위해 하나하나 보고 컴퓨터가 이해하는 언어로 번역하는 과정이다.
