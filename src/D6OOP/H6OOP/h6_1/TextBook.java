package D6OOP.H6OOP.h6_1;

public class TextBook extends Book{
  private String subject;
  private int grade;

  public TextBook(String title, int pageCount, String subject, int grade) {
    super(title, pageCount);
    this.subject = subject;
    this.grade = grade;
  }

  public void printInfo() {
    System.out.println(String.format("제목: %s", getTitle()));
    System.out.println(String.format("페이지 수: %s", getTitle()));
    System.out.println(String.format("과목: %s", subject));
    System.out.println(String.format("%d학년", grade));
  }
}
