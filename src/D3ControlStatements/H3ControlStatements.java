package D3ControlStatements;
import java.util.Scanner;

public class H3ControlStatements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    H1 (해결)
//    한 정수를 입력받아,
//    해당 정수가 음수인지 양수인지 아니면 0인지 출력하는 코드를 작성하여라.
//    int n = scanner.nextInt();
//    if ( n > 0) System.out.println("양수");
//    else if ( n == 0 )System.out.println("0");
//    else System.out.println("음수");


//    H2 (해결)
//    축구리그에서는 승점을, 승리시 3점 무승부시 1점, 패배시 0점을 획득한다.
//    남은 경기와 현재 승점과 목표 승점이 주어졌을 때,
//    남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를
//    없으면 최고 승점을 출력하여라.

    // 남은 경기
    int remaining = scanner.nextInt();
    // 현재 승점
    int current = scanner.nextInt();
    // 목표 승점
    int goal = scanner.nextInt();

    // 넘을 수 있냐를 판단하기 위해 전부 이겼다고 가정
    int maxScore = current * remaining * 3;

    // 목표 점수 넘었나?
    if (maxScore >= goal) {
      // 승 한번이 무승부로 바뀌면 최고점에서 몇점이 줄어들까요? 2점
      // 획득할 수 있는 승점이 깍여도 목표 승점에 도달할 수 있나?
      // 최고 점수 - 목표 점수 = 여유분 점수
      // 여유분 점수를 2로 나눈 몫만큼 덜 이겨도 나머지를 다 무승부로 끝내면 필요한 최소 승수
      int minWins = remaining - (maxScore - goal) / 2;
      // 필요승수가 음수가 될 경우 0으로 바꿔주는 삼항 연산자
      minWins = minWins < 0 ? 0 : minWins;
      System.out.println(String.format("최소 필요 승수: %d", minWins));
    } else {
      System.out.println(String.format("최대 승점: %d", maxScore));
    }


//    //  H3 (해결)
//    //  1인치는 2.54 센티미터이다.
//    //  사용자에게 정수를 두개 입력받는다.
//    //  첫번째 정수가 0이라면 두번째 정수는 센티미터이고,
//    //  첫번째 정수가 1이라면 두번째 정수는 인치이다.
//    //  센티미터는 해당 길이의 인치로, 인치는 해당 길이의 센티미터로 소수점 2째 자리까지 출력하여라.
//    // 1cm = 0.393701in, 1in = 2.54cm
//
    int unit = scanner.nextInt();
    int length = scanner.nextInt();

    if ( unit == 0) {
      System.out.printf("%.2f", length * 0.393701);
    } else if ( unit == 1) {
      System.out.printf("%.2f", length * 2.54);
    } else {
      System.out.println("0 또는 1을 입력해주세요.");
    }

//    //  H4 (완료)
//    //  3명의 사람들에 대한 정보가
//    //  개행문자로 구분된 이름(문자열)이 세번
//    //  개행문자로 구분된 체온(정수)이 세번
//    //  입력된다.
//    //  이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
//
//    // 사람 배열과 온도 배열을 만든다.
//    // 사람 연속 3번, 온도 연속 3번 값을 받는다.
//    // foreach문 활용, temp가 38이 넘는 인덱스를 찾고 사람 배열에 대입한다.
//
    String[] people = new String[3];
    double[] temperature = new double[3];

    people[0] = scanner.nextLine();
    people[1] = scanner.nextLine();
    people[2] = scanner.nextLine();

    temperature[0] = scanner.nextDouble();
    temperature[1] = scanner.nextDouble();
    temperature[2] = scanner.nextDouble();

    for (int i = 0; i < 3; i++) {
      if (temperature[i] >= 38) {
        System.out.println(people[i]);
      }
    }

//    //  H5 (완료)
//    //  한 정수를 입력받는다.
//    //  이후 이 정수를 거듭제곱하며 1의 자리를 확인하면서,
//    //  몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.

    int n = scanner.nextInt();
    int multiple = n;
    int count = 0;

    while (true) {
      multiple *= n;

      if ( multiple % 10 == n % 10) {
        count++;
        System.out.println(count);
        break;
      }

      count++;
    }

    //  H6
    //  1월 1일의 요일이 정수
    //  2월 29일의 유무가 불린으로 주어진다.
    //
    //  이때 1월 1일의 요일은,
    //  0 - 월요일, 1 - 화요일, 2 - 수요일, 3 - 목요일, 4 - 금요일, 5 - 토요일, 6 - 일요일
    //
    //  으로 입력된다.
    //
    //  각 달의 1일이 무슨 요일인지 1월부터 12월까지 순서대로 출력하는 코드를 작성하시오.

    // 1월 1일이 무슨 요일인지
    // 2월이 28인지 29인지
    // 1 ~ 7 사이에는 (for문)
    // 홀수달이 31일, 짝수달이 30일, 2월은 별도(if else)
    // 8 ~ 12 사이에는 (for문)
    // // 홀수달이 30일, 짝수달이 31일 (if else)

    // 요일을 출력하는 것은 숫자와 같은 곳에 해당하는 요일이 저장된 문자열 배열을 활용하는 것을 추천
    // String[] days = {0, 1, 2, ..., 6}


  }
}
