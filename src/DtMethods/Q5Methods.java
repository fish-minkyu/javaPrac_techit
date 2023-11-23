package DtMethods;
//  int[]를 인자로 받아,
//  순서가 반대가 되어있는 배열을 반환하는 메서드를 작성하시오.
public class Q5Methods {

  public static int[] reverse(int[] nums) {
    int[] arr = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      arr[i] = nums[nums.length -1 - i];
    }

    return arr;
  }
}
