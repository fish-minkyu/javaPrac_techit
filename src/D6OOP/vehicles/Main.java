package D6OOP.vehicles;

public class Main {
  public static void main(String[] args) {
    // Car class 인스턴스 sonata
    Car sonata = new Car();
    refuel(sonata);
    System.out.println(sonata.getFuel());
    sonata.drive(100);
    sonata.beep();

    // Truck class 인스턴스 porter
    Truck porter = new Truck(100); // upcasting, Truck -> Car 자료형도 사용 가능하다.
    refuel(porter);
    System.out.println(porter.getFuel());
    porter.drive(100);
    porter.beep();
    porter.addLoad(30);
    System.out.println(String.format("max load: %d, current load: %d", porter.getMaxload(), porter.getLoad()));

    // 상속을 했기에 자료형을 Car로 써도 별 상관이 없다.
    Car bongo = new Truck(100); // upcasting
    // 단 Truck 클래스 자체만의 메소드를 사용하고 한다면 문제가 생긴다.
    // 안에 들어가 있는 것은 Truck이지만 Car이기때문인 것이다.
    // bongo.addLoad(30); // Error

    // downcasting, Car -> Truck 형변환 해주기
    ((Truck) bongo).addLoad(10);

    // 객체의 instance 확인하기
    if (isTruck(bongo)) {
      ((Truck) bongo).addLoad(10);
    } else {
      System.out.println("is not truck");
    }

    porter.drive(30); // drive truck
    bongo.drive(30); // drive truck <- 인스턴스는 Truck이니까

  }
  public static boolean isTruck(Car car) {
    return car instanceof Truck;
  }

  public static void refuel(Car car) {
    car.setFuel(100);
  }

}
