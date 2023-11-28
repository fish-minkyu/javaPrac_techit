package D6OOP.object;

import java.util.Objects;

public abstract class Person { // java 기본동작. Object를 상속받고 있다.
  private String name;
  private int age;

  public Person() {};
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getter
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return String.format("%s, age: %d", name, age);
  }

  @Override
  public boolean equals(Object o) {
    // 1. 실제로 두 변수의 값(= 할당된 주소)이 동일하냐?
    if (this == o) return true;
    // 2. null이거나, 둘이 다른 클래스인가?
//    if ( o == null || this.getClass() != o.getClass()) return false;
    // 서로 다른 자식 클래스가 일치하게 하고 싶다면
    if (o instanceof Person) /* 나랑 같은 Person 클래스를 상속받았는지가 기준 */ return false;
    // 3. 나머지 속성을 비교하자
    Person other = (Person) o;
    return
      this.age == other.age &&
      this.name.equals(other.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

}
