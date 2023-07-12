package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.core.Patient;
import com.app.core.RoomType;

import custom_exception.PatientHandlingException;

public class PatientValidationRules 
{
	public static Patient validateAllInputs(String patientId, String patientName, int age, String gender, String address, String phoneNumber,
			String disease, String admitDate, double annualIncome, String roomType, HashMap<String, Patient> patient) throws Exception
	{
		checkForDup(patientId, patient);
		LocalDate validDate= parseAdmitDate(admitDate);
		RoomType rType= validateRoomType(roomType);
		return new Patient(patientId,patientName,age,gender,address,phoneNumber,disease,validDate,annualIncome,rType);		
	}
	
	public static LocalDate parseAdmitDate(String date) throws PatientHandlingException
	{
		LocalDate d=LocalDate.now();
		LocalDate d1=LocalDate.parse(date);	
		if(!d.equals(d1))
		{
			throw new PatientHandlingException("Invalid Date!");
		}
		return d1;
	}
	
	public static RoomType validateRoomType(String rType) throws PatientHandlingException
	{
		return RoomType.valueOf(rType.toUpperCase());
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void checkForDup(String pId, HashMap<String, Patient> patient) throws PatientHandlingException
	{
		Patient p = new Patient(pId);
		if(patient.containsKey(p))
			throw new PatientHandlingException("Duplicate Patient Id!");
	}
}
