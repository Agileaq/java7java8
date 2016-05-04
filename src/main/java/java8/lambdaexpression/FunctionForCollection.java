package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Arc on 4/5/2016.
 */
public class FunctionForCollection {
    public static void main(String args[]) {
// Convert String to Uppercase and join them using coma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
}
