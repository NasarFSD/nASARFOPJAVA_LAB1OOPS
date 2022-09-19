package org.greatlearning.service;

import java.util.Scanner;

import org.greatlearning.model.Employee;
import org.greatlearning.service.util.CredentialsService;

public class DriverClass {
	

	private static char[] generatedpasswrod;


	@SuppressWarnings("resource")
	public static <CredentialService> void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee("nasar","aman");
		CredentialsService<Employee> credentialService=new CredentialsService<Employee>();
		int ch;
		do
		{
			System.out.println("please enter the department from the following");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.HumanResource");
			System.out.println("4.Legal");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				String email=credentialService.generateEmailAddress(e.getFirstName(),Employee.getLastName(),"Tech"); 
				char[] password=credentialService.generatepassword();
				credentialService.showCredentials(e,email,generatedpasswrod);
				
				break;
				
			case 2:
				
				String email1=credentialService.generateEmailAddress(e.getFirstName(),Employee.getLastName(),"Admin"); 
				credentialService.generatepassword();
				credentialService.showCredentials(e,email1,generatedpasswrod);
				
				break;
				
			case 3:
				
				String email11=credentialService.generateEmailAddress(e.getFirstName(),Employee.getLastName(),"HumanResource"); 
				credentialService.generatepassword();
				credentialService.showCredentials(e,email11,generatedpasswrod);
				
				break;
				
			case 4:
				
				String email111=credentialService.generateEmailAddress(e.getFirstName(),Employee.getLastName(),"Legal"); 
				credentialService.generatepassword();
				credentialService.showCredentials(e,email111,generatedpasswrod);
				
				break;
				
				default:
					break;
			}
			
				
			}while(ch<=4);
		}
		
	}

