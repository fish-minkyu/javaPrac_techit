package D6OOP.people;

import java.util.Arrays;

// 추상 클래스: 모두가 공유한 속성들과 기능들을 보관하기 위해 만든 클래스
// 추상 클래스는 반드시 혼자서 만들어질 수 없다.
// 즉, 추상 클래스는 인스턴스를 만들 수 없다. 기능이 없기 때문이다.
public class PersonMain {
  public static void main(String[] args) { // 부모 클래스에서 추상적으로 만들고 자식 클래스에서 구체적으로 완성을 하는 것이다.
    Person alex = new Student("Alex", 32,"CSE");
    alex.sayHello(); // Person에 메서드를 정의하고 Student 클래스에서 구현완성을 해주었기 때문에 사용 가능 // 자식 클래스가 완성을 한 것

    Person brad = new Student("Brad", 17,"CSE");
    brad.sayHello();

    Person chad = new Lecturer("Chad", 34, "OOP");
    chad.sayHello();

    // 모든 Person에는 sayHello()가 있기에 가능한 문법
    Person[] people = {alex, brad, chad};
    for (Person person : people) {
      person.sayHello();
    }

    Person dave = new Student("Date", 25, "CSE");
    Person eric = new Student("Eric", 23, "MD");

    people = new Person[]{alex, brad, chad, dave, eric};
    // 배열을 정렬하는 메서드
    Arrays.sort(people);
    for (Person person: people) {
      person.sayHello(); // 나이순으로 정렬
    }
  }

}
