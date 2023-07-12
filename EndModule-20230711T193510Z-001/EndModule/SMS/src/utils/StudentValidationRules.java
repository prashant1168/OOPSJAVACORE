package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.Course;
import com.app.core.Qualification;
import com.app.core.Students;

import custom_exception.StudentExceptionHandling;

public class StudentValidationRules 
{
	public static Students validateAllInputs(String rollNo, String firstName, String lastName,String email, String address, double fees, 
			String course, String qualification, String DOB, boolean isSubmitted, HashMap<String, Students> students) throws StudentExceptionHandling
	{
		LocalDate date= parseAndValidateDob(DOB);
		Course course1=validateCourse(course);
		Qualification qualification1=validateQualification(qualification);
		
		return new Students(rollNo, firstName, lastName, email, address, fees, course1, qualification1, date, isSubmitted);		
	}
	
	public static LocalDate parseAndValidateDob(String date) throws StudentExceptionHandling 
	{
		LocalDate DOB = LocalDate.parse(date);
		LocalDate date1 = LocalDate.parse("2000-01-01");
		
		if(DOB.isBefore(date1))
			throw new StudentExceptionHandling("You're not allowed!");
		return DOB;
	}
	
	public static Course validateCourse(String course1) throws StudentExceptionHandling
	{
		return Course.valueOf(course1.toUpperCase());
	}
	
	public static Qualification validateQualification(String qualification1) throws StudentExceptionHandling
	{
		return Qualification.valueOf(qualification1.toUpperCase());
	}
}
