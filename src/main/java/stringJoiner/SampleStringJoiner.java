package stringJoiner;

import model.Game;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Created by Adrian on 25/11/2016.
 */
public class SampleStringJoiner {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String result = sj.toString(); //aaa,bbb,ccc

        StringJoiner sj2 = new StringJoiner("/", "prefix-", "-suffix");
        sj2.add("2016");
        sj2.add("02");
        sj2.add("26");

        String result2 = sj2.toString(); //prefix-2016/02/26-suffix

        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        //java, python, nodejs, ruby
        String result3 = String.join(", ", list);

        //java | python | nodejs | ruby
        String result4 = list.stream().map(x -> x).collect(Collectors.joining(" | "));

        List<Game> list2 = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result5 = list2.stream().map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}"));

    }
}
