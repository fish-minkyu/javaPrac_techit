package D7Generics.collections;

import java.util.Objects;

// set이 중복을 어떻게 확인하는지 확인하는 문제
/*
비둘기집 원리
비둘기가 들어갈 수 있는 집이 10개인데
비둘기가 25마리라면
누군가는 한방에 2마리 이상이 들어간다.
 */
public class Pigeon {
  private int age;

  public Pigeon(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pigeon pigeon = (Pigeon) o;
    return age == pigeon.age;
  }
  // HashSet에 쓸때 구현 필요
  @Override
  public int hashCode() {
    return Objects.hash(age);
  }

}
