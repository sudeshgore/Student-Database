package com.studentService;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
import java.util.List;

import com.studentDao.StudentDao;

import StudentEntity.Student;

public class StudentService {
	StudentDao dao;
	
	public List<Student> showAllStudents(){
		
		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();
		return db;
	}
	
	public Student showStudentByRollNo(int roll_no) {
		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();
		Student temp = null;
		for (Student student : db) {
			if(student.getRoll()==roll_no) {
				temp = student;
				break;
			}
		}
		
		return temp;
	}
	
	public Student showStudentByFirstLetter(char ch) {
		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();
		Student temp = null;
		for (Student student : db) {
			if(student.getName().charAt(0)== ch) {
				temp = student;
				break;
			}
		}
		
		return temp;
	}
	
	public Student showStudentByName(String nm) {
		dao = new StudentDao();
		List<Student> db = dao.getAllStudent();
		Student temp = null;
		for (Student student : db) {
			if(student.getName() == nm) {
				temp = student;
				break;
			}
		}
		return temp;
	}
	public List<Student> sortAscending() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		List<Student> dataBase = new ArrayList<Student>(); 
		
		for(int i = 1; i <= db.size(); i++) {
			for (int j = 0; j < db.size(); j++) {
				if(db.get(j).getRoll() == i) {
					dataBase.add(db.get(j));
				}
			}
		}
		
		return dataBase;
	}
	
	public List<Student> sortDescending() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		List<Student> dataBase = new ArrayList<Student>(); 
		
		for(int i = db.size(); i >= 1 ; i--) {
			for (int j = 0; j < db.size(); j++) {
				if(db.get(j).getRoll() == i) {
					dataBase.add(db.get(j));
				}
			}
		}
		
		return dataBase;
	}
	
	public void countStudents() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		int count = 0;
		
		for (int i = 0; i < db.size(); i++) {
			if(db.get(i).getMarks() > 90) {
				count++;
				System.out.println(db.get(i));
			}
		}
		
		System.out.println("Number of students above 90: " + count);
	
	}
	
	public void sameMarks() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		for (int i = 0; i < db.size()-1; i++) {
			for (int j = i+1; j < db.size(); j++) {
				if(db.get(i).getMarks() == db.get(j).getMarks()) {
					System.out.println(db.get(i));
					System.out.println(db.get(j));
					break;
				}
			}
		}
	}
	
	public Student highestMark() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		int temp = db.get(0).getMarks(); // Used to store highest marks;
		int index = 0;   // stores index of student who got highest marks
		for (int i = 1; i < db.size(); i++) {
			if(db.get(i).getMarks() > temp) {
				temp = db.get(i).getMarks();
				index = i;
			}
		}
		return db.get(index);
	}
	
	public Student lowestMark() {
		dao = new StudentDao();
		
		List<Student> db = dao.getAllStudent();
		
		int temp = db.get(0).getMarks(); // Used to store lowest marks;
		int index = 0;   // stores index of student who got lowest marks
		for (int i = 1; i < db.size(); i++) {
			if(db.get(i).getMarks() < temp) {
				temp = db.get(i).getMarks();
				index = i;
			}
		}
		return db.get(index);
	}
	
	
}
