package D6OOP.people;
/*
사람을 만들고 (이름) (인사를 할거지만, 누가 하는지에 따라 다르게 하고 싶다)
학생을 만들고 (이름, 전공) (인사)
강사를 만들고 (이름, 주제) (인사)
*/

// abstract class: 추상 클래스
// abstract는 추상 제어자라고 할 수 있다.
// 추상 클래스와 일반 클래스의 가장 큰 차이는 메서드다.
public abstract class Person implements Comparable{

  private String name;
  private int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Comparable에서 구현을 요구하는 메서드
  // 두개의 객체의 대소를 비교하기 위함
  // Java에서 제공하는 정렬 기능을 활용할 때 사용됨
  @Override
  public int compareTo(Object o) {
    return age - ((Person) o).age;
  }

  // 추상 메서드: 작동법(메서드 바디)를 작성하지 않고, 상속 받은 클래스에 구현을 위임하는 메서드
  public abstract void sayHello(); // 내 자식이 될려면 이걸 할 줄 알아야 돼!란 의미

  public String getName() {
    return this.name;
  }
}
