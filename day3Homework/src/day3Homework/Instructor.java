package day3Homework;

public class Instructor extends User{
	private int userId;
	private String firstName;
	private String lastName;
	
	public Instructor(int id, String password, String eMail, String adress, int userId, String firstName,
			String lastName) {
		super(id, password, eMail, adress);
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Instructor() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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
