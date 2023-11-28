package D6OOP.composition;

import D6OOP.composition.Author;

import java.time.LocalDateTime;

public class Book {
  private String title;
  // 구성 (composition)
  // 클래스 안에다가 다른 클래스를 넣어서 그 기능을 사용하는 것이 구성이다.
  // Book이 Author의 속성에 접근한다.
  private Author author;
  private LocalDateTime released;
  private String[] toc; // 목차
  private int price;
}
