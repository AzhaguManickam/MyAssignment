package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName(String name) {
	System.out.println("Student Name"+": "+name);
	}
public void studentDepartment(String Department) {
	System.out.println("Student Department"+": "+Department);
}
public void studentId(int Id) {
	System.out.println("StudentId"+" "+Id);
}
public static void main(String[] args) {
	Student std= new Student();
	std.collegeName("Bishop Heber College");
	std.collegeCode("BHC001");
	std.CollegeRank(4);
	std.depName("Department Of ComputerScience");
	std.studentName("Azhagu Manickam");
	std.studentDepartment("Computer Science");
	std.studentId(7777);
	
}
}
