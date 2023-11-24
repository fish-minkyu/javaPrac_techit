package D5Class.H5Class;

public class HomeworkClass {

  public static void main(String[] args) {
//    // H1
//    Person you = new Person("yogurt");
//
//    System.out.println(you.name());
//    you.sayHello();
//    for (int i = 0; i < 10; i++) {
//      you.age();
//    }
//    you.sayHello();

    // H2
    BankAccount kb = new BankAccount("123-0456", 5000, "1224");
    kb.deposit(5000);
    System.out.println(kb.checkMoney());

  }
}
