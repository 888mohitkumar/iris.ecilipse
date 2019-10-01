package com.execution;

public class Student {

	int roll;
	String name;

	float percentage;
	String grade;

	public Student(final int roll, final String name, final float percentage) {
		super();
		this.roll = roll;
		this.name = name;
		this.percentage = percentage;
	}

	public String calGrade() {
		if (percentage < 33) {
			grade = "fail";
		} else if (percentage < 45) {
			grade = "third";
		} else if (percentage < 60) {
			grade = "second";
		} else if (percentage < 65) {
			grade = "first";
		} else {
			grade = "Distinction";
		}
		return grade;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", percentage=" + percentage + ", grade=" + grade + "]";
	}

}
