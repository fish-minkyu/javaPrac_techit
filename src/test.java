import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Q1.
//
//    String input = scanner.nextLine();
//
//    System.out.println(input);
//    System.out.println(input);
//    System.out.println(input);

    // Q2.
//    int num1 = scanner.nextInt();
//    int num2 = scanner.nextInt();
//
//    System.out.println(num2);
//    System.out.println(num1);

    //Q3.
//    System.out.println("  *   *");
//    System.out.println(" *** ***");
//    System.out.println("*********");
//    System.out.println("*********");
//    System.out.println("  *****");
//    System.out.println("\t*");

    // Q4.
//    String time = "오전";
//    int clock = 6;
//
//    System.out.println(String.format("%s %d시", time, clock));

    //Q5.
    // nextLine()이 아닌 next()를 써준 이유
    // : nextDouble()은 입력 버퍼에서 숫자를 읽고 개행 문자를 남겨둔다.
    // 하지만 nextLine()은 개행 문자를 만날 때까지 입력을 받기 때문에
    // score3를 입력하고 엔터를 입력하면 String name1 = scanner.nextLine()에
    // 공백문자가 들어가게 된다.
//    double score1 = scanner.nextDouble();
//    double score2 = scanner.nextDouble();
//    double score3 = scanner.nextDouble();
//
//    String name1 = scanner.next();
//    String name2 = scanner.next();
//    String name3 = scanner.next();
//
//    System.out.println(String.format("이름-<%s>, 학점-<%.1f>", name1, score1));
//    System.out.println(String.format("이름-<%s>, 학점-<%.1f>", name2, score2));
//    System.out.println(String.format("이름-<%s>, 학점-<%.1f>", name3, score3));
  }
}
