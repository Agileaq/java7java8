package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Arc on 4/5/2016.
 */
public class FilteringCollection {
    public static void main(String args[]) {
        List<String> strList = Arrays.asList("abc", "bcd", "defg", "jk");
        List<String> filtered = strList.stream().filter(x -> x.length()> 2)
                .collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n",
                strList, filtered);
    }
}
