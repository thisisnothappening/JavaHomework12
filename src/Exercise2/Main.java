package Exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
2. you have a list of Person :  Person(name, age, hair colour).
        2.1 extract the list of person names
        2.2 create a map from person's name to their age
        2.3 extract the persons that are older than a given age
        2.4 extract a map from person's hair colour to their name (String->List<String>)
        2.5 create a map from age to list of persons
*/
public class Main {

    public static void main(String[] args) {

        // 2.0
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Mircea", 15, "black"));
        personList.add(new Person("Marcel", 26, "blue"));
        personList.add(new Person("Marius", 33, "blonde"));
        personList.add(new Person("Cipri", 29, "black"));

        // 2.1
        System.out.println(personNames(personList));

        // 2.2
        System.out.println(mapNameToAge(personList));

        // 2.3
        System.out.println(peopleOlderThanAGivenAge(23, personList));

        // 2.4
        System.out.println(mapHairColorToName(personList));

        // 2.5
        System.out.println(mapAgeToPerson(personList));
    }

    // 2.1
    public static List<String> personNames(List<Person> list) {
        List<String> personNames = new ArrayList<>();
        for (Person person : list) {
            personNames.add(person.getName());
        }
        return personNames;
    }

    // 2.2
    public static Map<String, Integer> mapNameToAge(List<Person> list) {
        Map<String, Integer> mapNameToAge = new HashMap<>();
        for (Person person : list) {
            mapNameToAge.put(person.getName(), person.getAge());
        }
        return mapNameToAge;
    }

    // 2.3
    public static List<Person> peopleOlderThanAGivenAge(int age, List<Person> list) {
        List<Person> peopleOlderThanAGivenAge = new ArrayList<>();
        for (Person person : list) {
            if (person.getAge() > age) {
                peopleOlderThanAGivenAge.add(person);
            }
        }
        return peopleOlderThanAGivenAge;
    }

    // 2.4
    public static Map<String, List<String>> mapHairColorToName(List<Person> list) {
        Map<String, List<String>> mapHairColorToName = new HashMap<>();
        for (Person person : list) {
            List<String> nameList = mapHairColorToName.get(person.getHairColor());
            if (nameList == null) {
                nameList = new ArrayList<>();
                mapHairColorToName.put(person.getHairColor(), nameList);
            }
            nameList.add(person.getName());
        }
        return mapHairColorToName;
    }

    // 2.5
    public static Map<Integer, List<Person>> mapAgeToPerson(List<Person> list) {
        Map<Integer, List<Person>> mapAgeToPerson = new HashMap<>();
        for (Person person : list) {
            List<Person> namePersonList = mapAgeToPerson.get(person.getAge());
            if (namePersonList == null) {
                namePersonList = new ArrayList<>();
                mapAgeToPerson.put(person.getAge(), namePersonList);
            }
            namePersonList.add(person);
        }
        return mapAgeToPerson;
    }
}
