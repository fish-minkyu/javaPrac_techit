package D8StreamAPI.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream 사용 3단계
// 1. 원래 있던 배열이나 컬렉션을 stream으로 변환
// 2. Stream에 적용할 작업 전달
// 3. Stream에 결과를 수합
public class StreamMain {
  public static void main(String[] args) {
    String[] nameArray = {
      "Alex",
      "Dave",
      "Chad",
      "Brad"
    };
    // Stream<T>는 데이터가 흘러감을 나타내는 객체
    Stream<String> nameArrStream = Arrays.stream(nameArray);

    // 원시타입 스트림
    // int를 Stream으로 바꾸는건 왜 문제가 될까?
    // Wrapper class가 아니어서 안된다.
    int[] intArray = {1, 23, 14, 53, 17};
    // 그럴 때 다른 class를 제공한다.
    IntStream intStream = Arrays.stream(intArray);

    // 문자열을 문자 스트림
    String email = "e951219@naver.com";
    IntStream charStream = email.chars();

    // Collection.stream()
    // Collection interface에 stream이 내장되어 있다.
    List<String> nameList = new ArrayList<>();
    nameList.add("Alex");
    nameList.add("Dave");
    nameList.add("Chad");
    nameList.add("Brad");
    Stream<String> nameListStream = nameList.stream();

    Boolean newList = nameListStream
      // 중간 작업: 새로운 데이터 모음을 만들어낸다.
      // 데이터를 선별하는데 , 선별하는 기준을 전달해야 한다.
      // filter: 전달받은 함수를 바탕으로 참인 데이터만 남기는 Stream
      //.filter(name -> name.contains("a"))
      .filter(name -> name.length() >= 4)
      // 데이터를 받아 새로운 데이터를 반환한다.
       .map(name -> name.toUpperCase())
      // .map(name -> {
      //  String nameLower = name.toLowerCase();
      //  String nameUpper = name.toUpperCase();
      //  return nameLower + nameUpper;
      // })
      // 정렬
      // : 데이터를 받아 어떤 기준으로 정렬할 것인지 전달할 수 있다.
      // 전달받은 것이 없다면 기본 옵션으로 전달을 한다.
      .sorted(Comparator.reverseOrder()) // 반대로 정렬
      // 여러 메서드가 체이닝 형태로 동작하는 이유는 같은 객체 타입이기 때문, Stream<?>
      // 종결 작업: 끝, 결론을 내리고 마무리하는 단계
      // 새로운 데이터 모음을 바탕으로 결론을 내린다.
      // forEach: 남은 데이터를 각각 전달받은 함수의 인자로 전달
      // .forEach(System.out::println);
      // .forEach(name -> System.out.println(name));
      // toList: 데이터를 새로운 데이터로 만들어서 반환
      // .toList();
      // allMatch, anyMatch, noneMatch
      // : 전달받은 함수를 바탕으로 1. 전체가 참인지, 2. 하나라도 참인지, 3. 전쳐 참이 없는지
       .allMatch(name -> name.length() >= 4);
      // .anyMatch(name -> name.length() > 5)
      // .noneMatch(name -> name.length() < 3)

    // 종결 작업 이후엔 다시 호출 불가
    /* Error

     */


    // Stream 작업은 원본에는 영향이 없다.
    // Stream은 데이터를 모으고 새로운 데이터 모음을 만드는 것이다.
    System.out.println(nameList);

    nameListStream = nameList.stream();
    // 이름들 중에서
    // 길이는 4이상이며
    // 대문자 A가 들어가는
    // 모든 이름이 d가 포함이 안되어 있는지?
    boolean result = nameListStream
      .filter(name -> name.length() >= 4)
      .filter(name -> name.contains("A"))
      .noneMatch(name -> name.contains("d"));
    System.out.println(result);
    // 어떤 기준으로 데이터를 잘 전달하는 것이 Stream을 잘 사용하는 방법이다.

    // 모든 숫자들 중에서 홀수 이면서 19 이상인 숫자들이 3의 배수가 아닌지?
    boolean result2 = intStream
      .filter(num -> num % 2 == 1)
      .filter(num -> num >= 10)
      .noneMatch(num -> num % 3 == 0);
    System.out.println(result2);

    intStream = Arrays.stream(intArray);
    // 숫자들 중에서 홀수인 수에 *2를 한 숫자가 전부 4의 배수인지?
    boolean result3 = intStream
      .filter(num -> num % 2 == 1)
      .map(num -> num * 2)
      .allMatch(num -> num % 4 == 0);
    System.out.println(result3); // false

    // 총합
    intStream = Arrays.stream(intArray);
    int sum = intStream.sum();

    // 갯수
    intStream = Arrays.stream(intArray);
    long count = intStream.count();

    // 평균, 최소, 최대
    intStream = Arrays.stream(intArray);
    double avg = intStream.average()
      .orElse(0.0); // Optional.orElse()

  }
  // 입력은 무엇이며 결과는 무엇일까?
  // 데이터를 받을 때 이 데이터가 맞다 아니다를 판단할 것
  public boolean predicate(String input) {
    // 문자열 a가 포함되었는지 판단하는 메서드
//    return input.contains("a");
    // 문자열의 길이가 4이상인지 판단하는 메서드
    return input.length() >= 4;
  }

  public String toUpper(String input) {
    return input.toUpperCase();
  }
}
