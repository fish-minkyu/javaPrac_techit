package D5Class;

public class WrapperClass {
  public static void main(String[] args) {
    // 단점. 클래스 데이터들은 Heap에 저장되므로 원시타입보다 성능이 떨어진다.
    // 1. 참조 타입이지만, String처럼 값을 할당 가능
    // String은 클래스이지만 java가 특별한 class로 다루기 때문에 바로 사용이 가능하다.
    String string = "";
    int primInt = 10;
    // int에 대응하는 참조 타입은 Integer, 클래스이지만 원시타입처럼 그냥 값을 할당할 수 있다.
    // (클래스를 만들려면 new 키워드를 썻어야 한다.)
    Integer refInt = 10;
    // 2. 서로 상호 호환이 된다.
    refInt = primInt;
    primInt = refInt;

    // 3. 사칙연산도 그냥 참조 타입을 바탕으로 사용 가능하다.
    refInt += 10;
    System.out.println(refInt);
    refInt /= primInt;
    System.out.println(refInt);

    Long reflong = refInt.longValue();

    Character a = 'a';

    // 나름 유용한 기능들
    // 문자열 -> 정수를 변환
    // parse: 컴퓨터가 데이터를 하나 하나 뜯어가면서 이해하는 과정
    Integer parsedInt = Integer.parseInt("1000");
    System.out.println(parsedInt = 100); // 1100

    // 문자열 -> 실수 변환
    Double parsedDouble = Double.parseDouble("1.0");
    System.out.println(parsedDouble); // 1.0

    // 정수 최댓값 - 최솟값 상수
    System.out.println(Integer.MAX_VALUE - Integer.MIN_VALUE);

    // Infinity
    System.out.println(Double.POSITIVE_INFINITY); // Infinity

    // String
    String sentence = "Hello, Today is 27th of November";
    // 문자열길이
    System.out.println(sentence.length());
    // 문자열 자르기
    System.out.println(sentence.substring(10)); // ay is 27th of November
    System.out.println(sentence.substring(7, 12)); // today

    String[] strArray = sentence.split(" "); // regx: regular expression(정규식)
    for (String str : strArray) {
      System.out.println(str);
    }

    String email = "e951219@naver.com";
    String[] emailSplit = email.split("@");
    for (String str : emailSplit) {
      System.out.println(str);
    }

    // 특정 문자열 찾기
    String source = "https://google.com/search?q=";
    System.out.println(source.indexOf("google")); // 8 <- index 8번째를 의미

    // 문자열 한글자씩 확인하는 방법
    // 1. fori 반복
    for (int i = 0; i < source.length(); i++) {
      // 문자열을 배열 취급해서 [i]번째 가져오기
      System.out.println(source.charAt(i));
    }

    // 2. string.toCharArray(): 문자열을 배열로 반환
    for (char letter : source.toCharArray()) {
      // 문자열 내부에 저장된 문자 배열 반환하기
      System.out.println(letter);
    }

    // 각 글자가 영문인지 숫자인지 확인하기
    for (char letter : source.toCharArray()) {
      if (Character.isDigit(letter)) {
        // 문자가 숫자를 나타내는 문자인지 확인
        System.out.println(String.format("digit: %c", letter));
      }

      // 문자가 인간의 문자를 나타내는 문자인지 확인
      if (Character.isLetter(letter)) {
        System.out.println(String.format("letter: %c", letter));
      }
    }
  }
}
// Wrapper class를 외우지 말고 찾아서 쓰는 것이 좋다.
// 개발자가 미리 만든 메서드의 이름을 고민해보면서 유추해보면 좋을 것 같다.