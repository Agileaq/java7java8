package java7.catmultiex;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultipleExceptions {
	private static final Logger logger = Logger.getLogger("log.txt");

	public static void main(String[] args) {
		// 9, -1 , aa , 12 as test number
		System.out.print("Enter a number: ");
		try {
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			if (number < 0) {
				throw new InvalidParameter();
			}
			if (number > 10) {
				throw new AssertionError("Number was too big", new Throwable(
						"Throwable assertion message"));
			}
			System.out.println("The number is: " + number);
		} catch (InputMismatchException | InvalidParameter e) {
			logger.log(Level.INFO, "Invalid input, try again");
		}
	}
}