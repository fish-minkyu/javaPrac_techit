package D6OOP.vehicles;

public class Ship implements Beeper { // interface는 여러 개를 구현 할 수 있다.
  @Override
  public void beep() {
    System.out.println("부아아아앙");
  }
}
