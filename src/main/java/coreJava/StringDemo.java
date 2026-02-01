package coreJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringDemo {

    public static void main(String[] args) {
        String word="ramkumar";

        String s = String.valueOf(word.charAt(3));
        System.out.println(s);

        //String word="ramkumar";
        List<String> chars = IntStream.range(0, word.length())
                .mapToObj(i -> String.valueOf(word.charAt(i)))
                .collect(Collectors.toList());

        System.out.println(chars); // [J, A, V, A]



    }
}
