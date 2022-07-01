/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: Asks user various questions to determine the problem of 
 * their wifi connection
 * Due: 9/24/2021
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jonas da Silva
*/

import java.util.Scanner;
public class wifiDiagnostics {

	public wifiDiagnostics() {
		
	}

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String yes = new String("yes");
		String no = new String("no");
		boolean working = false;
		String fix;
		while(working == false) {
			System.out.println("Reboot the computer and try to connect."); // Method 1
			System.out.println("Are you able to connect to the internet? (Yes or no)");
			fix = keyboard.nextLine();
			if( !fix.equalsIgnoreCase(yes) && !fix.equalsIgnoreCase(no)){ // Verification
				System.out.println("Invalid input.");
				System.out.println("Reboot the computer and try to connect.");
				System.out.println("Are you able to connect to the internet? (Yes or no)");
				fix = keyboard.nextLine();
			}
			if(fix.equalsIgnoreCase(yes)) { //End loop if users internet works
				System.out.println("Rebooting your computer seemed to work.");
				break;
			}
			System.out.println("Reboot the router and try to connect."); // Method 2
			System.out.println("Are you able to connect to the internet? (Yes or no)");
			fix = keyboard.nextLine();
			if( !fix.equalsIgnoreCase(yes) && !fix.equalsIgnoreCase(no)){
				System.out.println("Invalid input.");
				System.out.println("Reebot the router and try to connect.");
				System.out.println("Are you able to connect to the internet? (Yes or no)");
				fix = keyboard.nextLine();
			}
			if(fix.equalsIgnoreCase(yes)) {
				System.out.println("Reeboting the router seemed to work.");
				break;
			}
			System.out.println("Make sure the cables connecting to the" // Method 3
					+ " router are firmly plugged in and power is getting"
					+ " to the router");
			System.out.println("Are you able to connect to the internet? (Yes or no)");
			fix = keyboard.nextLine();
			if( !fix.equalsIgnoreCase(yes) && !fix.equalsIgnoreCase(no)){
				System.out.println("Invalid input.");
				System.out.println("Make sure the cables connecting to the"
						+ " router are firmly plugged in and power is getting"
						+ " to the router");
				System.out.println("Are you able to connect to the internet? (Yes or no)");
				fix = keyboard.nextLine();
			}
			if(fix.equalsIgnoreCase(yes)) {
				System.out.println("Plugging in the cables seemed to work.");
				break;
			}
			System.out.println("Move the computer closer to the router and try to connect."); // Method 4
			System.out.println("Are you able to connect to the internet? (Yes or no)");
			fix = keyboard.nextLine();
			if( !fix.equalsIgnoreCase(yes) && !fix.equalsIgnoreCase(no)){
				System.out.println("Invalid input.");
				System.out.println("Move the computer closer to the router and try to connect.");
				System.out.println("Are you able to connect to the internet? (Yes or no)");
				fix = keyboard.nextLine();
			}
			if(fix.equalsIgnoreCase(yes)) {
				System.out.println("Moving the computer closer to the router seemed to work.");
				break;
			}
			System.out.println("Contact your ISP");
			working = true;
		}
		System.out.print("Wi-Fi diagnostics complete");

	}

}
