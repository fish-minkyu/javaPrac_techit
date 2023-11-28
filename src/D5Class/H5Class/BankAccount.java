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
  private static int totalBalance;

  // 예금 메서드
  public void deposit(int money) {
    this.bankMoney += money;
  }

  // 출금 메서드
  public boolean withdrawl(int money, String password) {
    if (!this.password.equals(password) || this.bankMoney < money) {
      return false;
    }

    this.bankMoney -= money;
    totalBalance -= money;
    return true;
  }

  // 전체 계좌 총 수
  public static int countAccount() {
    return count;
  }

  // 계좌잔액 확인
//  public static int getTotalBalance(BankAccount[] accounts) {
//    int totalBalance = 0;
//    for (BankAccount account : accounts) {
//      totalBalance += account.bankMoney;
//    }
//
//    return totalBalance;
//  }
  public static int totalBalance() {
    return totalBalance;
  }


}
