package D4Methods;

public class Main {
  public static void main(String[] args) {
    // 메서드
    int a = 10;
    int b = 20;
    System.out.println(addTwoInt(a, b));

    int c = addAndTwice(a, b);
    System.out.println(threeIntAvg(a, b, c));

    int[] arr = {3, 5, 6, 7, 1};
    System.out.println(findOneReturn(arr));
    System.out.println("-----------");
    System.out.println(findOneBreak(arr));
    System.out.println("-----------");
    System.out.println(findOne(arr));

    // 재귀함수
    System.out.println("재귀 함수");
    System.out.println(factorial(5));
    System.out.println("-----------");

    // 메서드 오버로드
    int intA = 2, intB = 3;
    long longA = 2, longB = 3;
    System.out.println(add(intA, intB));
    System.out.println(add(longA, longB));
    System.out.println(add(intA, longB)); // -> long add()로 빠진다. int가 long으로 암시적 형변환이 된다.

    // varargs
    System.out.println(varargAvg(1, 2, 3, 4, 5));
    System.out.println(varargAvg(10));
    System.out.println(varargAvg(11, 12, 13, 14));
    int[] argList = {1, 2, 3, 4, 5};
    System.out.println(varargAvg(argList)); // 배열을 위해서 만든 메소드는 아니지만 배열도 전달은 된다.
    System.out.println("avg of 1 ~ 6: " + varargSum(6, argList));
  };

  // 두개의 정수를 더하고 그 결과를 반환하는 메서드
  public static int addTwoInt(int a, int b) {
    return a + b;
  }

  // 두개의 정수를 더하고 2배해서 그 결과를 반환하는 메서드
  public static int addAndTwice(int a, int b) {
    return (a + b) * 2;
  }

  // 세개의 정수를 받아 더해서, 3으로 나눈 몫을 반환하는 메서드
  public static int threeIntAvg(int a, int b, int c) {
    return (a + b + c) / 3;
  }

  // 정수 배열을 받아서, 1이 어디있는지 반환하거나 없으면 -1을 반환하는 메서드
  // 방법 1, 반복문 안에 return을 사용, return은 여러번 사용할 수 있다.
  public static int findOneReturn(int[] numbers) {
    int index = -1;
    for (int i = 0; i < numbers.length; i++) {
      // 찾았다!
      if (numbers[i] == 1) {
        index = i;
        return index; // 반복문이 종료되기 전에 메서드가 종료
      }
    }
    // 아래 2줄의 코드는 실행되지 않는다.
    System.out.println("for 종료");
    return index;
  }

  // 방법 2, 반복문 안에 break를 쓰고 반환
  public static int findOneBreak(int[] numbers) {
    int index = -1;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 1) {
        index = i;
        break; // 반복문 종료
      }
    }
    System.out.println("for 종료");
    return index;
  }

  // 방법 3, 내 스타일
  public static int findOne(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 1) {
        return i;
      }
    }

    return -1;
  }

  // 재귀함수
  // n! = n * (n-1)!
  // n = 1 || n = 0 -> n! = 1
  // : n이 1 또는 0일 때, n!은 1이 나온다.
  // F(n) = n * F(n-1)
  // F(0) = 1
  // F(1) = 1
  public static int factorial(int n) {
    // 재귀함수가 멈출 조건을 우선 명시를 해줘 가독성을 높인다.
    if (n == 1 || n == 0) {
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }

  // 메서드 오버로딩
  // : 메서드 이름은 같은. 매개변수 자료형 형태가 다르거나 매개변수 개수를 다르게 하여
  // 다른 메서드를 여러개 만들 수 있게 해준다. (다형성)
  // => 메소드 호출하는 코드에서 코드 활용도가 높아진다.
  public static int add(int a, int b) { // int + int
    return a + b;
  }

  public static long add(long a, long b) { // long + long
    return a + b;
  }

  public static long add(int a, long b) {
    return a + b;
  }


  // varargs - 가변인자
  // 만든 목적은 임의 매개변수를 위해서 만든 것이며 배열을 넣어도 되지만 배열을 넣을 수도 있다는 것만 알아라(만든 목적에 어긋남)
  // 배열을 넣을 것이면 매개변수 자료형을 배열로 바꿔줘라
  // public static int varargAvg(int[] ints)
  // 사용은 배열 쓰듯이 해준다.
  public static int varargAvg(int... ints) { // ints가 마치 배열인듯 사용하면 된다.
    int sum = 0;
    for (int i = 0; i < ints.length; i++) {
      sum += ints[i];
    }
    return sum / ints.length;
  }

  // 가변인자를 쓸 때, 매개변수의 맨 마지막에 써준다.
  // 합을 구하는 메소드
  public static int varargSum(int a, int... ints) { // ints가 마치 배열인듯 사용하면 된다.
    int sum = a;
    for (int i = 0; i < ints.length; i++) {
      sum += ints[i];
    }
    return sum;
  }
};