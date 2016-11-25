package comparator;

import model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adrian on 25/11/2016.
 */
public class TestSortingWithoutLambda {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

    }

    protected static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("adri", new BigDecimal("70000"), 33));
        result.add(new Developer("adri2", new BigDecimal("80000"), 20));
        result.add(new Developer("adri3", new BigDecimal("100000"), 10));
        result.add(new Developer("adri4", new BigDecimal("170000"), 55));

        return result;

    }

}
