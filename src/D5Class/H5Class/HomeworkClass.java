package D5Class.H5Class;

public class HomeworkClass {

  public static void main(String[] args) {
//    // H1(완료)
//    Person you = new Person("yogurt");
//
//    System.out.println(you.name());
//    you.sayHello();
//    for (int i = 0; i < 10; i++) {
//      you.age();
//    }
//    you.sayHello();

//    // H2(완료)
//    BankAccount[] accounts = new BankAccount[3];
//    accounts[0] = new BankAccount("12345678", 1000, "1234");
//    accounts[1] = new BankAccount("12341234", 1500, "4321");
//    accounts[2] = new BankAccount("43214321", 2000, "1212");
//
//    int totalBalance = BankAccount.getTotalBalance(accounts);
//    System.out.println(totalBalance);

//    // H3(완료)
//  Post post = new Post("test", "test입니다", "1234");
//  post.printPost();
//  System.out.패intln(post.editTitle("update1", "1234"));
//  System.out.println(post.editTitle("update2", "1235"));
//  System.out.println(post.editcontent("update1", "1234"));
//  post.printPost();

  // H4(실)


  // H5(완료)
    Batter fish = new Batter();
    fish.out();
    fish.hit(3);
    fish.hit(4);
    fish.walk();

    System.out.println(String.format("타율: %.2f", fish.batAvg()));
    System.out.println(String.format("출루율: %.2f", fish.onBasePer()));
    System.out.println(String.format("장타율: %.2f", fish.slugPer()));
    System.out.println(String.format("OPS: %.2f", fish.ops()));
  }
}
