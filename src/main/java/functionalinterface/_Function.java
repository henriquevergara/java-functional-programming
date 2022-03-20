package functionalinterface;

import java.util.function.Function;

public class _Function {

  static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

  static int increment(int number) {
    return number + 1;
  }

  public static void main(String[] args) {
    System.out.println(increment(0));

    System.out.println(incrementByOneFunction.apply(1));
  }
}
