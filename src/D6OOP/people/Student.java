package D6OOP.people;

import D6OOP.people.Person;

public class Student extends Person { // Student 클래스는 Person 클래스가 가지고 있는 sayHello() 메소드를 구현해야 한다.
  public String major;
  public Student(String name, int age, String major) {
    super(name, age);
    this.major = major;
  }

  // 이 메서드는 무조건 만들어줘야 한다. (추상 클래스와의 계약이라고 생각하면 됨)
  public void sayHello() {
    System.out.println(String.format(
      "Hello, I'm %s, and studying %s!",
      getName(), major
    ));
  }
}
