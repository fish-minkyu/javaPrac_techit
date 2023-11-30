package D4Methods;

// Q1-1
// 두 정수를 인자로 받아
// 두 정수 값의 차이의 절대값을 반환하는 메서드 "diff"를 작성하시오.

// Q1-2.
// 정수를 입력받아 절대값을 반환하는 abs 메서드를 만드시오

public class Q1Methods {

  // Q 1-1
  public static int diff(int a, int b) {
   if (a > b) {
     return a - b;
   } else {
     return b - a;
   }
  }

  // Q1-2
  public static int abs(int n) {
    if (n > 0) {
      return n;
    } else {
      return -n;
    }
  }

  // abs 메서드를 재사용한 메서드 diff2
  public static int diff2(int a, int b) {
    return abs(a - b);
  }

  public static void main(String[] args) {
  }
}
