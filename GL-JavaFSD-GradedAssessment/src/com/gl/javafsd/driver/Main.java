package com.gl.javafsd.driver;

import com.gl.javafsd.assessment.AdminDepartment;
import com.gl.javafsd.assessment.HrDepartment;
import com.gl.javafsd.assessment.SuperDepartment;
import com.gl.javafsd.assessment.TechDepartment;


public class Main {

	public static void main(String[] args) {
		
		SuperDepartment superdepartment = new SuperDepartment();
		
		SuperDepartment hrdepartment =  new HrDepartment();
		
		SuperDepartment techdepartment = new TechDepartment();
		
		SuperDepartment adminDepartment = new AdminDepartment();
		
		
		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
	
		
		System.out.println("Welcome to " + hrdepartment.departmentName());
		System.out.println( ((HrDepartment) hrdepartment).doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday());
		System.out.println();
		
		
		System.out.println("Welcome to " + techdepartment.departmentName());
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(((TechDepartment) techdepartment).getTechStackInformation());
		System.out.println(techdepartment.isTodayAHoliday());
		
	}
	
}