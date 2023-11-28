package D6OOP.H6OOP.question1;

import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    Book magazine = new Magazine("test", 120, LocalDateTime.now(), "java");
    magazine.printInfo();

    System.out.println("---------------------------------");

    Book series = new Series("series1", 20, "Minkyu", "find Java", 3);
    series.printInfo();

    System.out.println("---------------------------------");

    Book TextBook = new TextBook("text1", 17, "math", 3);
    TextBook.printInfo();
  }
}
