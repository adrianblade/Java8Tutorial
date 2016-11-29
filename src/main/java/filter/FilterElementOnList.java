package filter;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Adrian on 29/11/2016.
 */
public class FilterElementOnList {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "node", "mkyong");
        List<String> result = getFilterOutput(lines, "mkyong");
        for (String temp : result) {
            System.out.println(temp);	//output : spring node
        }



        getStringFromList(Arrays.asList("spring", "node", "mkyong")).forEach(System.out::println);			//output : spring node

        List<Person> persons = Arrays.asList(new Person("mkyong"),
                new Person("michael"), new Person("lawrence"));

        Person result2 = getStudentByName(persons, "michael");


    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"mkyong".equals(line)) {
                result.add(line);
            }
        }
        return result;
    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
    private static List<String> getStringFromList(List<String> lines) {

        return  lines.stream() 			//convert list to stream
                .filter(line -> !"mkyong". equals (line))	//filters the line, equals to "mkyong"
                .collect(Collectors.toList());
    }

    private static Person getPersonFromPersonList(List<Person> lines) {

        return  lines.stream()				   // Convert to steam
                .filter(x -> "michael".equals(x.getName()))	// we want "michael" only
                .findAny()									// If 'findAny' then return found
                .orElse(null);
    }

    private static Person searchPersonFromPersonList() {

        List<Person> persons = Arrays.asList(new Person("mkyong", 20),
                new Person("michael", 21), new Person("lawrence", 23));

        return persons.stream()
                .filter((x) -> "michael".equals(x.getName()) && 21==x.getAge())
                .findAny()
                .orElse(null);

        //or like this
        /*Person result = persons.stream()
                .filter(x -> {
                    if("michael".equals(x.getName()) && 21==x.getAge()){
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);*/
    }

    private static String searchNamePersonFromPersonList() {

        List<Person> persons = Arrays.asList(new Person("mkyong", 20),
                new Person("michael", 21), new Person("lawrence", 23));

        return persons.stream()
                .filter(x -> "michael".equals(x.getName()))
                .map(Person::getName)						//convert stream to String
                .findAny()
                .orElse("");
    }
}
