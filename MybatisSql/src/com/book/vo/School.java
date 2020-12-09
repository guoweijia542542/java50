package com.book.vo;

import java.util.List;

public class School {

	
	
	private int	teacher_id;
	private String schname;
	
	private List<Teacher> tea;
	
	
		@Override
	public String toString() {
		return "School [teacher_id=" + teacher_id + ", schname=" + schname + ", tea=" + tea + "]";
	}
		public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getSchname() {
		return schname;
	}
	public void setSchname(String schname) {
		this.schname = schname;
	}
	public List<Teacher> getTea() {
		return tea;
	}
	public void setTea(List<Teacher> tea) {
		this.tea = tea;
	}
	
	
		
	 
	
	
	
}
