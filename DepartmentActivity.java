package com.department.model;

import java.util.Scanner;

public class DepartmentActivity {

	public static void main(String[] args) {
            
			AdminDepartment admin=new AdminDepartment();
		
			System.out.println("Welcome to" + admin.DepartmentName());
			System.out.println(admin.getTodaysWork());
			System.out.println(admin.getWorkDeadline());
			System.out.println(admin.isTodayAHoliday());
		
			HrDepartment hr=new HrDepartment();
			System.out.println("Welcome to" + hr.DepartmentName());
			System.out.println(hr.getTodaysWork());
			System.out.println(hr.getWorkDeadline());
			System.out.println(hr.doActivity());
			System.out.println(hr.isTodayAHoliday());
			TechDepartment tech=new TechDepartment();
			System.out.println("Welcome to" + tech.DepartmentName());
			System.out.println(tech.getTodaysWork());
			System.out.println(tech.getWorkDeadline());
			System.out.println(tech.getTechStackInformation());
			System.out.println(tech.isTodayAHoliday());
		
			
			}

	}


