package D7Generics.Generics;

import D6OOP.vehicles.Beeper;
import D6OOP.vehicles.Car;
import D6OOP.vehicles.Ship;
import D7Generics.Generics.ArrayWrapper;

public class Main {
  public static void main(String[] args) {
    Integer[] intArray = {10, 20, 30};
    ArrayWrapper<Integer> integerArrayWrapper
      = new ArrayWrapper<>(intArray);

    Double[] doubleArray = {1.0, 2.0, 3.0};
    ArrayWrapper<Double> doubleArrayWrapper
      = new ArrayWrapper<>(doubleArray);

    System.out.println(doubleArrayWrapper.length());
    System.out.println(doubleArrayWrapper.contains(1.0));

    // 메서드 사용
    System.out.println(contains(intArray, 25));
    System.out.println(contains(doubleArray, 2.3));

    Car car = new Car();
    Ship ship = new Ship();

    makeNoise(car);
    makeNoise(ship);
  }

  // 메서드에서 사용시 제어자 뒤 반환타입 전에 제네릭 정의
  public static <T> boolean contains(T[] source, T target) {
    for (T item : source) {
      if (item == null) continue;
      if (item.equals(target)) return true;
    }

    return false;
  }

  public static void makeNoise(Beeper beeper) {
    beeper.beep();
  }
}
