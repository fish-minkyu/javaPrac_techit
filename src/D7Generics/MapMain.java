package D7Generics;

import java.util.*;

// Map은 key와 value 쌍으로 이루어져 있다. (key-value pair)
// 순서를 보장하지 않는다. 짝만 이룬다.
public class MapMain {
  public static void main(String[] args) {
    // dict
    // JSON
    // -> Java Map
    // 핸드폰 - 연락처
    // 연락처를 검색하는 기준? 이름
    // 이름 - 전화번호
    // 이게 Map이다. Key - Value, 이름으로 전화번호를 찾는다.
    // 메뉴 - 가격
    // 이름 - 성적
    Map<String, String> contactBook = new HashMap<>();
    // Map에 연락처 저장
    contactBook.put("Alex", "010-Alex-5678");
    contactBook.put("Brad", "010-Brad-5678");
    contactBook.put("Chad", "010-Chad-5678");
    contactBook.put("Eric", "010-Eric-5678");
    // Map에서 연락처 찾아오기
    System.out.println(contactBook.get("Alex")); // 010-Alex-5678
    System.out.println(contactBook.get("Brad"));
    System.out.println(contactBook.get("Chad"));
    // 주의
      // 1. 없는 걸 가져올때는 null이 된다.
    System.out.println(contactBook.get("Dave")); // null, null에 대한 null 체크를 반드시 해줘야 한다.
      // 2. 있는 걸 다시 넣을 때는 덮어씌운다.
    System.out.println(contactBook.put("Eric", "010-중복"));

    // git config user.email 이메일
    // git config user.name 아이디

    // 사람 한명에 대한 정보
    // name - "어민규"
    // age - "30"
    // major - "IC"

    // 전공생 수
    // CSE - 10
    // EE - 20
    // ME - 15
    // BA - 30

    Map<String, Integer> majorCount = new HashMap<>();
    majorCount.put("CSE", 10);
    majorCount.put("EE", 20);
    majorCount.put("ME", 15);
    majorCount.put("BA", 30);
    System.out.println(majorCount); // {EE=20, CSE=10, ME=15, BA=30}
    // 만약 데이터를 넣어야 되는 상황에, 새로운 전공이 생기면?
    // 1. majorCount.get("major") == null
    String newMajor = "ENG";
    if (majorCount.get(newMajor) == null) {
      majorCount.put(newMajor, 1);
    } else {
      majorCount.put(newMajor, majorCount.get(newMajor) + 1);
    }

    // 2. putIfAbsent
    Integer before = majorCount.putIfAbsent(newMajor, 1);
    if (before != null) {
      majorCount.put(newMajor, before + 1);
    }

    // Map의 타입에는 여러 데이터를 포함한 타입들이 올 수 있다.
    // Map<String, List<String>>, Map<String, Person>
    Map<String, List<String>> majorStudents = new HashMap<>();
    majorStudents.put("CSE", new ArrayList<>());

    // KeySet(), entrySet()
    // Map을 순회하고 싶으면 둘 중 하나 선택할 수 있다.
    // KeySet() - Key로만 구성된 Set
    for (String key : contactBook.keySet()) {
      System.out.println(key); // Alex
      System.out.println(contactBook.get(key)); // 010-Alex-5678
    }

    // entrySet() - Key - Value 쌍으로 구성된 Set
    for (Map.Entry<String, String> entry : contactBook.entrySet()) { // Map.Entry<String, String>에서 Entry는 key & value 쌍을 의미한다.
      System.out.println(entry.getKey()); // Alex
      System.out.println(entry.getValue()); // 010-Alex-5678
    }
  }
}
