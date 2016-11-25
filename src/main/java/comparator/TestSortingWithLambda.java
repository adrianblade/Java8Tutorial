package comparator;

import model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 25/11/2016.
 */
public class TestSortingWithLambda extends TestSortingWithoutLambda{

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        //lambda here!
        listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());

        //java 8 only, lambda also, to print the List
        listDevs.forEach((developer)->System.out.println(developer));
    }

}
