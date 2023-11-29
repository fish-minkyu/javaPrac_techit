package D6OOP.H6OOP.h6_3;

public class Induction implements Switchable, CookingUtensil{
  private boolean turnOnOff = false;
  @Override
  public void Switchable() {
    if (!turnOnOff) {
      System.out.println("전원이 켜졌습니다.");
      turnOnOff = true;
    } else {
      System.out.println("전원이 꺼졌습니다.");
    }
  }

  @Override
  public void cookingAble() {
    System.out.println("요리 준비 완료!");
  }
}
