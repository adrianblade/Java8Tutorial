package filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Adrian on 29/11/2016.
 */
public class FilterNull {
    public static void main(String[] args) {

        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        List<String> result = language.collect(Collectors.toList());

        result.forEach(System.out::println);

        Stream<String> language2 = Stream.of("java", "python", "node", null, "ruby", null, "php");

        //List<String> result = language2.collect(Collectors.toList());

        List<String> result2 = language2.filter(x -> x!=null).collect(Collectors.toList());

        result2.forEach(System.out::println);

    }
}
