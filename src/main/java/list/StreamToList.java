package list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Adrian on 29/11/2016.
 */
public class StreamToList {
    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node");

        //Convert a Stream to List
        List<String> result = language.collect(Collectors.toList());

        result.forEach(System.out::println);

        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);

        List<Integer> result2 = number.filter(x -> x!= 3).collect(Collectors.toList());

        result2.forEach(x -> System.out.println(x));
    }
}
