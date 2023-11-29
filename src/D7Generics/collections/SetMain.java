package D7Generics.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
  public static void main(String[] args) {
    Set<String> skillSet = new HashSet<>(); // Hash Table을 사용해서 중복 여부 파악 -> hashcode를 사용해서 구분한다.
    skillSet.add("md");
    skillSet.add("git");
    skillSet.add("java");
    skillSet.add("oop");
    skillSet.add("java"); // 중복되므로 추가가 안됨
    // 데이터 순서를 보장하지 않지만 중복값은 허용하지 않는다.
    System.out.println(skillSet); // [oop, git, java, md]
    // 데이터 제거
    System.out.println(skillSet.remove("java")); // true


    List<String> skillList = new ArrayList<>();
    skillList.add("java");
    skillList.add("kotlin");
    skillList.add("android");
    skillList.add("flutter");
    skillList.add("react");
    skillList.add("git");
    // 다른 Collection의 원소를 전부 추가 시도
    // 내가 없는 원소들을 선별해 추가한다.
    // 하나라도 추가하면 true
    System.out.println(skillSet.addAll(skillList)); // true

    List<Pigeon> listHoles = new ArrayList<>();
    Set<Pigeon> setHoles = new HashSet<>();

    for (int i = 0; i < 20; i++) {
      Pigeon pigeon = new Pigeon(i % 10);
      listHoles.add(pigeon);
      setHoles.add(pigeon);
    }

    System.out.println("리스트의 비둘기: " + listHoles.size()); // 20
    System.out.println("집합의 비둘기: " + setHoles.size()); // 20 // hash해서 같은 값인지 판별하기 때문

    // 이렇게 하면
//    @Override
//    public boolean equals(Object o) {
//      if (this == o) return true;
//      if (o == null || getClass() != o.getClass()) return false;
//      Pigeon pigeon = (Pigeon) o;
//      return age == pigeon.age;
//    }
//    // HashSet에 쓸때 구현 필요
//    @Override
//    public int hashCode() {
//      return Objects.hash(age);
//    }
    System.out.println("집합의 비둘기: " + setHoles.size()); // 10이 된다.

    List<String> thirdSkills = new ArrayList<>();
    thirdSkills.add("javascript");
    thirdSkills.add("typescript");
    thirdSkills.add("react");
    thirdSkills.add("python");
    thirdSkills.add("java");

    // 차집합
    System.out.println(skillSet.removeAll(thirdSkills)); // true, 하나라도 빼면 true가 나온다.
    System.out.println(skillSet); // [oop, flutter, git, md, android, kotlin], java랑 react만 빠져있다.

    // 집합 비우기
    skillSet.clear();
    System.out.println(skillSet);
  }
}
