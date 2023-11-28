package D6OOP.object;

public class Main {
  public static void main(String[] args) {
//    Person alex = new Person("Alex", 25);
    Person alex = new Student("Alex", 25, "CSE");
    int a = 0;
    // 수많은 계산이 진행된다.
    // 이후 int a가 얼마인지 확인하려면?
    System.out.println(a);
    // alex에 어떤 값이 있을까? // Person <- 클래스, @1f32e575 <- 메모리 주소
    // alex에 들어있는 객체에 따라 System.out.println(alex)의 값이 달라진다. <- toString 오버라이드 때문
    // alex가 Person 객체일 때, Alex, age: 25
    // alex가 Student 객체일 때, Alex, age: 25 Student
    System.out.println(alex); // 객체는 Student 이므로 toString 오버라이드 후, Alex, age: 25 Student가 나온다.

    Person brad = new Lecturer("Brad", 40, "Generics");
    System.out.println(brad); // Brad, age: 40 Lecturer
    // Person으로 선언한 이유
    // 호환성 문제 때문이다. 가능하면 상위 객체에서 묶을 수 있는 단계라면 상위 객체로 선언하는 것이 활용성이 좋다.

    Person alex2 = new Student("Alex", 25, "CSE");
    System.out.println(alex == alex2); // false, 메모리 주소가 다르기 때문에 다르다고 나온다.
    System.out.println(alex.equals(alex2)); // true

    Person alex3 = new Lecturer("Alex", 25, "Korean");
    System.out.println(alex.equals(alex3)); // false, 서로 다른 클래스를 가지고 있으므로 false가 나온다.

    // null
    Person noName = new Student();
    System.out.println(noName.getAge()); // 0
    System.out.println(noName.getName()); // null

  }
}
