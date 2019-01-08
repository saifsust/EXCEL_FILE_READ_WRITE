package org.models;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int registrationNo;
	private String fullName;
	private double marks;
	private List<String> all = null;

	public Student() {
		super();
		this.setAll();
	}

	public Student(int registrationNo, String fullName, double marks) {
		super();
		this.registrationNo = registrationNo;
		this.fullName = fullName;
		this.marks = marks;
		all = new ArrayList<>();
		this.setAll();
	}

	public int getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [registrationNo=" + registrationNo + ", fullName=" + fullName + ", marks=" + marks + "]";
	}

	private void setAll() {
		if (all == null)
			return;
		all.add(Integer.toString(getRegistrationNo()));
		all.add(getFullName());
		all.add(Double.toString(getMarks()));

	}

	public List<String> getAll() {
		return all;
	}

}
