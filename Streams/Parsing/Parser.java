import java.util.*;
import java.util.stream.*;

public class Parser {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        // filter by gender female
        List<Person> females = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .collect(Collectors.toList());
        // females.forEach(System.out::println);

        // filter by gender male
        List<Person> males = people.stream()
        .filter(person -> person.getGender().equals(Gender.MALE))
        .collect(Collectors.toList());
        // males.forEach(System.out::println);

        // filter by gender female and sort by age asc
        List<Person> sort = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .sorted(Comparator.comparing(Person::getAge))
        .collect(Collectors.toList());
        sort.forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
            new Person("Carah", 20, Gender.FEMALE),
            new Person("Arata", 19, Gender.MALE),
            new Person("Glen", 31, Gender.MALE),
            new Person("Rachel", 25, Gender.FEMALE),
            new Person("Wouter", 19, Gender.MALE),
            new Person("Matthew", 19, Gender.MALE),
            new Person("Naseemah", 19, Gender.FEMALE),
            new Person("That Bitch Keziah", 22, Gender.FEMALE),
            new Person("Rigardt", 23, Gender.MALE),
            new Person("Georgia", 24, Gender.FEMALE)
        );
      }
}