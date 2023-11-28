package D6OOP.vehicles;

// 가장 먼저 자동차의 모든 기능을 가지게 만들자.
public class Truck extends Car { // extends: Car class를 상속받는다.
  // 짐을 실을 수 있는 한도
  private int maxload;
  // 현재 실린 짐
  private int load;

  public Truck(int maxload) {
    this.maxload = maxload;
    this.load = 0; // 이거 안해도 됨, 객체의 속성 원시타입은 크게 상관없다.
  }

  // 짐을 인자로 받아, 추가했을 때 총 짐이 maxload 이하면 추가하고
  // 아니면 추가하지 않은 다음
  // 추가 성공여부를 boolean으로 반환하는 메서드
 public boolean addLoad(int load) {
    if (this.load + load > this.maxload) {
      return false;
    }
    this.load += load;
    return true;
 }

 // getter Maxload
  public int getMaxload() {
    return maxload;
  }

  // getter load
  public int getLoad() {
    return load;
  }

  // 메서드 오버라이딩
  // 이름과 매개변수가 똑같은 메서드를 가져오기
  // @Override 붙이기
  @Override
  public void drive(int kilos) { // super: 부모 클래스 subs: 자식 클래스
    System.out.println("drive truck");
    // setFuel(getFuel() -1); Car class의 fuel이 private일 때, 메소드를 직접 가져올 수 없으므로 이렇게 한다.
    this.fuel -= load / (maxload / 10); // protected로 인해 직접 가져올 수 있게 되었다.
    super.drive(kilos); // drive car // super는 부모 클래스 객체를 의미한다.
  }

  // 다형성: 한 가지 기능으로 여러가지 기능을 만드는 것
  // 메서드 오보로딩과 메서드 오버라이딩 모두 다형성이 있다.
}
