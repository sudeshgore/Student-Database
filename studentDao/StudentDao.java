package com.studentDao;

import java.util.ArrayList;
import java.util.List;

import StudentEntity.Student;

public class StudentDao {
	public List<Student> getAllStudent() {
		List<Student> db = new ArrayList<Student>();
		
		
		db.add(new Student(9, "Jay", 88));
		db.add(new Student(6, "Veeru", 98));
		db.add(new Student(10, "Kaushal", 90));
		db.add(new Student(7, "Gabbar", 80));
		db.add(new Student(5, "Pratik", 70));
		db.add(new Student(1, "Rohit", 75));
		db.add(new Student(8, "Sudesh", 68));
		db.add(new Student(4, "Pratik2", 89));
		db.add(new Student(2, "Onkar", 99));
		db.add(new Student(3, "Ganesh", 100));
		
		return db;
	}
}
