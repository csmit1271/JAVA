package pmt;

import java.util.Scanner;

public class PortfolioApp {

	public static void main(String[] args) {

		Stock stock[] = new Stock[10];
		int stockCounter = 0;
		User users[] = new User[10];
		int userCounter = 0;

		users[userCounter++] = User.createUser("ram", "ram@gmail.com", "ram", "ADMIN");

		Scanner scr = new Scanner(System.in);

		while (true) {
			System.out.println("0 For Signup\n1 for Login\n2 For Exit");
			System.out.println("Enter choice");

			int choice = scr.nextInt();

			switch (choice) {

			case 0:
				System.out.println("NEW USER REGISTRATION ");
				System.out.println("Enter FirstName Email and Password");
				String fn = scr.next();
				String em = scr.next();
				String pwd = scr.next();
				users[userCounter++] = User.createUser(fn, em, pwd, "USER");
				break;

			case 1:
				System.out.println("Enter email and password : ");
				String loginEmail = scr.next();
				String loginPasword = scr.next();
				boolean userLogin = false;
				// user ->
				userMenu: for (int i = 0; i < userCounter; i++) {
					if (loginEmail.equals(users[i].getEmail()) && loginPasword.equals(users[i].getPassword())) {
						// ith index is current user
						// user menu
						userLogin = true;

						if (users[i].getRole().equals("USER")) {

							while (true) {
								System.out.println("0 For Logout\n1 For Search Stock");
								System.out.println("Enter choice");
								int userChoice = scr.nextInt();

								switch (userChoice) {
								case 1:
									System.out.println("Enter stock name !! ");
									String sn = scr.next();
									boolean stockSearch = false;
									for (int k = 0; k < stockCounter; k++) {
										if (stock[k].getName().equalsIgnoreCase(sn)) {
											stock[k].display();
											stockSearch = true;
										}
									}
									if (stockSearch == false) {
										System.out.println("Sorry ! No stock found...");
									}
									break;
								case 0:
									break userMenu;

								default:
									break;
								}// switch user
							} // while user
						} // if user role is USER
						else {
							while (true) {
								System.out.println("1 Add Stock\n2 For List Stock\n3 For Logout");
								System.out.println("Enter choice");
								int subChoice = scr.nextInt();
								switch (subChoice) {
								case 1:
									System.out.println("Enter Stock name and current price");
									Stock s = new Stock();
									String sn = scr.next();
									float cp = scr.nextFloat();
									s.setName(sn);
									s.setCurrentPrice(cp);
									stock[stockCounter] = s;
									stockCounter++;
									break;
								case 2:
									// ?
									for (i = 0; i < stockCounter; i++) {
										stock[i].display();
									}

									break;
								case 3:
									break userMenu;

								default:
									break;
								}// switch inner
							} // while inner

						} // else admin role menu
					} // if user credentials -> true
				} // for credentials

				//
				if (userLogin == true) {
					System.out.println("Thank you for using our Service!!");
					break;
				} else {
					System.out.println("Invalid Credentials!!!");
				} // if else credentials

				break;
			case 2:
				System.exit(0);
			default:
				break;
			}// main switch
		} // main while
	}// main
}// class
