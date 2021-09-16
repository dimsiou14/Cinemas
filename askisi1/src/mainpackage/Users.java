package mainpackage;

import java.util.Scanner;

public class Users {

	
		String username;
		String name;
		String surname;
		String type;
		long password;
		int usersCounter;
		
		
 
	public static void login(String username , long password ) {
		
		System.out.println("You have successedfully just logged in !");
		
	}
	
	public static void logout(String username , long password ) {
		
		System.out.println("You have successedfully just logged out !");
		
	}
	
	public  void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your username");
		username = sc.nextLine();
		System.out.println("Insert your name");
		name = sc.nextLine();
		System.out.println("Insert your surname");
		surname = sc.nextLine();
		System.out.println("Insert your type");
		
		System.out.println("Insert your password");
		password = sc.nextLong();
		sc.close();
	}

}
