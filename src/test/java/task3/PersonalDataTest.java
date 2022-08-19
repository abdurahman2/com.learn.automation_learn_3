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
        List<String> expectedList = Arrays.asList("PETER", "PAUL", "ARNOLD", "AARON");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bernice", 18));

        System.out.println(Person.createListOfUniqueNamesForAdults(personList));
        Assertions.assertEquals(expectedList , Person.createListOfUniqueNamesForAdults(personList),
                "The list with adults does not match");
    }
}
