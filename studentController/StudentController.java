package com.studentController;

//import java.util.ArrayList;
import java.util.List;

import com.studentService.StudentService;

import StudentEntity.Student;

public class StudentController {
	StudentService service;
	
	public List<Student> showAllStudentsDetails(){
		service = new StudentService();
		List<Student> db = service.showAllStudents();
		
		return db;
	}
	
	public Student showStudentByTheirRollNo(int roll) {
		service = new StudentService();
		Student data = service.showStudentByRollNo(roll);
		
		return data;
	}
	
	public Student showStudentByTheirFirstLetterOfName(char ch) {
		service = new StudentService();
		Student data = service.showStudentByFirstLetter(ch);
		
		return data;
		
	}
	
	public List<Student> showStudentsByAscendingOrderOfRollNo(){
		service = new StudentService();
		List<Student> db = service.sortAscending();
		return db;
	}
	public List<Student> showStudentsByDescendingOrderOfRollNo(){
		service = new StudentService();
		List<Student> db = service.sortDescending();
		return db;
	}
	
	public void countStudentAbove90() {
		service = new StudentService();
		service.countStudents();
	}
	
	public void StudentsWithSameMarks() {
		service = new StudentService();
		service.sameMarks();
	}
	
	public Student StudentWithHighestMarks() {
		service = new StudentService();
		
		Student s1 = service.highestMark();
		
		return s1;
	}
	
	public Student StudentWithLowestMarks() {
		service = new StudentService();
		
		Student s2 = service.lowestMark();
		
		return s2;
	}
}
