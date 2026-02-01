package coreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5, 2, 8, 1, 9);
        System.out.println("After sorting result is ");
        List<Integer> res = num.stream().sorted().toList();
        //Collections.sort(num);
        System.out.println(res);

        List<Integer> res1 = num.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).toList();
        //num.stream().sorted(Comparator.reverseOrder())
        System.out.println(res1);

        String str="ram";

        Integer a=10;
        System.out.println(a.intValue());
        int [] a1={1,2,3,4,5};

        List<Integer> collect = Arrays.stream(a1).boxed().collect(Collectors.toList());

        Character [] ch1={'a','b','c'};
        char [] ch2={'a','b','c'};
        //List<Character> l1 = Arrays.stream(ch).toList();

        String str1="ramkumar";

        char[] chr = str1.toCharArray();

        for (int i=0;i<=str1.length();i++){



    }


    }
}
