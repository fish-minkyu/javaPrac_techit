//package D3ControlStatements;
//
//import java.util.Scanner;

// 중복된 변수가 있으니 쓸려면 고치자

//public class D3ControlStatements {
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    // 나이가 20 미만일 때, 입장 불가 출력
//    int age = scanner.nextInt();
//    if (age < 20) {
//      System.out.println("입장 불가");
//      System.out.println(String.format("%d년 뒤에 오세요", 20 - age));
//    };
//
//    // multiple이 2의 배수면, 2의 배수 출력
//    int multiple = scanner.nextInt();
//    if (multiple % 2 == 0) System.out.println("2의 배수");
//
//    // 2의 배수면 짝수 아니면 홀수
//    int num = 10;
//
//    if (num % 2 == 0) {
//      System.out.println("짝수");
//    } else {
//      System.out.println("홀수");
//    }
//
//    // 어떤 학생의 시험점수가 80점을 넘으면 "Good Job" 못넘으면 "Too Bad"
//    int score = scanner.nextInt();
//    if (score > 80) {
//      System.out.println("Good Job");
//    } else {
//      System.out.println("Too Bad");
//    }
//
//    // ASCII 코드로 A는 65이다.
//    // 1 ~ 26 사이의 숫자 n이 입력될 때, n번째 알파벳을 대문자로 출력하라.
//    // 이때 범위 밖의 입력이 들어오면 "잘못된 입력입니다."를 출력하라
//    int n = 13;
//
//    if (n >= 1 && n <= 26) {
//      System.out.println((char) (n + 64));
//    } else {
//      System.out.println("잘못된 입력입니다.");
//    }
//
//    // 0 ~ 30: 좋음
//    // 31 ~ 80: 보통
//    // 81 ~ 150: 나쁨
//    // 151 ~ : 매우 나쁨
//
//    int dust = 15;
//
//    if (dust <= 30) {
//      System.out.println("좋음");
//    } else if (dust <= 80) { // dust > 30은 무조건 성립
//      System.out.println("보통");
//    } else if (dust <= 150) {
//      System.out.println("나쁨");
//    } else {
//      System.out.println("매우 나쁨");
//    }
//
//    /*어떤 학생의 시험점수가 정수로 주어진다.
//    점수가 90점 이상이면 "수",
//    점수가 80점 이상 90점 미만이면 "우",
//    점수가 80점 미만이면 "미"를 출력하여라.
//    */
//
//    int testScore = 90;
//
//    if (testScore >= 90) {
//      System.out.println("수");
//    } else if (testScore >= 80) {
//      System.out.println("우");
//    } else {
//      System.out.println("미");
//    }
//
//    // if 조건문이 맞으면 다음 조건문은 확인도 하지 않는다.
//    int zero = 0;
//    if (zero == 0) {
//      System.out.println("is zero");
//    }
//    else if (10 % zero == 0) {
//      System.out.println("is factor");
//    }
//    else {
//      System.out.println("not factor");
//    };
//
//    // switch
//    // enum과 조합하면 효율적으로 쓸 수 있다.
//    String input = "d";
//    // 내가 확인하고 싶은 값을 괄호 안에 넣어주기, (확인하고 싶은 값)
//    // case는 여기서부터 실행하란 의미다.
//    // break는 블록 스코프를 벗어나게 해주는 키워드다.
//    switch (input) {
//      case "w": //input == "w"
//        System.out.println("up");
//        break; // break를 꼭 추가해주기
//      case "a":
//        System.out.println("left");
//        break;
//      case "s":
//        System.out.println("down");
//        break;
//      case "d":
//        System.out.println("right");
//        break;
//        // 기본 동작, if문의 else문과 똑같다. (필수값 아님)
//      default:
//        System.out.println("invalid");
//    }
//
//    // enhanced switch
//    // : 기능적으로 일반 switch문과 같다.
//    switch (input) {
//      case "w" ->
//        System.out.println("up");
//      case "a" ->
//        System.out.println("left");
//      case "s" ->
//        System.out.println("down");
//      case "d" ->
//        System.out.println("right");
//      default ->
//        System.out.println("invalid");
//    }
//
//    // 반복문
//    // while
//    // 대출금 천만원
//    int loan = 1000;
//    // 대출금 남았나?
//    while (loan > 0) {
//      loan -= 50;
//      loan *= 1.03;
//      System.out.println("남은 대출액" + loan);
//    }
//
//    System.out.println("대출 상환 완료");
//
//    // while은 특정 조건을 충족시켜야할 때 사용하는 것이 좋다.
//    // while, 반복문으로 총합과 평균 구하기
//    int[] numbers = {2, 3, 5, 6, 19, 23};
//    int i = 0;
//    int sum = 0;
//
//    while (i < numbers.length) {
//      System.out.println(numbers[i]);
//      sum += numbers[i];
//      i++;
//    }
//
//    System.out.println(sum);
//    System.out.println((double) sum / numbers.length);
//
//    // for문은 횟수가 정해져 있을 때 사용하는 것이 좋다.
//    // for, 총합, 최대, 평균 구하기
//    // fori 하고 tab 키 누르면 intelliJ가 자동완성 시켜준다.
//    int sum = 0;
//    int max = -100;
//    for (int i = 0; i < numbers.length; i++) {
//      sum += numbers[i];
//
//      if (numbers[i]> max) {
//        max = numbers[i];
//      }
//    }
//
//    System.out.println(sum);
//    System.out.println(max);
//    System.out.println((double) sum / numbers.length);
//
//
//    // foreach
//    String[] fruits = {"apple", "pear", "banana"};
//    for (String name : fruits) {
//      System.out.println(name); // apple // pear // banana
//    }
//
//    // 반복문 제어
//    // break
//    int wallet = 20000;
//    int toast = 5000;
//    while (true) {
//      wallet -= toast;
//      if (wallet <= 0) {
//        System.out.println("파산이어서 더 못먹음");
//        // 그만 먹자
//        break; // break는 가장 가까운 "반복문"을 멈춘다.
//      }
//      System.out.println(String.format("토스트 1개 먹고 %d 남음", wallet));
//    }
//
//    // continue
//    // 0 ~ 9 사이의 짝수만 출력하고 싶다.
//    for (int i = 0; i < 10; i++) {
//      if (i % 2 != 0) {
//        continue; // 나머지 코드는 무시하고 다음 반복문을 실행한다.
//      }
//      System.out.println(i);
//    }
//
//    // continue 예시, 백신을 맞지 않은 사람만 count 하기
//    boolean[] vaccinated = {true, true, false, false, true, true, false, false, false};
//    int groupCount = 0;
//    for (boolean vaccine : vaccinated) {
//      if (vaccine) {
//        continue;
//      }
//      groupCount++;
//      // 일정 인원 이상이면 입장 불가
//      if (groupCount > 5) {
//        System.out.println("입장이 불가하다..");
//        break;
//      }
//    }
//  };
//}
