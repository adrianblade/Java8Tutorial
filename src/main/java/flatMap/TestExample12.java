package flatMap;

/**
 * Created by Adrian on 25/11/2016.
 */
    import java.util.Arrays;
    import java.util.stream.Stream;

public class TestExample12 {

        public static void main(String[] args) {

            String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

            //Stream<String[]>
            Stream<String[]> temp = Arrays.stream(data);

            //Stream<String>, GOOD!
            Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

            Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

            stream.forEach(System.out::println);

		/*Stream<String> stream = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));*/

        }

    }
