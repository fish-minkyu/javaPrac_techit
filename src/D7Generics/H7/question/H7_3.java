package D7Generics.H7.question;


import java.util.*;

// 방법1. input을 Set으로 받고 List로 바꾼다.
// 방법2. List를 사용하고 중복값 제거
public class H7_3 {
  public static void main(String[] args) {
    // Set으로 받고 List로 변경
    Scanner scanner = new Scanner(System.in);
    Set<String> inputSet = new HashSet<>();
    while (true) {
      String input = scanner.nextLine();
      if ("q".equals(input)) break;
      // 집합은 기본적으로 중복을 허용하지 않는다.
      inputSet.add(input);
    }

    // 순서를 위해 리스트로 변환
    List<String> names = new ArrayList<>(inputSet);
    // 정렬
    Collections.sort(names);
    // 출력
    for (String name : names) {
      System.out.println(name);
    }
  }
}
