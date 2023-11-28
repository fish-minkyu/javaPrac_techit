package D6OOP.vehicles;

import D6OOP.vehicles.Beeper;
import D6OOP.vehicles.Car;
import D6OOP.vehicles.Ship;

// 서로 다른 객체라도 같은 기능을 가지고 있다면 interface를 사용할 수 있다.
public class interfaceMain {
  public static void main(String[] args) {
    Car car = new Car();
    Ship ship = new Ship();

    makeNoise(car);
    makeNoise(ship);
  }

  public static void makeNoise(Beeper beeper) {
    beeper.beep();
  }
}
