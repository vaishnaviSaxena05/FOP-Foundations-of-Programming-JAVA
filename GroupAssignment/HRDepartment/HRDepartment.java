package com.greatLearning.GroupAssignment.HRDepartment;

import com.greatLearning.GroupAssignment.superDepartment.SuperDepartment;

public class HRDepartment extends SuperDepartment {

	public HRDepartment() {
		System.out.println("Welcome to HR Department");
	}

	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
