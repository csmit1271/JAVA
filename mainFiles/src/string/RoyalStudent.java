package string;

public class RoyalStudent {

	String name;
	int age; 
	
	
	void modify() {
		age = age + 10;
		name = name.toUpperCase(); 
	}
	public static void main(String[] args) {
	
		
		RoyalStudent r = new RoyalStudent();
		
		r.age = 18;
		r.name = "sakira";
		
		System.out.println(r.age);//18
		System.out.println(r.name);//sakira 
		
		r.modify();
		
		System.out.println(r.age);//28
		System.out.println(r.name);//SAKIRA 
		
	}
}
