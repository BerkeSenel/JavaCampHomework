package day3Homework;

public class User {
	private int id;
	private String password;
	private String eMail;
	private String adress;
	public User(int id, String password, String eMail, String adress) {
		this.id = id;
		this.password = password;
		this.eMail = eMail;
		this.adress = adress;
	}
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
