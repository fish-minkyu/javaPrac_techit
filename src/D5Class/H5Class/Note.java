package D5Class.H5Class;

public class Note {
  private String title;
  private String[] pages;

  public Note(String title, int pages) {
    this.title = title;
    this.pages = new String[pages];
  }

  public void write(int page, String content) {
    pages[page] = content;
  }

  public String read(int page) {
    return pages[page];
  }

  // 총 몇쪽이 작성되었는지 반환하는 메서드
  public int totalCountPages() {
    int count = 0;
    for (String page : pages) {
      if (page != null) count++;
    }
    return count;
  }

  // 작성된 모든 내용을 페이지 순서대로 출력하는 메서드
  public void readAll() {
    for (String page : pages) {
      if (page != null) {
        System.out.println(page);
      }
    }
  }
}
