package D5Class.H5Class;
import java.time.LocalDateTime;

public class Post {

  private String title;

  private String content;
  public String password;
  public LocalDateTime created;
  public LocalDateTime updated;

  public Post(String title, String content, String password) {
    this.title = title;
    this.content = content;
    this.password = password;
    this.created = LocalDateTime.now();
    this.updated = LocalDateTime.now();
  }

  public void printPost() {
    System.out.println(String.format("제목: %s", title));
    System.out.println(String.format("본문: %s", content));
    System.out.println(String.format("작성일: %s", created));
    System.out.println(String.format("수정일: %s", updated));
  }

  public boolean editTitle(String title, String password) {
    if (this.password != password) {
      return false;
    }

    this.title = title;
    this.updated = LocalDateTime.now();
    return true;
  }

  public boolean editcontent(String content, String password) {
    if (this.password != password) {
      return false;
    }

    this.content = content;
    this.updated = LocalDateTime.now();
    return true;
  }
}
