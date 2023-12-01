package D5Class; // 패키지가 같으면 export, import를 안해줘도 된다.

public class Main {

  public static void main(String[] args) {
    // PublicCar class 객체를 만드는 행위, PublicCar 자료형 변수가 만들어진다.
    // PublicCar myCar, 어떤 클래스를 자료형으로 받을지 적어주는 것
    PublicCar myCar = new PublicCar();

    myCar.brand = "kia";
    myCar.name = "k5";
    myCar.fuel = 72;
    PublicCar.count += 1;

    System.out.println(myCar.brand);
    System.out.println(myCar.name);
    System.out.println(myCar.fuel);
    System.out.println(PublicCar.count); // 1
    myCar.printInfo();
    myCar.beep();

    PublicCar car = new PublicCar();
    car.brand = "Hyundai";
    car.name = "Sonata";
    car.fuel = 80;
    PublicCar.count += 1; // static(정적 제어자)로 클래스에서 관리
    System.out.println(PublicCar.count); // 2
    car.printInfo();

    PublicCar somePublicCar = new PublicCar();
    PublicCar.count += 1;
    somePublicCar.name = "K3";
    somePublicCar.brand = "Kia";
    somePublicCar.fuel = 60;
    somePublicCar.printInfo();

    // 객체의 중요한 속성을 마음대로 고쳐도 괜찮을까?
    // 이 2개의 속성은 바뀌어선 안되는건데..
    somePublicCar.brand = "Mecredes-Benz";
    somePublicCar.name = "E-Class";

    // 외부 접근을 해줘야 될까?
    // 모델명과 브랜드는 바꿀 수 없는 속성인데?
    // 그럴 때, Getter과 Setter를 사용한다.
//    someCar.name = "E-Class";
//    someCar.brand = "Mercedes-Benz";
//    someCar.printInfo();
//
//    Person me = new Person("minkyu Eo");
//    for (int i = 0; i < 30; i++) {
//      me.age();
//    }
//
//    System.out.println(me.getAge());
//    me.sayHello();

    // Getter, Setter 적용 후 코드
    PrivateCar somePrivateCar = new PrivateCar("k5", "kia", 72);
    System.out.println(somePrivateCar.getBrand());
    somePrivateCar.printInfo();
    somePrivateCar.setFuel(100);

    // Person
    Person man = new Person("someone");
    for (int i = 0; i < 40; i++) {
      man.age();
    }

    System.out.println(man.getName()); // man
    System.out.println(man.getAge()); // 40
  }
}
