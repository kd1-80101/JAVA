package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class CompareStudents implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		int diff = -(arg0.getCity().compareTo(arg1.getCity()));
		if (diff == 0)
			diff = -(Double.compare(arg0.getMarks(), arg1.getMarks()));
		if (diff == 0)
			diff = arg0.getName().compareTo(arg1.getName());
		return diff;
	}

}

public class TesterMain {

	public static void main(String[] args) {

		Student[] student = new Student[10];
		student[0] = new Student(1, "prasann", "islampur", 560.25);
		student[1] = new Student(2, "akhil", "islampur", 560.25);
		student[2] = new Student(3, "prasann", "kolhapur", 320.25);
		student[3] = new Student(4, "akhil", "sangli", 220.25);
		student[4] = new Student(5, "suyash", "sangli", 120.25);
		student[5] = new Student(6, "suyash", "kolhapur", 220.25);
		student[6] = new Student(7, "akash", "islampur", 220.5);
		student[7] = new Student(8, "akash", "kolhapur", 270.25);
		student[8] = new Student(9, "pavan", "sangli", 320.25);
		student[9] = new Student(10, "pavan", "islampur", 560.25);

		CompareStudents compare = new CompareStudents();
		Arrays.sort(student, compare);
		System.out.println("AFTER SORTING :");
		for (Student student2 : student) {
			System.out.println(student2);
		}
	}

}
