package D6OOP.H6OOP.question2;

public class SavingsAccount  extends BankAccount {

  private int balance;
  // 입금 회차
  private int depositRounds;
  // 만기 회차
  private int maturityPeriod;
  // 회차 입금액
  private int roundDepositAmount;

  public SavingsAccount(String password, int maturityPeriod, int roundDepositAmount) {
    super(password);
    this.depositRounds = 0;
    this.maturityPeriod = maturityPeriod;
    this.roundDepositAmount = roundDepositAmount;
  }

  @Override
  public void deposit(int amount) {
    if ( this.roundDepositAmount == amount) {
      this.balance += amount;
      this.depositRounds++;
      System.out.println(String.format("%s 저축 완료", depositRounds));
    } else {
      System.out.println(String.format("회차 입금액 %s과 일치하지 않습니다.", roundDepositAmount));
    }
  }

  @Override
  public void withdraw(String password, int amount) {

  }

}
