/* This project is a functional database that stores student information
 * including student names, student IDs, e-mail addresses, ages, and grades. 
 * The program also searches for and reveals any invalid e-mail addresses,
 * calculates students' average grades, and removes students when requested.
 */

package studentData;

import java.util.ArrayList;

public class Roster {

	private static ArrayList<Student> roster = new ArrayList<>();
	
	//Adds the students with info
	public static void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
		int[] grades = {grade1, grade2, grade3};
		Student student = new Student(studentID, firstName, lastName, email, age, grades);
		roster.add(student);
	}
	
	//Removes students when requested
	public static void remove(String studentID) {
		for (int i = 0; i < roster.size(); i++) {
			Student student = roster.get(i);
			if (student.getStudentID().equals(studentID)) {
				roster.remove(i);
				return;
			}
		}
		
		System.out.println("Student ID " + studentID + " has been removed.");
		System.out.println();
		print_all();
	}
	
	//Loops to print each student with their info
	public static void print_all() {
		for (int i = 0; i < roster.size(); i++) {
			Student student = roster.get(i);
			student.print();
		}
	}
	
	//Calculates grade averages and prints them
	public static void print_average_grade(String studentID) {
		for (int i = 0; i < roster.size(); i++) {
			Student student = roster.get(i);
			if (student.getStudentID().equals(studentID)) {
				double total = 0;
				int[] grades = student.getGrades();
						for (int y = 0; y < grades.length; y++) {
							total += grades[y];
						}
						double average = total / grades.length;
						System.out.printf("Student ID " + (i + 1) + " - Average Grade: %.1f\n", average);
						return;
			}
		}
		
		System.out.println("Student ID could not be found.");
	}
	
	//Reads through email addresses and prints invalid ones
	public static void print_invalid_emails() {
		System.out.println("\nINVALID E-MAILS:");
		for (int i = 0; i < roster.size(); i++) {
			Student student = roster.get(i);
			String email = student.getEmail();
			
			if (!email.contains("@")) {
				System.out.println(email);
			}
			else if (!email.contains(".")) {
				System.out.println(email);
			}
			else if (email.contains(" ")) {
				System.out.println(email);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Student info
		String[] students = {
				"1,John,Smith,John1989@gmail.com,20,88,79,59",
				"2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
				"3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
				"4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
				"5,Matt,Joslen,mattjoslen@gmail.com,23,92,95,98"};
		
		for (int i = 0; i < students.length; i++) {
			String[] part = students[i].split(",");
			String studentID = part[0];
			String firstName = part[1];
			String lastName = part[2];
			String email = part[3];
			int age = Integer.parseInt(part[4]);
			int grade1 = Integer.parseInt(part[5]);
			int grade2 = Integer.parseInt(part[6]);
			int grade3 = Integer.parseInt(part[7]);
			Roster.add(studentID, firstName, lastName, email, age, grade1, grade2, grade3);
		}

		//Calls methods
		print_all();
		print_invalid_emails();
		for(int i = 0; i < roster.size(); i++)
			print_average_grade(roster.get(i).getStudentID());
		System.out.println();
		remove("3");
		remove("3");

		}
	}