package Client;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class EventManagerClient {

	private static final Logger logger = Logger.getLogger(EventManagerClient.class.getName());

	public static HashMap<String, String> login_info = new HashMap<String, String>();

	public static void main(String args[]) throws Exception {

		System.out.println("Enter your respective ID ");
		Scanner input = new Scanner(System.in);
		String manager_ID = input.next();

		System.out.println("Select an action ");
		System.out.println("1. Book a event for customer ");
		System.out.println("2. Get Booking Schedule of a customer ");
		System.out.println("3. Cancel an event for a customer ");
		System.out.println("4. Add an event ");
		System.out.println("5. Remove a event ");
		System.out.println("6. List event availabilities ");

		int option = input.nextInt();
		switch (option) {
		case 1:

		case 2:

		case 3:

		case 4:

		case 5:

		case 6:

		default:
			System.out.println("Invalid input .Please enter the choice ");
		}
	}
}
