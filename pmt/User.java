package pmt;

public class User {

	private String firstName;
	private String email;
	private String password;
	private String role;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public static User createUser(String firstName, String email, String password, String role) {
		User user = new User();
		user.setFirstName(firstName);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		return user;
	}

}
