package java7.safevar;

import java.util.ArrayList;

public class SafeVargExample {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(new Integer(1));
		a1.add(2);
		ArrayList<Float> a2 = new ArrayList<>();
		a2.add(new Float(3.0));
		a2.add(new Float(4.0));
		displayElements(a1, a2, 12);
	}

	@SafeVarargs
	//heap pollution
	public static <T> void displayElements(T... array) {
		for (T element : array) {
			System.out.println(element.getClass().getName() + ": " + element);
		}
	}
}
