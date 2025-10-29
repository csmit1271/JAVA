package collectiond;

import java.util.ArrayList;

public class ArrayListUserDemo {

	public static void main(String[] args) {

		User user = new User();
		user.setFirstName("ram");
		user.setLastName("patel");
		
		
		User user1 = new User();
		user1.setFirstName("laxman");
		user1.setLastName("patel");
		
		
		ArrayList<User> list = new ArrayList<User>();
		
		list.add(user);
		list.add(user1);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getFirstName());
		}
		
		
		System.out.println("forEach");
		
		for(User x:list) {
			System.out.println(x.getFirstName());
		}
		

	}
}

class User {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}