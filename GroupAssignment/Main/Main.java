package com.greatLearning.GroupAssignment.Main;

import com.greatLearning.GroupAssignment.HRDepartment.HRDepartment;
import com.greatLearning.GroupAssignment.TechDepartment.TechDepartment;
import com.greatLearning.GroupAssignment.adminDepartment.AdminDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment admin = new AdminDepartment();
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		HRDepartment HR = new HRDepartment();
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.isTodayAHoliday());
		System.out.println();

		TechDepartment tech = new TechDepartment();
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
