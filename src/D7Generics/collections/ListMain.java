package D7Generics.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 배열보다 더 편하게 관리를 할 수 있다는 것이 collection framework의 장점이다.
// 배열 대신 쓰는게 맞다
public class ListMain {
  public static void main(String[] args) {
    // List는 인터페이스다.
    // 자료형 선언은 List<>으로 해주는게 ArrayList<>보다 호환성이 좋다.

    // ArrayList: 배열을 관리해주는 Collection-List
    List<String> names = new ArrayList<>();
    // 리스트에 넣기
    names.add("Alex"); // names의 뒤에서부터 데이터를 넣어준다.
    names.add("Brad");
    names.add("Dave");
    names.add("Eric");
    // 데이터 회수
    System.out.println(names.get(0)); // Alex
    System.out.println(names.get(1)); // Brad
    // 중간에 넣기
    names.add(2, "Chad");
    System.out.println(names); // [Alex, Brad, chad, Dave, Eric]
    // 데이터 위치 찾기
    System.out.println("Chad is at " + names.indexOf("Chad")); // Chad is at 2
    // 없을 경우 -1 반환
    System.out.println("Grag is at " + names.indexOf("Grag")); // -1
    // 데이터 제거하기
      // 1. 몇번째 칸 제거 (순서를 기준)
    System.out.println(names.remove(3)); // Dave, 해당 칸이 무슨 데이터였는지 알려줌
      // 2. 특정 값 제거 (값을 기준)
    System.out.println(names.remove("Eric")); // true, 제거 성공여부 반환함
    System.out.println(names.remove("Eric")); // false

    // 제네릭은 원시타입은 못쓴다. 클래스의 참조값을 받아야 한다.
    // List<int> intList = new ArrayList<>(); Error
    // 대신 Wrapper 사용 가능
    List<Integer> intList = new ArrayList<>();
    intList.add(123);
    intList.add(10);
    intList.add(20);
    intList.add(439);
    System.out.println(intList);
    // 순서로 제거할 때
    System.out.println(intList.remove(2));
    // 값으로 제거할 때
    System.out.println(intList.remove(Integer.valueOf(20)));


    // 배열과 비교
    String[] nameArray = new String[16]; // 이렇게 초기값을 설정할 필요가 없다.
    nameArray[0] = "Alex"; // 기본적으로 어디에다가 넣어줘야 하는지 알아야 한다.
    nameArray[1] = "Brad";
    nameArray[2] = "Dave";
    nameArray[3] = "Eric";

    System.out.println(nameArray[0]); // Alex
    System.out.println(nameArray[1]); // Brad
    // index 2번에다가 chad를 추가로 넣고 싶다면?
    // 1. 직접 일일히 뒤로 밀어줘야 하며
    // 2. 몇개의 원소가 들어갔는지 확인할 도리가 없어서 따로 변수로 관리를 해줘야 함
    nameArray[4] = nameArray[3];
    nameArray[3] = nameArray[2];
    nameArray[2] = "chad";


  }
  // 매개변수 전달할 때는 기능을 중요시하는 interface 기준으로 매개변수 선언
  // 이유: 구현을 중시하는 방식으로 요구를 하면 기능적 측면의 차이가 없는 클래스는 하나도 못쓴다.
  // List를 쓰면 ArrayList와 LinkedList 둘 다 받을 수 있다.
  // ArrayList로 선언하면 ArrayList만 받을 수 있다.
  // ArrayList와 LinkedList는 기능차이에는 문제가 없고 성능에서만 차이가 있다.
  // 즉, 자료형 선언 시, interface명을 적어주는 것이 상속을 최대 활용할 수가 있다.
  public static int sum(List<Integer> intList) { // 매개변수 자료형 선언 시, List를 쓰는게 맞다.
    return 0;
  }
}
