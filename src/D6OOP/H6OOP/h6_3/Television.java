package D6OOP.H6OOP.h6_3;

public class Television implements Switchable, PlaySound, Display{

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
  public  void playSound(int volume) {
    System.out.println(String.format("%s 볼륨입니다.", volume));
  }

  @Override
  public  void display() {
    System.out.println("Tv 화면이 정상적으로 작동합니다.");
  }
}
