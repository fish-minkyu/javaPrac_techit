package D5Class.H5Class;

public class BankAccount {
  public BankAccount(String account, int bankMoney, String password) {
    if (account.length() == 8) this.account = account;
    this.bankMoney = bankMoney;
    if ( password.length() == 4) this.password = password;
    count++;
  }

  private String account;
  private int bankMoney;
  private String password;
  private static int count = 0;

  // 예금 메서드
  public void deposit(int money) {
    this.bankMoney += money;
  }

  // 출금 메서드
  public boolean withdrawl(int money, String password) {
    if (password != this.password) {
      return false;
    } else if (bankMoney - money < 0) {
      return false;
    } else {
      bankMoney -= money;
      return true;
    }
  }

  // 전체 계좌 총 수
  public int countAccount() {
    return count;
  }

  // 계좌잔액 확인
  public int checkMoney() {
    return bankMoney;
  }
}
