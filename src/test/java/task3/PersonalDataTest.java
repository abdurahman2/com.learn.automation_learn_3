package task3;

import lambdastreams.task3.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PersonalDataTest {

    @Test
    void adultPersons() {
        List<String> right = Arrays.asList("PETER", "PAUL", "ARNOLD", "AARON");

        List<Person> expectedList = new ArrayList<>();
        expectedList.add(new Person("Peter", "Patterson", 21));
        expectedList.add(new Person("Paul", "Walker", 31));
        expectedList.add(new Person("Steve", "Runner", 17));
        expectedList.add(new Person("Arnold", "", -1));
        expectedList.add(new Person(" ", "Stevenson", 19));
        expectedList.add(new Person("   ", "Stevenson", 19));
        expectedList.add(new Person("      ", "Stevenson", 19));
        expectedList.add(new Person(" Arnold", "Stevenson", 19));
        expectedList.add(null);
        expectedList.add(new Person("Aaron", "Bernice", 18));

        System.out.println(Person.createListOfUniqueNamesForAdults(expectedList));
        Assertions.assertEquals(right, Person.createListOfUniqueNamesForAdults(expectedList),
                "The list with adults does not match");
    }
}
