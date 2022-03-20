package functionalinterface;

import java.util.function.Predicate;

public class _Predicates {

  static Predicate<String> isPhoneNumberValid = phoneNumber ->
    phoneNumber.startsWith("07") && phoneNumber.length() == 11;

  static Predicate<String> containsNumber3 = phoneNumber ->
      phoneNumber.contains("3");

  public static void main(String[] args) {

    String validPhoneNumber = "07000000030";
    String invalidPhoneNumber = "070000003";

    System.out.println(isPhoneNumberValid.test(validPhoneNumber));
    System.out.println(isPhoneNumberValid.test(invalidPhoneNumber));
    System.out.println(isPhoneNumberValid.and(containsNumber3).test(validPhoneNumber));
    System.out.println(isPhoneNumberValid.or(containsNumber3).test(invalidPhoneNumber));

  }
}
