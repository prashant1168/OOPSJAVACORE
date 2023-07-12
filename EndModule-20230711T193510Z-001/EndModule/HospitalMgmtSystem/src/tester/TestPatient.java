package tester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Patient;
import com.app.core.RoomType;

import static utils.IOUtils.*;
import static utils.PatientValidationRules.*;

public class TestPatient 
{

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter filename");
			String filName=sc.next();	
			HashMap<String, Patient> patientMap=new HashMap<>();
			storeDetails(filName, patientMap);
			restoreDetails(filName);
			
			System.out.println("1. Add Patient");
			System.out.println("2. Display all patients");
			System.out.println("3. Patient details based on room type");
			System.out.println("4. Remove all patients who has diabetese");
			System.out.println("5. Change room type of patient from ICU to Special Room");
			System.out.println("6. Sort patients according to gender");
			System.out.println("0. Exit");
			
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter Your Choice");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit=true;
						System.out.println("Exited!");
					break;
					
					case 1:
						System.out.println("Enter details: patientId,patientName,age,gender,address,phoneNumber,disease,date,annualIncome,roomType");
						Patient validPatient=validateAllInputs(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(), patientMap);
						patientMap.put(validPatient.getPatientId(), validPatient);
						System.out.println("Patient added successfully!");
					break;	
					
					case 2:
						patientMap.forEach((k,v)-> System.out.println(v));
					break;	
					
					case 3:
						System.out.println("Enter Room Type:");
						RoomType roomtype=validateRoomType(sc.next());
						patientMap.values().stream().filter(p -> p.getRoomType().equals(roomtype)).forEach(a -> System.out.println(a));
					break;	
					
					case 4:
						boolean removed=patientMap.values().removeIf(d -> d.getDisease().equals("Diabetese"));
						if(removed = true)
							System.out.println("Patiens Removed!");
						System.out.println("Can't Remove!");
					break;
					
					case 5:
						System.out.println("List of shifted ptients:");
						patientMap.values().stream().filter(p->p.getRoomType().equals(RoomType.ICU)).forEach(p -> p.setRoomType(RoomType.SPECIAL));		
					break;	
					
					case 6:
						System.out.println("Sorted list:");
						patientMap.values().stream().sorted((p1,p2) -> p1.getGender().compareTo(p2.getGender())).forEach(p -> System.out.println(p));
					break;	

					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
