package D6OOP.object;

public class Student extends Person {
  private String major; // 참조값은 생성자에서 초기화를 해주지 않았을 때, null을 넣어준다. (null pointer)
  // pointer는 주소를 가리키는 애들이다.
  public Student() {};

  public Student(String name, int age, String major) {
    super(name, age);
    this.major = major;
  }

  @Override
  public String toString() {
    return super.toString() + " Student";
  }
}
