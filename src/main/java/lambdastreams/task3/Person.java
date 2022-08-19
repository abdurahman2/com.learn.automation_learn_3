package lambdastreams.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public static List<String> createListOfUniqueNamesForAdults(List<Person> personList) {
        return personList.stream()
                .filter(person -> person != null && person.getAge() >= 18)
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .map(String::trim)
                .filter(name -> !name.trim().isEmpty())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
