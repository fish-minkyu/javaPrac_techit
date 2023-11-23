package DtMethods;

//

//

//

//

import java.util.Arrays;

public class H4Methods {
  //  H1
  //  미세먼지 수치를 입력받고,
  //  0 ~ 30 이면 "좋음"
  //  31 ~ 80 이면 "보통"
  //  80 ~ 150 이면 "나쁨"
  //  151 ~ 이면 "매우 나쁨"
  //  이라는 문자열을 반환하는 메서드를 작성하시오.
  public static String microdust(int dust) {
    if (dust <= 30) return "좋음";
    if (dust <= 80) return "보통";
    if (dust <= 150) return "나쁨";
    else return "매우 나쁨";
  }

  //  H2
  //  현재 오전 7시이다.
  //  정수 n을 인자로 받아서,
  //  n 시간 후 12시까지 표기된 시계에서
  //  시침이 어떤 숫자 위에 있는지를 반환하는 메서드를 작성하시오.
  //  단, 입력이 0 <= n <= 127 를 벗어나면 -1을 반환하시오.
  public static int clock(int time) {
    if (time < 0 || time >= 128) {
      return -1;
    } else {
      return (7 + time) - 12;
    }
  }

  //  H3
  //  사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와
  //  두개의 정수를 입력받아, 각 기호에 대응하는 연산의 결과를
  //  반환하는 메서드를 작성하시오.
  //  단, 정수 범위에서만 결과를 반환합니다.
  public static int cal(int a, char operator, int b) {
    int result = 0;
    switch (operator) {
      case '+':
        result = a + b;
        break;
      case '-':
        result = a - b;
        break;
      case '*':
        result = a * b;
        break;
      case '/':
        result = a / b;
        break;
    }

    return result;
  }

  //  H4
  //  int[]을 인자로 받아,
  //
  //  배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
  //  배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
  //  배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"
  //
  //  메서드를 각각 작성하시오.

  // 최댓값 위치 반환
  public static int maxWhere(int[] nums) {
    int max = 0;
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        index = i;
      }
    }

    return index;
  }

  // 최솟값 위치 반환
  public static int minWhere(int[] nums) {
    int min = 9999, index = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
        index = i;
      }
    }

    return index;
  }

  // 최댓값과 최솟갑의 차이를 반환
  public static int maxDiff(int[] nums) {
    int max = 0, min = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) max = nums[i];
      if (nums[i] < min) min = nums[i];
    }
    return max - min;
  }

  //  H5
  //  int[]을 두개 받아,
  //  두 배열이 합쳐진 배열을 반환하는 메서드를 작성하시오.
  public static int[] sumArr(int[] arr1, int[] arr2) {
    int length = arr1.length + arr2.length;

    int[] res = new int[length];

    for (int i = 0; i < length; i++) {
      if (i <= arr1.length -1) {
        res[i] = arr1[i];
      } else {
        res[i] = arr2[i - arr1.length];
      }
    }

    return res;
  }

  //  H6
  //  원반을 끼울 수 있는 탑 3개에,
  //  다양한 크기의 원반 n개가, 큰것이 아래쪽에 위치하도록
  //  하나의 탑에 끼워져 있다.
  //  이 원반은 옮길 수 있는데,
  //
  //  한번에 하나의 원반만을 옮길 수 있으며,
  //  작은 원반 위에 큰 원반이 잠시라도 올라가서는 안된다.
  //
  //  라는 조건을 지키면서 모든 원반을 한 탑에서 다른 탑으로 이동하는 문제를
  //  하노이의 탑이라 부른다.
  //  한 탑에서 원반을 하나 꺼내 다른 탑으로 옮긴 횟수를 센다고 했을 때,
  //  n개의 원반을 총 몇번 옮겨야 하는지를 구하는 메서드를 작성하시오.

  public static void main(String[] args) {
    // H1
    int dust = 91;
    System.out.println(microdust(dust));

    // H2
    int time = 6;
    System.out.println(clock(time));

    // H3
    System.out.println(cal(3, '+', 4));

    // H4
    int[] nums = {1 , 3, 5, 11, 9};
    System.out.println(maxWhere(nums)); // 3
    System.out.println(minWhere(nums)); // 0
    System.out.println(maxDiff(nums)); // 10

    // H5
    int[] arr1 = {0, 1, 2}, arr2 = {3, 4, 5};
    System.out.print(Arrays.toString(sumArr(arr1, arr2)));

  }
}
