package java7.safevar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapPollutionExample {
	@SafeVarargs
	// Not actually safe!
	static void merge(List<String>... stringLists) {
//		Object[] array = stringLists;
//		List<Integer> tmpList = Arrays.asList(42, 43);
//		array[0] = tmpList; // Semantically invalid, but compiles without
//							// warnings
//		String element = stringLists[0].get(0); // runtime ClassCastException
//		
		Thread t = new Thread(new Runnable(){
			public void run() {
				System.out.println("run");
			}	
		});
		t.start();
		
		Thread t2 = new Thread();
	}
//	@SafeVarargs
//	// Not actually safe!
//	static void merge(List<String> stringLists1, ) {
//		Object[] array = stringLists;
//		List<Integer> tmpList = Arrays.asList(42, 43);
//		array[0] = tmpList; // Semantically invalid, but compiles without
//							// warnings
//		String element = stringLists[0].get(0); // runtime ClassCastException
//	}
	
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		List<String> list2 = new ArrayList<>();
		list2.add("Four");
		list2.add("Five");
		list2.add("Six");
		merge(list1,list2);
	}
}
