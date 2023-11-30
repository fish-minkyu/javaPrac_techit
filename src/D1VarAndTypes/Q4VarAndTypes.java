package D1VarAndTypes;

import java.util.Scanner;

    //Q4. 시간과 오전 오후를 입력받고 오전XX시의 형식으로 출력하는 코드를 작성하시오.
public class Q4VarAndTypes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // scanner는 입력받은 값을 스페이스 기준으로 끊어준다.

    int time = scanner.nextInt();
    // nextLine: 남은 줄 전체
    // next: 다음 단어
    String amPm = scanner.next();
    System.out.println(String.format("%s %d시", amPm, time));
  }
}
