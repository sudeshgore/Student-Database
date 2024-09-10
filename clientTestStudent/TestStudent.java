package com.clientTestStudent;

//import java.util.ArrayList;
// ctrl + shift + O ---> imports required import statements;
import java.util.List;

import com.studentController.StudentController;

import StudentEntity.Student;

public class TestStudent {
	public static void main(String[] args) {
		StudentController cnt = new StudentController();
		
		List<Student> db = cnt.showAllStudentsDetails();
		
		// 1.Printing all students data.
		for (Student student : db) {
			System.out.println(student);
		}

		System.out.println("<----->");
		
		
		// 2.Printing student data by using their roll no.
		System.out.println(cnt.showStudentByTheirRollNo(7));
		
		System.out.println("<----->");
		
		
		// 3. Printing student data by their first letter of name
		System.out.println(cnt.showStudentByTheirFirstLetterOfName('S'));
	
		System.out.println("<----->");
		
		
		
		// 4. Printing students data who's marks are greater than 80;
		for (Student student : db) {
			if(student.getMarks() < 80 && student.getMarks() >= 60) {
				System.out.println(student);
			}
		}

		System.out.println("<----->");
		
		
		
		// 5. Sorting in ascending order to students by using their roll numbers
		List<Student> std_db = cnt.showStudentsByAscendingOrderOfRollNo();
		
		for (Student student : std_db) {
			System.out.println(student);
		}
		
		System.out.println("<----->");
		
		// 6. Sorting in Descending order to students by using their roll numbers
		List<Student> studentData = cnt.showStudentsByDescendingOrderOfRollNo();
		
		for (Student student : studentData) {
			System.out.println(student);
		}
		
		System.out.println("<----->");
		
		
		// 7. Students above 90 marks
		cnt.countStudentAbove90();
		
		System.out.println("<----->");
		
		
		// 8. Students with same marks
		cnt.StudentsWithSameMarks();
		
		System.out.println("<----->");
		
		
		// 9. Student who got highest marks
		Student std = cnt.StudentWithHighestMarks();
		System.out.println(std);
		
		System.out.println("<----->");
		
		
		// 10. Student who got lowest marks
		Student std1 = cnt.StudentWithLowestMarks();
		System.out.println(std1);
		
		System.out.println("<----->");
		
	}
}
