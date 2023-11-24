package D4Methods;

/*
피보나치 수열
F(0) = 0
F(1) = 1
F(2) = 2
F(n) = F(n-1) + F(n-2) 인 수의 나열이다.

음이 아닌 정수 n을 인자로 받아 n번째 피보나치 수를 반환하는 메서드를 구현하시오.
*/
public class Q3Methods {
  public static int fibo(int n) {
    if (n == 0 || n == 1) { /* n < 2 */
      return n;
    } else return fibo(n-1) + fibo(n-2);
  }

  // main
  public static void main(String[] args) {
    int n = 19;

    System.out.println(fibo(n)); // 4181
  }
}
