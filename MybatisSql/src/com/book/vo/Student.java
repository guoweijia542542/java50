package com.book.vo;

public class Student {

	private int	stu_id;
	private String sname;
	private Teacher teacher;
	private School school;
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", sname=" + sname + ", teacher=" + teacher + "]";
	}
	
	
}
