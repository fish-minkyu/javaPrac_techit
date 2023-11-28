package D6OOP.H6OOP.question1;

public abstract class Book {
  private String title;
  private int pageCount;

  public Book(String title, int pageCount) {
    this.title = title;
    this.pageCount = pageCount;
  }

  // 추상 메서드
  public abstract void printInfo();

  // getter
  public String getTitle() {
    return title;
  }

  public int getPageCount() {
    return pageCount;
  }

}
