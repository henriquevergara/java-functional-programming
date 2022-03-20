package streams;


import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

  public static void main(String[] args) {
    List<Person> people = List.of(
        new Person("John", MALE),
        new Person("Maria", FEMALE),
        new Person("Aisha", FEMALE),
        new Person("Alex", MALE),
        new Person("Alice", FEMALE)
    );

    // Stream map List
    System.out.println("## LIST");
    people.stream()
        .map(person -> person.gender)
        .collect(Collectors.toList())
        .forEach(System.out::println);

    // Stream map SET
    System.out.println("## SET");
    people.stream()
        .map(person -> person.gender)
        .collect(Collectors.toSet())
        .forEach(System.out::println);
  }

  enum Gender {
    MALE, FEMALE
  }

  static class Person {

    private final String name;
    private final Gender gender;

    public Person(String name, Gender gender) {
      this.name = name;
      this.gender = gender;
    }

    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", gender=" + gender +
          '}';
    }
  }
}
