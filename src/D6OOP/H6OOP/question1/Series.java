package D6OOP.H6OOP.question1;

public class Series extends Book{
  private String Author;
  private String subTitle;
  private int series;

  public Series(String title, int pageCount, String Author, String subTitle, int series) {
    super(title, pageCount);
    this.Author = Author;
    this.subTitle = subTitle;
    this.series = series;
  }

  public void printInfo() {
    System.out.println(String.format("제목: %s", getTitle()));
    System.out.println(String.format("페이지 수: %s", getTitle()));
    System.out.println(String.format("작가: %s", Author));
    System.out.println(String.format("부제: %s", subTitle));
    System.out.println(String.format("시리즈 %d째", series));
  }
}
