package com.department.model;
public class SuperDepartment 
{
	String DepartmentName() {
		return "Super Department";
	}
	String getTodaysWork() {
		return "No Work as of now";
	}
	String getWorkDeadline() {
		return "Nill";
	}
	String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}

  class AdminDepartment extends SuperDepartment{
	String DepartmentName() {
		return " Admin Department";
	}
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline() {
		return "Complete by EOD ";
	}
	}

  class HrDepartment extends SuperDepartment{
	String DepartmentName(){
		return " HR Department";
	}
	String doActivity() {
		return "Team Lunch";
	}
	String getTodaysWork() {
		return "Fill today’s Markssheet and mark your attendance";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	}

  class TechDepartment extends SuperDepartment{
	String DepartmentName() {
		return " Tech Department";
	}
	String getTodaysWork() {
		return "Complete coding of module 1";
	}
	String getWorkDeadline() {
		return "Complete by EOD ";
	}
	String getTechStackInformation() {
		return "Core JAVA";
	}

	}

   


