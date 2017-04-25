package studentData;

public class Student {
		private String studentID;
		private String firstName;
		private String lastName;
		private String email;
		private int age;
		private int[] grades;
		
		//Method to set each student's characteristics
		public Student(String studentID, String firstName, String lastName, String email, int age, int[] grades) {
			setStudentID(studentID);
			setFirstName(firstName);
			setLastName(lastName);
			setEmail(email);
			setAge(age);
			setGrades(grades);
		}
		
		//Sets output format
		public void print() {
			System.out.printf("%s\tFirst name: %s\tLast name: %s\tE-mail: %s\tAge: %d\tGrades: {%d, %d, %d}\n", getStudentID(), getFirstName(), getLastName(), getEmail(), getAge(), grades[0], grades[1], grades[2]);
		}
		
		public String getStudentID() {
			return studentID;
		}
		
		public void setStudentID(String studentID) {
			this.studentID = studentID;
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
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int[] getGrades() {
			return grades;
		}
		
		public void setGrades(int[] grades) {
			this.grades = grades;
		}
}
