package D5Class.H5Class;

public class Batter {

  // 타석수 batterCount
  private int batterCount = 0;
  // 안타수 hitCount
  private int hitCount = 0;
  // 볼넷수 fourBallcount
  private int fourBallcount = 0;
  // 루타수 baseHitCount
  private int baseHitCount = 0;

  // 안타를 나타내는 메서드
  public void hit(int bases) {
    if (bases >= 1 && bases < 5) {
      this.batterCount++;
      this.hitCount++;
      this.baseHitCount += bases;
    }
  }

  // 아웃을 나타내는 메서드
  public void out() {
    this.batterCount++;
  }

  // 볼넷을 나타내는 메서드
  public void walk() {
    this.batterCount++;
    this.fourBallcount++;
  }

  // 타자의 성적을 묘사하는 메서드
  // 타율을 반환하는 메서드
  public double batAvg() {
    return (double) this.hitCount / (this.batterCount - this.fourBallcount);
  }

  // 출루율을 반환하는 메서드
  public double onBasePer() {
    return (double) (this.hitCount + this.fourBallcount) / this.batterCount;
  }
  // 장타율을 반환하는 메서드
  public double slugPer() {
    return (double) this.baseHitCount / (this.batterCount - this.fourBallcount);
  }
  // OPS를 반환하는 메서드
  public double ops() {
    return onBasePer() + slugPer();
  }

}