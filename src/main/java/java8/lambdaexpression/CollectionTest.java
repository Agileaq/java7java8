package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Arc on 4/5/2016.
 */
public class CollectionTest {

    public static void main(String args[]) {
        //Prior Java 8 :
        List<String> features = new ArrayList<>();
        features.addAll(Arrays.asList("Lambdas", "Default Method",
                "Stream API", "Date and Time API"));
        for (String feature : features) {
            System.out.println(feature);
        }

        //In Java 8:
        features.forEach(n -> {
            System.out.println(n);
            System.out.println(n);
        });
        features.removeIf(n -> "Stream API".equals(n));
        // Even better use Method reference feature of Java 8
        // method reference is denoted by :: (double colon) operator
        // looks similar to score resolution operator of C++
        features.forEach(System.out::println);
    }

}
