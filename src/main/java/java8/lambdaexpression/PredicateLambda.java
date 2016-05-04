package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Arc on 4/5/2016.
 */
public class PredicateLambda {
    public static void main(String args[]){
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str)->str.startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->str.length() > 4);

        System.out.println("Print language whose length is 4 and startsWithJ:");
        filter(languages);
    }

//    public static void filter(List<String> names, Predicate<String> condition) {
//        names.forEach(name -> {
//            if(condition.test(name)) {
//                System.out.println(name + " ");
//            }
//        });
//    }
    //Even better
    public static void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter((name) -> (condition.test(name))).
                forEach((name) -> {System.out.println(name + " ");});
    }

    public static void filter(List<String> names) {
    // We can even combine Predicate using and(), or() And xor() logical functions
    // for example to find names, which starts with J and four letters long, you
    // can pass combination of two Predicate
    Predicate<String> startsWithJ = (n) -> n.startsWith("J");
    Predicate<String> fourLetterLong = (n) -> n.length() == 4;

    names.stream()
            .filter(startsWithJ.and(fourLetterLong))
            .forEach((n) -> System.out.print("\nName, which starts with 'J' and four letter long is : " + n));
    }
}

