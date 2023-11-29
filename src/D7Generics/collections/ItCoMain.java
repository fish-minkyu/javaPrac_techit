package D7Generics.collections;

import java.util.*;

// List와 Set은 상호호완이 가능하다.
public class ItCoMain {
  public static void main(String[] args) {
    // It

    // Iterable 또는 Collection 또는 List 또는 Set
    // 전부 순회 가능하다.
    // List와 Set 모두 Iterable이다. 서로 바꾸기 가능
    List<String> skillList = new ArrayList<>(); // List에서 Set으로 바꿔도 똑같이 동작한다.(단 순서는 보장 못함)
    skillList.add("java");
    skillList.add("javascript");
    skillList.add("git");
    skillList.add("md");
    skillList.add("python");
    skillList.add("aws");

    for (String skill : skillList) {
      System.out.println(skill);
      // 제거하면 예외가 발생할 수 있다.
      // skillList.remove("python"); // Error, foreach문에서 데이터 제거하면 에러가 발생
    }

    // Iterator: Iterable을 하나씩 보는 놈
    Iterator<String> iter = skillList.iterator();
    // 다음 실행할 것이 있는지 확인
    while (iter.hasNext()) {
      String skill = iter.next();
      System.out.println(skill);
      // iter.remove를 쓰면
      // 안전하게 순회중 제거가 가능
      if ("python".equals(skill)) {
        iter.remove();
      }
    }

    // Collection
    // : 데이터들을 관리하기 위한 add, clear 같은 메소드가 정의된 곳
    List<String> listCollection = new ArrayList<>();
    Set<String> setCollection = new HashSet<>();

    System.out.println(listCollection.size());
    System.out.println(listCollection.isEmpty());
    System.out.println(listCollection.contains(""));
    System.out.println(listCollection.containsAll(setCollection));
    // Set의 Collection 메서드들
    System.out.println(setCollection.size());
    System.out.println(setCollection.isEmpty());

    // => 둘 다 데이터들을 관리하는 기능들을 가지고 있어서 할 수 있는 메서드들이 유사하다.

    // Collection의 문서를 보면,
    // Collection 인터페이스를 구현하는 클래스는
    // 1. 아무것도 없는 기본 생성자와
    // 2. 다른 Collection을 받아 그 모든 원소를 가지는 생성자를
    // 만들어 마땅하다.
    // 왜? 서로 필요할 때 바꾸어 만들어 사용하라고 한 의미다.
    List<String> listWithDuplicates = new ArrayList<>();
    listWithDuplicates.add("java");
    listWithDuplicates.add("java");
    listWithDuplicates.add("java");

  }
}
