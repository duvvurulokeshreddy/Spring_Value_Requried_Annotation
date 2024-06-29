package com.jsp.spring.Spring.loadingProperties;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.studentName}")
	private String studentName;
	@Value("${student.hobby}")
	private String hobby;
	@Value("${student.intestedCourse}")
	private String intestedCourse;
	
	
//	public String getStudentName() {
//		return studentName;
//	}
//	@Value("${student.studentName}")
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//		System.out.println("The setter method called");
//	}
//	public String getHobby() {
//		return hobby;
//	}
//	@Value("${student.hobby}")
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//		System.out.println("Hobby is called");
//	}
//	public String getIntestedCourse() {
//		return intestedCourse;
//	}
//	@Required
//	@Value("${student.intestedCourse}")
//	public void setIntestedCourse(String intestedCourse) {
//		this.intestedCourse = intestedCourse;
//		System.out.println("InstestedCourse are called");
//	}
	
	public void displayStudentInfo() {
		System.out.println("StudentName : "+studentName);
		System.out.println("Student Intested course "+intestedCourse);
		System.out.println("Student hobby "+hobby);
	}
}
