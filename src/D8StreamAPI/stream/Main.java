package D8StreamAPI.stream;

// 함수 스코프 안에는 변하지 않는 변수들만 사용할 수 있다.
// 즉, final만 붙은 변수들만 사용이 가능하다.
// 함수가 실행될 때 해당 변수에 접근할 수 있다는 걸 보장할 수 없다.
public class Main {
  public static void main(String[] args) {
    // 여기에 새로운 값을 할당하고 싶다면? 구현체를 만들어줘야 한다.
    // 1. 전통적인 방법, 구현체 작성 후 생성 후 전달
    NoArgRetFunction function = new NoArgRetFrunctionImpl();
    runFunction(function);

    // 2. 익명 내부 클래스로 일시적인 클래스 객체 전달
    // 1번만 사용할 경우 이렇게 사용
    NoArgRetFunction anClass = new NoArgRetFunction() {
      @Override
      public void noArgNoReturn() {
        System.out.println("Anonymous Inner Class");
      }
    };
    runFunction(anClass);

    // 3. 람다 표현식 (익명 함수)
    // 함수형 인터페이스는 어차피 구현할 메서드가 하나
    // 그러면 나머지 다 생략하고 그 메서드만 표시하자
    // (왼쪽: 매개변수) -> (오른쪽: 함수 코드)
    NoArgRetFunction lambda = () -> System.out.println("Lambda Expression"); // 변수에 함수를 할당
    runFunction(lambda);

    // 함수가 실행될 때 변수에 접근할 수 없고 final(= effectively final)만 붙은 변수만 접근할 수 있다.
    // 그 이유는 함수가 실행될 때 변수값을 예측할 수 없기 때문이다.
    // 함수에 값을 전달할 때, 데이터를 전달하지 않는 걸 전제로 하기 때문이다.
    // 함수의 기능이 예측이 불가해지기 때문이다.
    // 함수형 프로그래밍은 결과를 확실히 줘야하는데 input값이 예측이 불가해지면 결과도 예측이 불가해지기 때문에 제약조건을 걸어줬다.
    final int a = 10;
    int b = 20;
    NoArgRetFunction multilineLambda = () -> {
      System.out.println(a);
      // b = 10; // Error
      System.out.println("Multiline");
      System.out.println("Lambda");
    };
    // 세미콜론이 필요한 이유는?

    // public int run(String str);
    StrArgIntRetFunction lambdaParams = str -> str.length();
    lambdaParams = str -> {
      System.out.println("multiline");
      return str.length();
    }; // 중괄호는 함수의 데이터인데 이 데이터 표혐의 마무리를 표현해야 해서 ;이 붙는다.
       // 값을 할당할 때 ;을 붙인다.

    System.out.println(runFunction(lambdaParams));

    // 메서드 직접 참조
    // 함수형 인터페이스 형태의 동일한 메서드는
    // ::을 통해 직접 전달할 수 있다.
    runFunction(String::length);

  }

  public static void runFunction(NoArgRetFunction function) {
    function.noArgNoReturn();
  }

  public static int runFunction(StrArgIntRetFunction function) {
    return function.run("Hello World");
  }
}
