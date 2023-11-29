package D6OOP.H6OOP.h6_2;

// 출금, 예금 기능을 해야 하므로 추상 클래스로 만드는 것은 맞지 않다.
public class BankAccount {
  private int balance;
  private String password;

  public BankAccount(String password) {
    this.password = password;
  }
  // 출금 메서드
  public void withdraw(int amount, String password) {
    if (this.password.equals(password)) {
      if (balance >= amount) {
        this.balance -= amount;
        System.out.println(String.format("출금 완료! 현재 잔액: %s", balance));
      } else {
        System.out.println("잔액이 부족합니다.");
      }
    } else {
      System.out.println("비밀번호가 일치하지 않습니다.");
    }
  }

  // 예금 메서드
  public void deposit(int amount) {
    this.balance += amount;
    System.out.println(String.format("입금 완료, 현재 잔액: %s", balance));
  }
}
