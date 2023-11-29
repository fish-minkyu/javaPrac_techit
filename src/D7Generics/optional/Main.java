package D7Generics.optional;

import java.util.Optional;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
//    // 에러가 될수도 안될수도.....
//    // System.out.println(nullOrString().length());
//    String nullable = nullOrString();
//    if (nullable == null) System.out.println("got: null");
//    else System.out.println(nullable);
//
//    Optional<String> optionalString = Optional.ofNullable(nullOrString());
//    if (optionalString.isPresent()) {
//      System.out.println(optionalString.get());
//    } else {
//      System.out.println("got: null");
//    }
//
//    String result = Optional.ofNullable(nullOrString()).orElse("got: null");
//    System.out.println(result);

    String result = nullOrString(); // null이 될 가능성이 존재

    // 조건문을 통한 null 체크
    if (result != null) {
      System.out.println(result);
    } else {
      System.out.println("got : null");
    }

    // 어떤 메서드든 Optional.ofNullable() 메서드를 통해서 결과를 반환하게 한다.
    Optional<String> optionalResult = Optional.ofNullable(nullOrString()); // 정적 메서드에서 새로운 객체를 만드는 것을 정적 팩토리라고 한다.
    // isPresent: null이 아닌 값이 들어올 때 true
    // isEmpty: null일 때 true
    if (optionalResult.isPresent()) {
      System.out.println(optionalResult.isPresent()); // true
      System.out.println(optionalResult.isEmpty()); // false
      System.out.println(optionalResult.get());
    } else {
      System.out.println(optionalResult.isPresent()); // false
      System.out.println(optionalResult.isEmpty()); // true
      System.out.println("got: null");
    }

    // 결과를 Optional로 받았으면 orElse를 통해
    // 결과가 null일때 기본값을 설정할 수 있다.
    String resultOrElse = Optional.ofNullable(nullOrString())
      // null이 아니면 그 값이,
      // null이면 인자로 전달한 값이
      .orElse("got: null from orElse"); // <- 메서드 체이닝
    System.out.println(resultOrElse);

    String resultFromOptional = nullOrOpt()
      .orElse("got null from orElse method");
    System.out.println(resultFromOptional);
  }


  public static String nullOrString() {
    Random random = new Random();
    if (random.nextInt() % 2 == 0)
      return "not null string";
    else return null;
  }

  public static Optional<String> nullOrOpt() {
    Random random = new Random();
    if (random.nextInt() % 2 == 0) {
      // Optional.of로 Optional을 만든다.
      return Optional.of("Concrete String");
    } else {
      // null결과는 Optional.empty()
      return Optional.empty();
    }
  }
}