package java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConstructorTypeInference {
	public static void main(String args[]) {
		List<String> test = new ArrayList<>();
		
		//test.add(1);
		test.add("AAA");
		//test.add(0.1);
		//test.add(1L);
		
		List<Map<String, Integer>> li = new ArrayList();
		@SuppressWarnings("rawtypes")
		List test2 = new ArrayList();
		test2 = test;
		test2.add(1);
		test2.add("AAA");
		test2.add(0.1);
		test2.add(1L);
		
		System.out.println(test);
		System.out.println(test2);
	}
}
