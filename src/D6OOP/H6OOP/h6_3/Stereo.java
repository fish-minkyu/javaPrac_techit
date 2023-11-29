package D6OOP.H6OOP.h6_3;

public class Stereo implements Switchable, PlaySound{
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

  public void playSound(int volume) {
    System.out.println(String.format("%s 사운드입니다.", volume));
  }
}
