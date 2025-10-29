package basicprac;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

//		Student ram = null;
//		Student laxman = null;

		Student student[] = new Student[10];

		Scanner scr = new Scanner(System.in);
		int studentCounter = 0;

		student[studentCounter] = new Student("Ram", 50, 50, 50, "ram@gmail.com", "ram", "MONITOR");
		studentCounter++;

		while (true) {
			System.out.println("1 For Login\n2 For Exit");
			int mainChoice = scr.nextInt();

			switch (mainChoice) {
			case 1:
				System.out.println("Login");
				System.out.println("Enter Email and Password for Login : ");
				String loginEmail = scr.next();
				String loginPassword = scr.next();
				boolean found = false;

				login: for (int i = 0; i < studentCounter; i++) {
					if (student[i].getEmail().equalsIgnoreCase(loginEmail)
							&& student[i].getPassword().equals(loginPassword)) {
						found = true;
						//
						if (student[i].getRole().equals("MONITOR")) {
							// monitor menu

							while (true) {

								System.out.println("1 For Add  Student");
								System.out.println("2 For List Student");
								System.out.println("3 For Logout");
								System.out.println("Enter choice");

								int choice = scr.nextInt();

								switch (choice) {
								case 1:
									// add student
									int oldCounter = studentCounter;	
									System.out.println("Enter name and marks of three subjects");
									String name = scr.next();
									int maths = scr.nextInt();
									int sci = scr.nextInt();
									int eng = scr.nextInt();
									System.out.println("Enter Email - Password and Role ");
									String email = scr.next();
									String password = scr.next();
									String role = scr.next();

									student[studentCounter] = new Student(name, maths, sci, eng, email, password, role);
									studentCounter++;// 1

									assert(studentCounter == oldCounter+1);
									break;
								case 2:
									// list student
									for (i = 0; i < studentCounter; i++) {
										student[i].displayStudentData();
									}
									break;
								case 3:
									break login;

								default:
									System.out.println("Enter Valid Choice...");
									break;
								}// switch
							} // while
						} // if --monitor
						else {

							while (true) {
								System.out.println("1 For List Student");
								System.out.println("2 For Logout");
								System.out.println("Enter choice");

								int choice = scr.nextInt();

								switch (choice) {
								case 1:
									// list student
									for (i = 0; i < studentCounter; i++) {
										student[i].displayStudentData();
									}
									break;
								case 2:
									break login;

								default:
									System.out.println("Enter Valid Choice...");
									break;
								}// switch - normal student
							} // while - normal
						} // else monitor
					} // main if email password
				} // for loop for login

				if (found == false) {
					System.out.println("Invalid Credentials.....");
				}
				break;
			case 2:
				System.out.println("Thank you for using our service!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}

		} // while

	}// main

}// StudentApp

class Student {

	private String name;
	private int maths, sci, eng;
	private int obtainedMarks;
	private int maxMark;
	private int minMark;

	private String email;
	private String password;
	private String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public int getMaxMark() {
		return maxMark;
	}

	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}

	public int getMinMark() {
		return minMark;
	}

	public void setMinMark(int minMark) {
		this.minMark = minMark;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Student() {
		//

	}

	Student(String name, int maths, int sci, int eng, String email, String password, String role) {
		this.name = name;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;

		this.email = email;
		this.password = password;
		this.role = role;

		this.calculateResult();
	}

	void calculateResult() {
		// max
		// min
		// obtained

		if (this.maths > this.sci && this.maths > this.eng) {
			this.maxMark = this.maths;
		} else if (this.eng > this.sci && this.eng > this.maths) {
			this.maxMark = this.eng;
		} else {
			this.maxMark = this.sci;
		}

		if (this.maths < this.sci && this.maths < this.eng) {
			this.minMark = this.maths;
		} else if (this.eng < this.sci && this.eng < this.maths) {
			this.minMark = this.eng;
		} else {
			this.minMark = this.sci;
		}

		this.obtainedMarks = this.maths + this.sci + this.eng;

	}

	void displayStudentData() {
		System.out.printf("\n%-10s %3d %3d %3d", name, maths, sci, eng);

	}

}