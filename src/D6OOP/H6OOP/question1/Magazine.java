package D6OOP.H6OOP.question1;

import java.time.LocalDateTime;

public class Magazine extends Book {
  private LocalDateTime publishDate;
  private String subject;

  public Magazine(String title, int pageCount, LocalDateTime publishDate, String subject) {
    super(title, pageCount);
    this.publishDate = publishDate;
    this.subject = subject;
  }

  public void printInfo() {
    System.out.println(String.format("제목: %s", getTitle()));
    System.out.println(String.format("페이지 수: %s", getTitle()));
    System.out.println(String.format("%d년 %s월 호", publishDate.getYear(), publishDate.getMonth()));
    System.out.println(String.format("주제: %s", subject));
  }

}
