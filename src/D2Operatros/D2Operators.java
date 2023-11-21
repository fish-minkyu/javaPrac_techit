package D2Operatros;

import java.util.Scanner;

public class D2Operators {
  public static void main(String[] args) {
    int plus = 10 + 20;
    int minus = 20 - 10;
    int multiply = 10 * 20;
    float divide = 20 / 10; // int로 선언을 하면 실수가 나올 수 있으므로 double로 해줘야 한다.
    int modulo = 15 % 10;

    System.out.println(plus); // 30
    System.out.println(minus); // 10
    System.out.println(multiply); // 200
    System.out.println(divide); // 2.0
    System.out.println(modulo); // 5

    // %의 우선순위는?
    int result = (10 + 5 % 3) / 3 + 2 * 3;
    System.out.println(result); // 10

    System.out.println(21 / 10); // 2
    // 시도 1. 데이터를 받는 애를 int가 아니라 double로 해보자
    double doubleValue = 21 / 10; // 결과를 정수로 계산을 마무리하고 표현을 실수로 한 것
    System.out.println(doubleValue); // 2.0 <- 2로 계산이 되고 실수로 형변환이 된 것

    // 시도 2. 나누기 전에 실수로 만들어 주자
    // 피연산자 중 하나라도 double이면 결과도 double이다.
    doubleValue = 21.0 / 10;
    doubleValue = 21 / 10.0;
    System.out.println(doubleValue); // 2.1

    // 피연산자 둘 다 정수 변수면?
    // 형변환(Type Casting)
    int intResult = (int) 2.1; // ()에다가 어떤 자료형으로 바꿔줄지 써주면 됨
    System.out.println(intResult); // 2, 소수점 이하는 버려진다.

    // 형변환을 통한 나누기 연산
    int left = 21;
    int right = 10;
    double casteResult = (double) left / right; // left는 int에서 double로 바뀌었으므로 계산 결과는 double로 바뀔 것이다.
    System.out.println(casteResult); // 2.1

    // 더 큰 공간에서 작은 공간으로 옮기니 데이터 손실이 있을 수 있다.
    long bigInt = 4294967296L; // 2의 32승, 33칸의 비트가 필요하다.
    System.out.println((int) bigInt); // 0
    // => 0인 이유는 int의 범위를 넘었기 때문에 그 이상인 데이터는 날라간다.

    // char 형 변환 (String은 안됨)
    int asciiA = 65;
    System.out.println((char) asciiA); // A
    System.out.println((char) (asciiA + 10)); // K

    // String 덧샘 (String Concatenation)
    // : 포맷팅보다 느리다.
    System.out.println("여기에 10을 입력하시오: " + 10); // 여기에 10을 입력하시오: 10
    // String + int를 했다고 해서 int가 String으로 바뀌지 않는다. 그저 문자열에 포함이 된다.

    // Char 덧샘
    char largeA = 'A';
    char ten = 10;
    System.out.println(largeA + ten); // 75
    System.out.println((char) (largeA + ten)); // K

    // 증감 연산자
    int count = 10;
    System.out.println(++count); // 전치 계산, (출력 전에 1 증가, 값 11)
    System.out.println(count++); // 후치 계산, (출력 후에 1 증가, 값 12)
    System.out.println(--count); // 전치 계산, (출력 전에 1 감소, 값 11)
    System.out.println(count--); // 후치 계산, (출력 후에 1 감소, 값 10)
    // 대부분의 증감 연산자는 후위 연산자를 사용한다.

    // 복합 할당 연산자
    int addTo = 1;
    addTo += 10;     // 11
    addTo *= addTo;  // 121

    addTo /= 12;  // addTo = addTo / 12;
    addTo %= 10;  // addTo = addTo % 10;
    addTo -= 20;  // addTo = addTo - 20;
    addTo *= -1;  // addTo = addTo * -1;

    // 비교 연산자
    int small1 = 10;
    int small2 = 10;
    int big1 = 21;
    double big2 = 21.0;

    System.out.println(small1 == small2); // 노란색 줄은 굳이 이걸 쓸꺼냐?란 의미
    System.out.println(big1 == small1);
    System.out.println(big1 == big2);

    // 논리 연산자 (! -> && -> ||)
    // 체온은 37 이하이면서 나이는 20 이상
    int temperature = 38;
    int age = 20;

    boolean notSick = temperature <= 37;
    boolean isOfAge = age >= 20;
    boolean canEnter = notSick && isOfAge;
    System.out.println(canEnter); // true

    // 일요일이거나 공휴일이다.
    boolean sunday = false;
    boolean holiday = false;
    boolean canRest = sunday || holiday;
    System.out.println(canRest); // false

    // 아니다.
    int num = 10;
    boolean isNegative = num < 10;
    boolean isNotNegative = !isNegative;
    System.out.println(isNegative); // false
    System.out.println(isNotNegative); // true

    boolean a = true;
    boolean b = false;
    boolean c = false;

    System.out.println(a && b || !c); // true

    // 비트 연산자
    // 11 = 0000 1011
    // 5 = 0000 0101
    // 비트 연산 AND (&)
    System.out.println(11 & 5); // 1
    // 비트연산 OR(|)
    System.out.println(11 | 5); // 15
    // 비트연산 XOR (^)
    System.out.println(11 ^ 5); // 14
    // 비트연산 NOT (~)
    System.out.println(~11); // -12

    // 삼항 연산자
    Scanner scanner = new Scanner(System.in);
    int dust = scanner.nextInt();
    // 80이하면 "좋음", 아니면 "나쁨"

    String message = dust <= 80 ? "좋음" : "나쁨";
    // System.out.println("미세먼지 수치: %d, (%s)");여기서 문자열 바로 옆에 .format을 쓰면 됨
    System.out.println(String.format("미세먼지 수치: %d, (%s)", dust, message));
  }
}
