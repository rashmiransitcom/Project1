package com.greatlearning.model;

import java.util.Scanner;


public class EmployeeId {
	//String firstName;
    //String lastName;
	public static void main(String[] args) {
		String firstName;
	    String lastName;
		System.out.println("Enter firstName");
Scanner s1= new Scanner(System.in);
firstName=s1.nextLine();
		
		System.out.println("Enter laststName");
		Scanner s2= new Scanner(System.in);
		lastName=s2.nextLine();
		
		//Employee employee = new Employee("Rashmi", "Ranjan");
		EmployeeCredentialService service = new EmployeeCredentialService();
		Scanner s = new Scanner(System.in);
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("\n 1 Technical \n 2 Admin \n 3 HR");
		int option = s.nextInt();
		switch(option) {
		/*case 1:
			generatedEmail = service.generatedEmail(employee.getfirstName(), employee.getlastName(), "technical");
		generatedPassword = service.generatePassword();
		service.showCredential(employee, generatedEmail, generatedPassword);
		break;
			case 2:
				generatedEmail = service.generatedEmail(employee.getfirstName(), employee.getlastName(), "Admin");
				generatedPassword = service.generatePassword();
				service.showCredential(employee, generatedEmail, generatedPassword);
				
				break;
			case 3:
				generatedEmail = service.generatedEmail(employee.getfirstName(), employee.getlastName(), "HR");
				generatedPassword = service.generatePassword();
				service.showCredential(employee, generatedEmail, generatedPassword);
				break;
					default: System.out.println("\n invalid choice");
					break;
				*/
		case 1:
			generatedEmail = service.generateEmailAddress(firstName, lastName, "technical");
		generatedPassword = service.generatePassword();
		service.showCredential(firstName, generatedEmail, generatedPassword);
		break;
			case 2:
				generatedEmail = service.generateEmailAddress(firstName, lastName, "Admin");
				generatedPassword = service.generatePassword();
				service.showCredential(firstName, generatedEmail, generatedPassword);
				
				break;
			case 3:
				generatedEmail = service.generateEmailAddress(firstName, lastName, "HR");
				generatedPassword = service.generatePassword();
				service.showCredential(firstName, generatedEmail, generatedPassword);
				break;
					default: System.out.println("\n invalid choice");
					break;
		}
	

	}

}
