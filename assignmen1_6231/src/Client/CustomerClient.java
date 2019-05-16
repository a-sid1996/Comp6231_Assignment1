package Client;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class CustomerClient {

	private static final Logger logger = Logger.getLogger(CustomerClient.class.getName());

	public static HashMap<String, String> login_info = new HashMap<String, String>();

	public static void main(String args[]) throws Exception {

		System.out.println("Enter your respective ID ");
		Scanner input = new Scanner(System.in);
		String manager_ID = input.next();

		System.out.println("Select an action ");
		System.out.println("1. Book a event ");
		System.out.println("2. Get your Booking Schedule ");
		System.out.println("3. Cancel an event ");

		int option = input.nextInt();
		switch (option) {
		case 1:

		case 2:

		case 3:

		default:
			System.out.println("Invalid input .Please enter the choice ");

		}

	}
}
