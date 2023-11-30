package D6OOP.vehicles;

import D6OOP.vehicles.Beeper;
import D6OOP.vehicles.Drivable;

// 저번 시간 복습
/*
연료가 얼마나 들었는지에 대한 정보(속성)
연료가 얼마나 남았는지에 대한 정보를 반환하는 메서드
연료를 설정하는 메서드
운전하는 메서드, 실행시 주행거리 / 10 (정수) 만큼 연료 소모
경적을 울리는 'beep' 메서드
*/
public class Car implements Beeper, Drivable { // interfaces는 구현을 통해 상속을 받는다.
  @Override // 안넣어줘도 동작은 정상 작동하나 코드를 직관적으로 나타내기 위해 쓰는걸 권장한다.
  public void beep() {
    System.out.println("빠아아아아앙");
  }

  // private 접근 제어자는 나, 그리고 오로지 나 (상속을 받든 말든)
  // private int fuel;
  // protected 접근 제어나는 우리 자식 자손도 사용할 수 있게 한다.
  protected int fuel;

  public Car() {}
  public Car(int fuel) {
    this.fuel = fuel;
  }

  // 연료가 얼마남았는지 반환하는 메서드
  public int getFuel() {
    return fuel;
  }

  // 연료 설정 메서드
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  // 운전 메서드
  public void drive(int kilos) {
    System.out.println("drive car");
    this.fuel -= kilos / 10;
    System.out.println(String.format(
      "moved: %d, current fuel: %d",
      kilos, this.fuel));
  }
}
