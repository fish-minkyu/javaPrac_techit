package d1VarAndTypes;

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    // Q5.
    /*
    사용자에게 3개의 0.0 ~ 4.5 사이의 실수를 입력받고
    그 뒤에 3개의 이름을 입력받은 뒤
    이름 - <이름>, 학점 - <실수>
    의 형태로 3줄을 출력하는 프로그램을 작성하시오. 단, 실수의 범위가 틀려도 상관없다
    */
    Scanner scanner = new Scanner(System.in);

    double[] scores = new double[3];
    String[] names = new String[3];

    scores[0] = scanner.nextDouble();
    scores[1] = scanner.nextDouble();
    scores[2] = scanner.nextDouble();
    // nextLine 사용 시, 여기서 nextLine을 그냥 써야 한다.
    // scanner.nextLine(); 이렇게 공백을 처리하는 코드를 1줄 더 추가해준다.
    names[0] = scanner.next();
    names[1] = scanner.next();
    names[2] = scanner.next();

    String template = "이름 - %s, 학점 -%.1f";
    System.out.println(String.format(template, names[0], scores[0]));
    System.out.println(String.format(template, names[1], scores[1]));
    System.out.println(String.format(template, names[2], scores[2]));
  }
}
