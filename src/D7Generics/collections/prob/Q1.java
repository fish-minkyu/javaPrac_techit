package D7Generics.collections.prob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    // 연습문제, 꼭 다시 한번 풀어보기!
    // Scanner와 List
    // 엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
    // 'q'가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
    // 여태까지 입력했던 데이터를 순서대로 출력하시오
    // way 1. List.size()
    // way 2. for

    Scanner scanner = new Scanner(System.in);
    List<String> inputList = new ArrayList<>();

    while (true) {
      String input = scanner.nextLine();
      // q가 입력시 반복(입력) 종료
      if ("q".equals(input)) break;
      inputList.add(input);
    }
    // fori
    for (int i = 0; i < inputList.size(); i++) {
      System.out.println(inputList.get(i));
    }

    // foreach
    // foreach가 가능한 이유는 List가 iterable interface 위에서 만들어졌기 때문이다.
    for (String str : inputList) {
      System.out.println(str);
    }
  }
}
