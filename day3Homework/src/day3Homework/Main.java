package day3Homework;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.seteMail("123@gmail.com");
		
		Student student = new Student();
		student.setFirstName("berke");
		
		Instructor ıns = new Instructor();
		ıns.setLastName("Şenel");
		
		UserManager usm = new UserManager();
		StudentManager stm = new StudentManager();
		InstructorManager ıms = new InstructorManager();
		
		usm.add(user);
		stm.delete(student);
		ıms.update(ıns);
		

	}

}
