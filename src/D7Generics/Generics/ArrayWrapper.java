package D7Generics.Generics;

import java.io.Serializable;

// ArrayWrapper 클래스를 만들 때, T가 있어야 만들 수 있다.
// <>, 다이아몬드 operator
// <T>를 해주면 T를 타입처럼 쓸 수 있다.
// extends Comparable<T>: bounded type parameter, 제한된 타입 파라미터
// 클래스는 상속이 1개만 가능하므로 제일 앞에 쓴다.
public class ArrayWrapper<T extends Number & Comparable<T> & Serializable> { // T가 타입 매개변수, type parameter라고 불린다.
  private T[] array;

  public ArrayWrapper(T[] array) {
    if (array == null) throw new IllegalArgumentException("null array provided");
    this.array = array;
  }

  public int length() {
    return this.array.length;
  }

  public boolean contains(T target) {
    for (T item : this.array) {
      // T는 원시 타입은 들어갈 수 없다.
      // 그래서 항상 null값이 들어올 위험이 있다는 걸 알아야한다.
      if(item == null) continue;
      if (item.equals((target))) return true;
    }

    return false;
  }

  public T max() {
    T max = this. array[0];
    for (T item : this.array) {
      if (item == null) continue;
      if (max == null) max = item;
      else if (item.compareTo(max) > 0) max = item;
    }
    return max;
  }
}
