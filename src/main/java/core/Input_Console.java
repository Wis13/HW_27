package core;
import java.io.Console;
public class Input_Console {
	public static void main(String[] args) {

		Console c = System.console();
		
		if (c == null) {System.err.println("Console not available"); System.exit(0);}
		// System.out.print("Enter your first name: ");
		String first_name = c.readLine("Enter your first name: ");
		String last_name = c.readLine("Enter your last name: ");
		System.out.println("Your full name is: " + first_name + " " + last_name);
		}

}
