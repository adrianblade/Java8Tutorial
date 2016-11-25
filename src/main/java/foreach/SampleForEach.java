package foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Adrian on 25/11/2016.
 */
public class SampleForEach {
    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }


        items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });

        List<String> itemsList = new ArrayList<>();
        itemsList.add("A");
        itemsList.add("B");
        itemsList.add("C");
        itemsList.add("D");
        itemsList.add("E");

        for (String item : itemsList) {
            System.out.println(item);
        }

        //lambda
        //Output : A,B,C,D,E
        itemsList.forEach(item -> System.out.println(item));

        //Output : C
        itemsList.forEach(item -> {
            if ("C".equals(item)) {
                System.out.println(item);
            }
        });

        //method reference
        //Output : A,B,C,D,E
        itemsList.forEach(System.out::println);

        //Stream and filter
        //Output : B
        itemsList.stream()
                .filter(s -> s.contains("B"))
                .forEach(System.out::println);
    }
}
