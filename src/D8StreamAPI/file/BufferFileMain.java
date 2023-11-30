package D8StreamAPI.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// FileReader의 단점은 글자를 하나씩만 읽는다는 것이다.
// BufferReader는 줄 단위로 글을 읽는다.
public class BufferFileMain {
  public static void main(String[] args) {
    List<String> readLines = new ArrayList<>();
    List<Person> people = new ArrayList<>();
    // try-with-resource
    // BufferedReader는 파일을 읽기 위해서가 아니라
    // 전체적인 입출력 과정에 *버퍼링 기능을 더해주기 위해서
    try (FileReader fileReader = new FileReader("people.csv"); // 어떤 파일을 열건지
         BufferedReader reader = new BufferedReader(fileReader)) {
      String line;
      while ((line = reader.readLine()) != null) {
        // 데이터를 모으고 정리하는 부분
        System.out.println(line);
        readLines.add(line);
        // 쉼표를 기준으로 나눈다.
        String[] seperated = line.split(",");
        Person person = new Person(
          seperated[0],
          seperated[1],
          Integer.parseInt(seperated[2]),
          seperated[3]
        );
        people.add(person);
      }
    } catch (IOException e) {
      System.out.println("Error Opening File: " + e.getMessage());
    }

    for (Person person : people) {
      System.out.println("name: " + person.getName());
      System.out.println("age: " + person.getAge());
    }
    // 파일입출력은 장기기억장치에 입출력을 하는 것이기 때문에,
    // 입출력 횟수를 줄여야 속도가 빨라진다.
    try (FileWriter fileWriter = new FileWriter("people2.csv"); // 어떤 파일에 작성할건지
         BufferedWriter writer = new BufferedWriter(fileWriter)){
//      for (String line : readLines) {
//        // 무슨 내용을 작성할 것인지
//        writer.write(line);
//        writer.newLine();
//      }
      for (Person person : people) {
        String Line = String.format(
          "%s, %s, %d, %s",
          person.getName(),
          person.getEmail(),
          person.getAge() +1,
          person.getGender());
      }
    } catch (IOException e) {
      System.out.println("Error Writing File: " + e.getMessage());
    }
  }
}
// 버퍼링이란?
// : 한번에 많은 양의 데이터를 입출력하기 위해서 공간을 잡아두고 데이터를 모아두는 행위

