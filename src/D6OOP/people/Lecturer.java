package D6OOP.people;

public class Lecturer extends Person {

  private String subject;

  public  Lecturer(String name, int age, String subject) {
    super(name, age);
    this.subject = subject;
  }

  public void sayHello() {
    System.out.println(String.format(
      "Hello, I'm %s and teaching %s",
      getName(), subject // getName()을 쓰는 이유는 Person 클래스의 name이 private이기 때문이다.
    ));
  }
}
