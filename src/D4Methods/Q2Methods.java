package D4Methods;

//  String 배열을 인자로 받아 배열의 각 값을
//  한줄씩 출력하는 메서드 "printAll"를 작성하시오.
public class Q2Methods {

  public static void printAll(String[] arr) {
    // for문
//    for (int i = 0; i < arr.length; i++) {
//        System.out.println(arr[i]);
//    }

    //foreach문
    for (String arg: arr) {
      System.out.println(arg);
    }
  }

  public static void main(String[] args) {
    String[] arr = {"a", "b", "c"};

    printAll(arr);
    printAll(new String[]{"apple", "banana", "pear"});
  }
}
