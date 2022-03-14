package com.greatlearning.model;

import java.util.Random;

public class EmployeeCredentialService {
	
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerLetters="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String specialCharacters="!@#$%^&*+-/,?<>)";
		String values = capitalLetters + lowerLetters + num + specialCharacters;
		public char[] generatePassword(){
			char password[] = new char[8];
		Random random = new Random();
		for(int i=0; i<8; i++) {
			password[i]= values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	
public String generateEmailAddress(String firstName, String lastName, String department) 
{
	return firstName + lastName + "@" + department	+ "greatlearning.com";
	}
public void showCredential(String firstName, String email, char[] generatePassword) {
	System.out.println("\n employee :" + firstName);
	System.out.println("\n email :" +email);
	System.out.println("\n genratePassword : " +generatePassword);
	
}

}
