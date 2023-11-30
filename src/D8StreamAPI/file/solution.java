package D8StreamAPI.file;

import java.io.FileReader;
import java.io.IOException;

public class solution {
  public static void main(String[] args) {
    // finally에서 인식할 수 있도록 밖에 선언
    FileReader reader = null;
    try {
      // 절대경로, 상대경로 다 지원한다.
      // 프로젝트 기준 최상위 폴더에 만들면 intellij에서 바로 사용 가능
      reader = new FileReader("hello");
//            FileReader reader = new FileReader("src/d8/file/new_file");
      int character;

      // 여러 데이터를 모아서 문자열을 만들어주는 클래스
      StringBuilder line = new StringBuilder();

      // FileReader.read() 한글자씩 읽는다.
      // -1은 파일을 다 읽었다는 뜻
      while ((character = reader.read()) != -1) {
        System.out.println((char) character);
        line.append((char) character);
      }

      // 출력부는 필요한데로
      System.out.println(line.toString());

      String newLine = line.toString();
      String[] lines = newLine.split("\n");
      for (String oneLine : lines) {
        System.out.println(oneLine);
      }
    } catch (IOException ignored) {
      System.out.println("error");
    } finally {
      // 여는 단계에서 문제 생기면 null이다.
      if (reader != null) {
        try {
          // 닫는 과정에서도 문제가 생길 수 있다...
          reader.close();
        } catch (IOException e) {
          // OMG
        }
      }
    }
  }
}
