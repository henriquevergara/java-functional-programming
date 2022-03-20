package imperative;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    List<Person> people = List.of(
        new Person("John", MALE),
        new Person("Maria", FEMALE),
        new Person("Aisha", FEMALE),
        new Person("Alex", MALE),
        new Person("Alice", FEMALE)
    );

    // IMPERATIVE approach
    List<Person> females = new ArrayList<>();

    for (Person p: people) {
      if (FEMALE.equals(p.gender)) {
        females.add(p);
      }
    }

    for (Person f: females
    ) {
      System.out.println(f.toString());
    }

    // DECLARATIVE approach
    people.stream()
        .filter(person -> FEMALE.equals(person.gender))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  enum Gender {
    MALE, FEMALE
  }

  static class Person {
    private final String name;
    private final Gender gender;

    public Person (String name, Gender gender) {
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
