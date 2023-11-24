package D5Class.H5Class;

public class Person {
    public Person(String name) {
      this.name = name;
      this.age = 0;
    }

    private final String name;
    private int age;

    public void sayHello() {
      if (this.age >= 5) {
        System.out.println(String.format("Hello, I'm %s", name));
      } else {
        System.out.println("응애응애");
      }
    }

    public int age() {
      age += 1;
      return age;
    }

    public String name() {
      return name;
    }
}
