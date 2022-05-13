package java8assignment;

public class Customer {
	public int userId;
	public String emailId;
	public String password;
	public String firstName;
	public String lastName;
	public String city;
	public String gender;
	public String phoneNumber;
	public Customer(int userId, String emailId, String password, String firstName, String lastName, String city,
			String gender, String phoneNumber) {
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", emailId=" + emailId + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", city=" + city + ", gender=" + gender + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}
