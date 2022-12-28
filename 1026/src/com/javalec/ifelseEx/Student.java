package com.javalec.ifelseEx;

public class Student {
	private String name;
	private int age;
	private int studentnum;
	private String major;
	private String sex;

	public Student(String name, int age, int studentnum, String major, String sex)
	{
		this.name = name;
		this.age = age;
		this.studentnum = studentnum;
		this.major = major;
		this.sex = sex;
	}
    public void UpdateInfo(int i, String info)
    {
    	switch(i)
    	{
    	case 1: setName(info);
    	    break;
    	case 2: setAge(Integer.parseInt(info));
    	    break;
    	case 3: setStudentnum(Integer.parseInt(info));
    	    break;
    	case 4: setMajor(info);
    	    break;
    	case 5: setSex(info);
    	    break;
    	
    	}
    	
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}


