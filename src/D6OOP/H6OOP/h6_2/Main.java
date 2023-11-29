package D6OOP.H6OOP.h6_2;

public class Main {
  public static void main(String[] args) {
    BankAccount kbAccount = new BankAccount("1234");

    kbAccount.deposit(50000);
    kbAccount.withdraw(40000, "1234");
    kbAccount.withdraw(40000, "1234");
    kbAccount.withdraw(40000, "123");

    SavingsAccount cityAccount = new SavingsAccount("4321", 3, 5000);
    cityAccount.deposit(5000);
    cityAccount.withdraw(3000, "4321");
    cityAccount.deposit(5000);
    cityAccount.deposit(5000);
    cityAccount.withdraw(3000, "4321");
  }
}
