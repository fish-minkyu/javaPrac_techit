package D6OOP.H6OOP.h6_3;

public class Computer implements Switchable, PlaySound, Display{
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
  public void playSound(int volume) {
    System.out.println(String.format("%s로 스피커 음성 출력 중", volume));
  }

  @Override
  public void display() {
    System.out.println("모니터 정상 출력 중");
  }
}
