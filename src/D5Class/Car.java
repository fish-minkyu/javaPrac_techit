package D5Class;

// Car Class: 자동차 설계도
// 객체에 대한 정보 = 속성(property)
// 기능 = 메서드
public class Car {
  // 브랜드
  private final String brand; // private: 클래스 내부에서만 접근 가능, 내부의 메서드들만 접근 가능
  // 차종
  private final String name; // final: 생성자 또는 클래스를 생성할 때 단 한번만 할당 가능
  // 탱크 상태
  private int fuel;

  // static (정적 제어자)
  // 정적 속성: static을 추가해 객체 각각이 아닌 클래스가 가지고 관리하는 속성
  // 클래스를 객체화하지 않고 메소드를 사용하기 위해 static을 붙이기도 한다.
  // 즉, 객체에 초점이 아닌 클래스에 초점을 둔 키워드이다.
  // 총 도로를 달리고 있는 자동차의 갯수
  private static int count = 0;

  // 생성자: 객체를 만들 때 호출되는 메서드
  // 생성자를 만들지 않으면 Java가 자동적으로 아무것도 받지 않는 기본 생성자를 만든다.
  // 접근제어자 클래스_이름()
  public Car(String name, String brand, int fuel) {
    this.name = name;
    this.brand = brand;
    this.fuel = fuel;
    count++; // 차가 새로 생성될 때마다 count가 올라간다.
  }

  // 생성자 메서드도 메서드 오버로딩이 가능하다.
  public Car() {
    count++;
    this.name = "Sonata";
    this.brand = "Hyundai";
    this.fuel = 72;
  }


  // 기능 = method: 어떠한 특정 기능을 하기 위한 코드를 모아둔 것
  // 클래스로 인해 만들어진 객체의 속성을 메서드 내에서 활용할 수 있다. (메서드 내 스코프에선 변수 선언이 불필요하다.)

  // private 접근 제어자
  // : 접근 제어자는 속성 or 메서드에 덧붙여서 속성과 메서드에 접근에 대한 권한을 조절하는 것으로
  // private 속성은 클래스 내부에서만 속성과 메서드에 대해 접근할 수 있다.
  // 정보 은닉: 접근 제어자를 통해 객체의 구체적인 정보 노출을 방지

  // Getter & Setter
  // : 내가 허락한 정보만 접근 및 수정하게 하는 방법이다.
  // private 속성 & 메서드는 클래스 내부에서만 접근이 되므로
  // 클래스 밖에서 접근하기 위해 public 메서드를 만들어 private 속성에 접근한다.

  // getter 메소드
  // 속성에 직접 접근하는 것이 아닌 정보만 보여주는 방법
  public String getBrand() {
    return brand;
  } // getter같은 경우, 속성이 해당 속성밖에 없으므로 this를 안써도 된다.

  public String getName() {
    return name;
  }

  // 가진 정보를 출력하는 기능
  public void printInfo() {
    System.out.println(String.format("name: \t%s", name));
    System.out.println(String.format("brand: \t%s", brand ));
    System.out.println(String.format("fuel: \t%d", fuel));
  }

  // setter 메소드
  public void setFuel(int fuel) {
    this.fuel = fuel; // this는 클래스의 인스턴스를 의미, 쉽게 말해 this는 "나"를 지칭
  }

  // 특정 거리를 이동하는 기능
  public void drive (int kilo) {
    fuel -= kilo / 2;
    System.out.println(String.format("Moved: %d km, Fuel: %d", kilo, fuel));
  }

  // 클락션을 울리는 기능
  public void beep() {
    System.out.println("빠아아아앙");
  }
}

// static이 있으면 클래스에서 호출
// 없으면 객체에서 호출할 수 있다.
// (static이 있으면 객체에서도 호출할 수 있지만 클래스에서 호출할 것을 권장한다.)

// getter같은 경우, 속성이 해당 속성밖에 없으므로 this를 안써도 된다.