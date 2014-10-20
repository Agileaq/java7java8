package java7;

@SuppressWarnings("all")
public class StringSwitchExample {
	private static boolean verbose = false;
	private static boolean logging = false;
	private static boolean displayHelp = false;
	
	public static void main(String args[]){
//		for (String argument : args) {
//			switch (argument) {
//				// two cases together means "or"
//				case "verbose":
//				case "v":
//				verbose = true;
//				break;
//				case "log":
//				logging = true;
//				break;
//				case "help":
//				displayHelp = true;
//				break;
//				default:
//				System.out.println("Illegal command line argument");
//			}
//		}

		//displayApplicationSettings();
		gramaNotes2(null);
	}
	private static void displayApplicationSettings() {
		System.out.println("Application Settings:");
		System.out.println("Verbose: " + verbose);
		System.out.println("Logging: " + logging);		
		System.out.println("Help: " + displayHelp);
	}
	
	public static final String a = "AAA";
	public static final String b = "AAA";
	
	private static void gramaNotes1(String var){
		String test = "test";
		// only can use string literals in "case" labels
		switch(var) {
			case a:
			System.out.println("Test!");
		}
	}
	
	private static void gramaNotes2(String var) {

		String test2 = var;
		//if test is null, then null pointer exception happens
		switch(test2) {
			//Each "case" label must have a valid non-null lable 
			//case null:
			default:
		}
	}
	
	private static void gramaNotes3(String var) {

		switch(var) {
			//no two labels may be identical
//			case b:
//			case a:
			default:
		}
	}

}