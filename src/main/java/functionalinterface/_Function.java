package functionalinterface;

import java.util.function.Function;

public class _Function {

  static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

  static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

  static Function<Integer, Integer> incrementAndMutiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);

  static int increment(int number) {
    return number + 1;
  }

  public static void main(String[] args) {
    System.out.println(increment(0));

    System.out.println(incrementByOneFunction.apply(1));

    incrementByOneFunction.andThen(multiplyBy10).apply(1);

    System.out.println(incrementByOneFunction.andThen(multiplyBy10).apply(1));

    System.out.println(incrementAndMutiplyBy10.apply(1));
  }
}
