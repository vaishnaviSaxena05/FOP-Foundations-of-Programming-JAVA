package com.greatLearning.GroupAssignment.adminDepartment;

import com.greatLearning.GroupAssignment.superDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public AdminDepartment() {
		System.out.println("Welcome to Admin Department");
	}

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
