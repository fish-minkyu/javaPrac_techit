package D1VarAndTypes;

import java.util.Scanner;

// 변수와 자료형
public class D1VarAndTypes {
  // main 치고 tab키
  public static void main(String[] args) {
    // <자료형> <이름> = <값>
    // =: 할당 연산자
    // 코드 한 줄이 끝날 때마다 세미콜론 써주기
    // Java는 변수가 어떤 종류의 데이터를 담고 있는지 써줘야 한다.
    int a = 100;
    System.out.println(a);

    // b라는 이름의 상자에 "Hello Variables"라는 데이터를 넣어준다.
    String b = "Hello Variables";
    // b에 들어있는게 뭔지 확인한다.
    System.out.println(b);

    // a를 한번만 쓸 수 있는건 아니고 계속 확인 가능
    System.out.println(a);

    // a의 값을 변경하고 싶다면 다시 할당 연산자(=)를 사용
    // 재할당일때는 자료형 생략(단, 맞는 자료형의 데이터만 넣어주어야 한다.)
    // 또한 이름은 중복되면 안된다.
    // String a = "Is it possible?" // Error
    // <자료형> <식별자>는 새로운 변수를 만드는 것이다.
    a = 50;
    System.out.println(a); // 50

    // 변수를 사용하는 이유
    // : 활용성이 좋다.
    int americano = 1500;
    int capuccino = 2500;
    int caffeLatte = 3000;
    int caffeMocha = 4000;

    System.out.println(americano * 5);
    System.out.println(capuccino * 3 + caffeLatte * 2);
    System.out.println(caffeMocha + americano * 3);

    // 선언과 할당이 반드시 동시에 이뤄질 필요는 없다.
    // 변수 선언
    int cake;
    cake = 15000;

    // 한 줄에 여러 변수 선언 및 할당
    int hotChoco = 2000, iceTea = 1500;

    // 자료형
    // 정수형 자료형
    // : int, long을 주로 쓴다.
    // int
    // : integer의 약자, 소수점만 아닌 정수(-2147483648 ~ 2147483647)를 넣을 수 있다.

    // long
    long longInteger = 100000000000L; // Large를 마지막으로 적어준다.

    // short
    short smallInteger = 10000;

    // byte
    byte reallySmallInteger = 127;

    // 실수형 자료형
    // : 거의 double만 쓴다.
    float floatPoint = 2.718F; // Float의 F를 넣어줘야 한다.

    double doublePoint = 3.1415926;

    // 진짜 긴 소수는?
    // : 기본적으로 16자리에서 반올림이 된다.
    double longPi = 3.14159265358979323846; // 3.141592653589793
    System.out.println(longPi);

    // 불린형 자료형 (참 또는 거짓)
     boolean success = false;
     boolean willSuccess = true;

     // 문자와 문자열

    // char
    // 데이터를 표현할 때, 작은 따옴표를 쓰면 한 개의 글자를 의미한다.
    // char는 큰 따옴표를 사용하면 안된다.
    // char는 알고리즘 문제를 풀 때 많이 사용된다.
    char alphabet = 'a';
    char digit = '1';

    // 한글자라고 해도 큰 따옴표는 문자가 아닌 문자열에 써야 한다.
    // char isString = "1" // Error

    // String
    // : 코딩하면서 가장 많이 쓰는 자료형
    String word = "Hello";
    String sentence = "this is a String Variable";

//    // Scanner로 입력받기
//    Scanner scanner = new Scanner(System.in);
//    // 사용자에게 입력을 받아오는 기능
//    // nextLine()에 쓰면 무조건 입력을 문자열로 받는다.
//    String scannedLine = scanner.nextLine();
//    System.out.println(scannedLine);
//
//    // scanner.next<자료형>()
//    int scannerInt = scanner.nextInt();
//    long scanneredLong = scanner.nextLong();
//
//    float scannedFloat = scanner.nextFloat();
//    double scannedDouble = scanner.nextDouble();
//
//    boolean scannedBool = scanner.nextBoolean(); // true or false를 적어줘야 한다.
//
//    // nextLine() 유의점
//    // : Scanner는 입력된 모든 내용에서 일치하는 데이터를 찾는다.
//    scanner.nextInt();
//    scannedLine = scanner.nextLine();
//    System.out.println(scannedLine);

    // \"(escape sequence)
    // : 소스코드 기능이 아닌 문자 큰 따옴표를 사용하기 위해 사용
    // "내일 봐~"하고 말하였다.
    String quote = "\"내일봐\" 하고 말하였다.";
    System.out.println(quote); // "내일봐" 하고 말하였다.

    char quotation = '\'';
    System.out.println(quotation); // '

    String doubleBack = "\\is backslash";
    System.out.println(doubleBack); // \is backslash

    // 그 외 엔터키(개행문자), 백스페이스, 탭키도 \를 쓴다.
    // \n
    System.out.println("개행문자: \n 다음은 다음 줄에 표현됩니다.");

    // \t
    System.out.println("name\tscore");
    System.out.println("Alex\t3.5");
    System.out.println("Thomas\t4.0");

    // String Formatting(문자열 포맷팅)
    // %, 포맷코드
    // : 어떤 자료형의 데이터가 표현될지를 문자열 내부에 지정하는 방법
    int dust = 10;
    String status = "좋음";

    // System.out.println(String.format("미세먼지 농도: %d (%s)", dust, status));

    String msgTemplate = "미세먼지 농도: %d (%s)";
    System.out.println(String.format(msgTemplate, dust, status));

    // 배열
    int[] scores = { 85, 75, 90 };
    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);

    scores[0] = 90;
    scores[1] = 80;
    scores[2] = 95;

    // 변수를 이용해 임의의 크기의 배열을 만들 수 있다.
    int studentCount = 10;
    String[] names = new String[studentCount];
    scores = new int[studentCount];

    // 배열에 직접 숫자를 입력해보자
    Scanner scanner = new Scanner(System.in);
    scores = new int[3];

    scores[0] = scanner.nextInt();
    scores[1] = scanner.nextInt();
    scores[2] = scanner.nextInt();

  }
}
