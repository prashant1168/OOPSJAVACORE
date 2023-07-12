package tester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Students;

import static utils.IOUtils.*;
import static utils.StudentValidationRules.*;

public class TestSMS {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file name");
			String filename=sc.next();
			
			HashMap<String, Students> stud = null;
			storeStudDetails(filename, stud);
			restoreStudDetails(filename);
			
			boolean exit=false;
			while (!exit)
			{
				System.out.println("1. Add new Student");
				System.out.println("2. Display all Students");
				System.out.println("3. Sort as per DOB");
				System.out.println("4. Remove by document status");
				System.out.println("5. Sort by City");
				System.out.println("0. Exit");
				System.out.println("Enter your choice");
				
				try {
					switch(sc.nextInt()) {
					
					case 1:
						System.out.println("Enter Student Details: rollNo, firstName, lastName, email, address, fees, course1, qualification1, date, isSubmitted");
						Students validStudent=validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.next(), sc.nextBoolean(), stud);
						stud.put(validStudent.getRollNo(), validStudent);
						System.out.println("New Student added!");
					break;	
					
					case 2:
						stud.forEach((k,v)-> System.out.println(v));
					break;
					
					case 3:
						System.out.println("Sorted list:");
						stud.values().stream().sorted((s1,s2)-> s1.getDOB().compareTo(s2.getDOB())).forEach(s-> System.out.println(s));
					break;
					
					case 4:
						boolean removed=stud.values().removeIf(s-> !s.isSubmitted());
					break;
					
					case 5:
						System.out.println("Enter the City");
						String city=sc.next();
						stud.values().stream().filter(s->s.getAddress().equals(city));
					break;
					
					case 0:
						exit=true;
					break;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
