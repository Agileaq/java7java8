package java7;

public class NumericalContainsUnderscore {
	
	public static void main(String[] args) {
//		long debitCard = 1234_5678_9876_5432L;
//		/* This is to illustrate the difference between how the 
//		 * number looks internally, and how it needs to be formatted
//		for external display */
//		System.out.println("The card number is: " + debitCard);
//		System.out.print("The formatted card number is:");
//		printFormatted(debitCard);
//		
//		float minAmount = 5_000.00F;
//		float currentAmount = 5_250.00F;
//		float withdrawalAmount = 500.01F;
//		if ((currentAmount - withdrawalAmount) < minAmount) {
//			System.out.println("Minimum amount limit exceeded " + minAmount);
//		}
		
		//testGramma();
		hexadecimalExample();
	}

	private static void printFormatted(long cardNumber) {
		String formattedNumber = Long.toString(cardNumber);
		for (int i = 0; i < formattedNumber.length(); i++) {
			if (i % 4 == 0) {
				System.out.print(" ");
			}
			System.out.print(formattedNumber.charAt(i));
		}
		System.out.println();
	}
	
	private static void testGramma() {
		int a = 1_________________________2;
		System.out.println(a);
		
		//long productKey = _12345_67890_09876_54321L;
		//float pi = 3._14_15F;
		//long licenseNumber = 123_456_789_L;
	}
	
	private static void hexadecimalExample() {
		//Every separated part could have its special meaning, so that we can read easily
		int commandInHex = 0xE_23D5_8C_7;
		int commandInBinary = 0b1110_0010_0011_1101_0101_1000_1100_0111;
		System.out.println(Integer.toHexString(commandInHex));
		System.out.println(Integer.toBinaryString(commandInBinary));
	}
}
