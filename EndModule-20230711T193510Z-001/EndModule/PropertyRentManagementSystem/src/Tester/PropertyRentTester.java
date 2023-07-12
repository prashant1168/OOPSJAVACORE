package Tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import static utils.OwnerUtils.*;
import static utils.PropertyRentValidationRules.*;
import com.app.core.Owner;
import com.app.core.PropertyType;

import customException.RentCustomException;

public class PropertyRentTester {

	public static void main(String[] args) throws RentCustomException {
		try (Scanner sc = new Scanner(System.in)) {
			Set<Owner> ownerSet = populateOwner();
			boolean exit = false;
			while (!exit)
			{
			
					try {
						System.out.println("Options:1 add new Owner 2:Display All owner details 3:Remove owner based on adhar no 4:Update contact No. of owner based on email 5: sort owner as per propertyType & rent 6:Change status of owner's property when it is rented");
						System.out.println("Select Option");
						
						switch (sc.nextInt()) 
						{
						
						case 1:// Add new Owner
							System.out.println("Enter owner details: adharNo,firstName,lastName,email,propertyAddress,mobNo,\r\n"
											+ "	selectProperty, availableDate, rent");
							ownerSet.add(validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
									sc.next(), sc.next(), sc.nextInt(), ownerSet));
							
							System.out.println("----new owner added----");

							break;
						case 2://2:Display All owner details"
							//ownerSet.stream()
							ownerSet.forEach(o->System.out.println(o));
							break;
						case 3://3:Remove owner based on adhar no
							System.out.println("Enter adhar no to remove owner");
							String adhar=sc.next();
							if(ownerSet.contains(adhar))
								ownerSet.remove(adhar);
							System.out.println("---Owner removed---");
							break;
						case 4://4:Update contact No. of owner based on email
							System.out.println("Enter email to update mob no");
							String givenemail=sc.next();
							if(ownerSet.contains(givenemail));
							((Owner) ownerSet).setMobNo(sc.next());
							System.out.println("Contact no. updated");
						case 5://5: sort owner as per propertyType & rent
							System.out.println("Enter property type");
					
							PropertyType pt=PropertyType.valueOf(sc.next().toUpperCase());
//							ownerSet.stream()
//							.sorted()
//							.forEach(o -> System.out.println(o));
							if(ownerSet.contains(pt))
								
							
		
							break;
						case 6: //6:Change status of owner's property when it is rented
							System.out.println("update status of property : if rent given");
							
								
							
							break;
						case 0:
							exit = true;
							break;

						}

					}
					catch (Exception e)
					{
						e.printStackTrace();
						sc.nextLine();
					}
			}
				
		
		}

	}

}
