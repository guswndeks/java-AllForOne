package com.javalec.ifelseEx;

import java.util.ArrayList;

public class StudentExpel {
	ArrayList<Student> expelStudents;
	
	public StudentExpel()
	{
		expelStudents = new ArrayList<Student>();
	}
    public void addExpelStudent(String name, int age, int studentnum, String major, String sex )
    {
    	expelStudents.add(new Student(name, age, studentnum, major, sex));
    	System.out.println("자네는 F일세");
    }
}
