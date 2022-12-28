package com.javalec.ifelseEx;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> student = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StudentManager studentManager = new StudentManager();
       
       studentManager.addStudent("김범준", 25, 202018307, "경제학과", "남");
       studentManager.addStudent("윤현중", 25, 201837020, "IT콘텐츠학과", "남");
       studentManager.addStudent("김소은", 22, 202018326, "경제학과", "여");
       studentManager.addStudent("홍은지", 23, 201930726, "철학과", "여");
       studentManager.addStudent("박현아", 24, 201827326, "국제관계학과", "여");
       studentManager.addStudent("김무영", 24, 201837022, "IT콘텐츠학과", "남");
       studentManager.addStudent("이승준", 23, 201937018, "IT콘텐츠학과", "남");
       studentManager.addStudent("김이경", 26, 201723412, "문예창작학과", "여");
       studentManager.addStudent("안준호", 29, 201302036, "한국사학과", "남");
       studentManager.addStudent("임영규", 20, 202218316, "경제학과", "남");
       studentManager.addStudent("배정현", 24, 201802012, "한국사학과", "남");
       studentManager.addStudent("한태규", 24, 201802008, "한국사학과", "남");
       studentManager.addStudent("강효석", 29, 201302016, "한국사학과", "남");
       studentManager.addStudent("유환철", 25, 201713317, "국제경제학과", "남");
       studentManager.addStudent("박정웅", 29, 201330706, "철학과", "남");
       studentManager.addStudent("안도연", 25, 201830702, "철학과", "여");
       studentManager.addStudent("한지승", 24, 201836021, "중국문화컨텐츠학과", "남");
       studentManager.addStudent("이하연", 23, 202023416, "문예창작학과", "여");
       
       int x = 0;
       
       for(x=0;x<18;x++)
       {
    	   System.out.println(studentManager.student.get(x).getName());
           System.out.println(studentManager.student.get(x).getAge());
           System.out.println(studentManager.student.get(x).getStudentnum());
           System.out.println(studentManager.student.get(x).getMajor());
           System.out.println(studentManager.student.get(x).getSex() + "\n");
       }
       
       
       
       
       
	}
 
	private void addStudent(String name, int age, int studentnum, String major, String sex)
	{
		student.add(new Student(name, age, studentnum, major, sex));
		
	}
}
