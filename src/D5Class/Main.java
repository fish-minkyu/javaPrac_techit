package D5Class; // 패키지가 같으면 export, import를 안해줘도 된다.

public class Main {
//  public static void main(String[] args) {
//    // Car class 객체를 만드는 행위, Car 자료형 변수가 만들어진다.
//    // Car myCar, 어떤 클래스를 자료형으로 받을지 적어주는 것
//    Car myCar = new Car();
//
//    myCar.brand = "kia";
//    myCar.name = "k5";
//    myCar.fuel = 72;
//    Car.count += 1;
//
//    System.out.println(myCar.brand);
//    System.out.println(myCar.name);
//    System.out.println(myCar.fuel);
//    System.out.println(Car.count); // 1
//    myCar.printInfo();
//    myCar.beep();
//
//    Car car = new Car();
//    car.brand = "Hyundai";
//    car.name = "Sonata";
//    car.fuel = 80;
//    Car.count += 1;
//    System.out.println(Car.count); // 2
//    car.printInfo();
//
//    Car someCar = new Car();
//    Car.count += 1;
//    someCar.name = "K3";
//    someCar.brand = "Kia";
//    someCar.fuel = 60;
//    someCar.printInfo();
//
//    // 객체의 중요한 속성을 마음대로 고쳐도 괜찮을까?
//    // 이 2개의 속성은 바뀌어선 안되는건데..
//    someCar.brand = "Mecredes-Benz";
//    someCar.name = "E-Class";
//  }

  // Getter, Setter 적용 후 코드
  public static void main(String[] args) {
    Car someCar = new Car("k5", "kia", 72);
//    someCar.name = "K5";
//    someCar.brand = "Kia";
//    someCar.fuel = 72;
    System.out.println(someCar.getBrand());
    someCar.printInfo();
    someCar.setFuel(100);


//    // 외부 접근을 해줘야 될까?
//    // 모델명과 브랜드는 바꿀 수 없는 속성인데?
//    someCar.name = "E-Class";
//    someCar.brand = "Mercedes-Benz";
//    someCar.printInfo();

//    Person me = new Person("minkyu Eo");
//    for (int i = 0; i < 30; i++) {
//      me.age();
//    }
//
//    System.out.println(me.getAge());
//    me.sayHello();
  }

}
