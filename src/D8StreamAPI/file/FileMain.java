package D8StreamAPI.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// 최상위 디렉토리는 컴퓨터에선 하나밖에 없다.
// 프로젝트의 맨 위 파일을 rootFile이라고 부른다.
// intelliJ가 현재 실행시키고 있는 파일의 맨 위 파일을 기준으로 찾는다.

// FileReader란 클래스가 파일을 읽어주고 FileWriter가 파일을 써주는구나만 알면 된다.
public class FileMain {
  public static void main(String[] args) {
    // try-with-resources
    // AutoClosable를 구현하면 사용 가능
    List<Character> readChars = new ArrayList<>();
    try (FileReader reader = new FileReader("hello")) {
      int character;
      while((character = reader.read()) != -1) {
        System.out.print((char) character);
        readChars.add((char) character);
      }
    } catch (IOException ignored) {}

    try (FileWriter writer = new FileWriter("output.txt", true)) { // true로 하면 덮어쓰기 가능
      for (Character character : readChars) {
        writer.write(character);
      }
    } catch (IOException ignored) {}
  }
  // java 7 이전
//  public static void main(String[] args) {
//    try {
//      // 절대경로와 상대경로 다 지원한다.
//      // 프로젝트 기준 최상위 폴더에 만들면 intellij에서 바로 사용 가능
//      // 절대경로: 해당 파일의 컴퓨터 위치
//      // 상대경로: 실행하고 있는 파일을 기준으로 한 위치
//      FileReader reader = new FileReader("hello"); // 어떤 파일인지가 값에 들어가야 함
//      int character;
//
//      // 여러 데이터를 모아서 문자열을 만들어주는 클래스
//      // 데이터가 얼마나 들어올지 모르는 상황에서 문자열을 만드는데 사용한다.
//      StringBuilder line = new StringBuilder();
//
//      // FileReader.read()는 한글자씩 읽는다.
//      // -1은 파일을 다 읽었다.
//      // reader.read(): 파일을 읽는다
//      while ((character = reader.read()) != -1 ) {
//        System.out.println((char) character);
//        line.append((char) character);
//      }
//
//      System.out.println(line.toString());
//
//      String newLine = line.toString();
//      String[] lines = newLine.split("\n");
//      for (String oneLine : lines) {
//        System.out.println(oneLine);
//      }
//      // 파일을 열면 부하가 걸리기 때문에 쓰고 잘 닫아줘야 한다.
//      reader.close();
//    } catch (IOException ignored) {
//      System.out.println("error");
//    }
//
//  }
}
// checkedException: 개발자가 무슨 짓을 해도 알아차리지 못하는 예외
