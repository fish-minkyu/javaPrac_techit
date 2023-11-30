package D2Operatros;

import java.util.Scanner;

// Q. 세 과목의 시험접수(int)가 입력될 때, 평균 점수(double)를 구하여라
public class Q1Operators {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] score = new int[3];
    score[0] = scanner.nextInt();
    score[1] = scanner.nextInt();
    score[2] = scanner.nextInt();

    // 나눗셈 직전에 피연산자 둘 중 하나는 실수여야한다.
    // 아래의 코드는 이미 계산된 값을 실수로 표현하는 것이기에 소수점 자리의 데이터를 버리게 되었다.
    // System.out.println((double) ((score[0] + score[1] + score[2]) / 3)); X
    double avg = (score[0] + score[1] + score[2]) / (double) 3;
    System.out.println(avg); // O
    System.out.println((double) (score[0] + score[1] + score[2]) / 3); // O, 각 점수의 합들을 double로 형변환
  }
}
