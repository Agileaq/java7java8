package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Arc on 4/5/2016.
 */
public class LambdaMapReduce {
    public static void main(String args[]) {
        mapTest();
        reduceTest();
    }

    private static void mapTest() {
        // applying 12% VAT on each purchase
        // Without lambda expressions:
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }

        // With Lambda expression:
        costBeforeTax.stream().map((cost) -> cost + .12*cost)
                .forEach(System.out::println);
    }

    private static void reduceTest() {
        // Applying 12% VAT on each purchase
        // Old way:
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = 0;
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            total = total + price;

        }
        System.out.println("Total : " + total);

        // New way:
        double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost)
                .reduce((sum, cost) -> sum + cost)
                .get();
        System.out.println("Total : " + bill);
    }
}
