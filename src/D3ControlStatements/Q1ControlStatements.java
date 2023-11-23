package D3ControlStatements;

public class Q1ControlStatements {
  public static void main(String[] args) {
    // Q1. *을 1개 -> 2개 -> ...으로 출력하기

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      };
      System.out.println(); // 개행문자
    }
  }
}
