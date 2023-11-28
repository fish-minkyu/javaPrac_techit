package D6OOP.Exceoptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  // 두개의 정수를 받아 나누어서 정수 결과를 반환하는 정적 메서드 divide
  public static int divide(int a, int b) {
    return a / b;
  }

  // 예외가 발생시켜주기
  public static double divideToDouble(int a, int b) {
    // 수동으로 예외를 발생시키고 싶다.
    if (b == 0) {
      throw new ArithmeticException("Division by Zero");
    }
    return (double) a/ b;
  }

  public static void readFileContents(String filename) {
    File file = new File(filename);
    // checked exception은
    // 어떻게든 코드 단위에서 예외처리를 선으로 해줘야 한다.
    // 되게 친절한 기능이다.
    try {
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");
    }
  }

  public static void readFileThrows(String filename)
    throws FileNotFoundException { // 아 몰라 이 에러 처리는 다음 로직에서 처리해줘
    File file = new File(filename);
    Scanner scanner = new Scanner((file));
    while (scanner.hasNextLine())
      System.out.println(scanner.nextLine());
  }

  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int a = scanner.nextInt();
//    int b = scanner.nextInt();
//    Integer a = 10;
//    Integer b = null; // 원시타입에는 null을 넣을 수 없다.
    int a = 10;
    int b = 0;

    try {
      // 예외가 발생할 수 있을 것 같은 곳
//      System.out.println(divide(a, b)); // ArithmeticException 발생구간
      System.out.println(divideToDouble(a, b));
    } // 예외 처리
      catch (ArithmeticException | NullPointerException exception) { // ArithmeticException: 예외 클래스, exception: 변수
        // 예외가 발생하는 곳
//      System.out.println("Sorry, can't do that!");
//      System.out.println(exception.getMessage());
        System.out.println(String.format(
          "Sorry, this happned: %s", exception.getMessage()
        ));
    }
//    catch (NullPointerException exception) {
//      // 또 다른 예외가 발생하면 실행되는 곳
//      System.out.println("NPE!!");
//    }
    finally {
      // 예외가 발생하든 말든 무조건 실행되는 곳
      System.out.println("Bye!");
    }
    System.out.println(a);
    System.out.println(b);
  }
  // try-catch 구문
  // : 예외를 막아줄 수 있는 구문, 다시 정상적인 코드 흐름으로 되찾아준다.

  // exit code: 정상적으로 코드가 실행되고 종료되었는지 아닌지 판단하는 기준
  // 0이면 정상이다.
  // exit code 1 : 에러가 발생하는 부분이 1부분 있다.
}