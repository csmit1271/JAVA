package iod;

import java.io.FileWriter;
import java.io.IOException;

public class Customer {

	String customerName;
	String contactNum;
	String city;
	String email;
	String password;
	
	public static void main(String[] args) throws IOException {

		Customer c1 = new Customer();
		c1.customerName = "jack";
		c1.contactNum = "12345";
		c1.city = "Ahmedabad";
		c1.email = "jack@bsnl.com";
		c1.password = "secret";
		
		//c1 c2 c3 c4 c5 => 25 write 
		//what if we will store entire object into file? 
		

		FileWriter fw = new FileWriter("customer.txt");
		fw.write(c1.customerName + ",");
		fw.write(c1.contactNum + ",");
		fw.write(c1.email + ",");
		fw.write(c1.password + ",");
		fw.write(c1.city + "\n");

		fw.close();

		System.out.println("Done");
	}

}
