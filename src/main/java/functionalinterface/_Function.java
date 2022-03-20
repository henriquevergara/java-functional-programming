package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

  static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

  static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

  static Function<Integer, Integer> incrementAndMultiplyBy10 = incrementByOneFunction
      .andThen(multiplyBy10);

  static BiFunction<Integer, Integer, Integer> incrementAndMultiplyByArguments =
      (number, numberTwo) -> (number + 1) * numberTwo;

  static int increment(int number) {
    return number + 1;
  }

  static int incrementByOneAndMultiply(int number, int numberTwo) {
    return (number + 1) * numberTwo;
  }

  public static void main(String[] args) {
    System.out.println(increment(0));

    // FUNCTION receives 1 argument and return 1 output
    System.out.println(incrementByOneFunction.apply(1));

    incrementByOneFunction.andThen(multiplyBy10).apply(1);

    System.out.println(incrementByOneFunction.andThen(multiplyBy10).apply(1));

    System.out.println(incrementAndMultiplyBy10.apply(1));

    // BIFUNCTION receives 2 arguments and return 1 output
    System.out.println(incrementByOneAndMultiply(1, 100));

    System.out.println(incrementAndMultiplyByArguments.apply(1, 100));
  }
}
