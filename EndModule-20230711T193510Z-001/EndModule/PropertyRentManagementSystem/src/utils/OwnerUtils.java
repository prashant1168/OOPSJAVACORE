package utils;

import java.util.HashSet;
import java.util.Set;
import static utils.PropertyRentValidationRules.*;
import com.app.core.Owner;
import com.app.core.PropertyType;

import customException.RentCustomException;

public class OwnerUtils {
	
public static Set<Owner>populateOwner() throws RentCustomException{
	Set<Owner>ownerSet=new HashSet<>();
	//ownerSet.add(validateAllInputs("1234", "Priti", "Mundhe", "pm@gmail.com",
	//"Baner", "9876543210", "2023-06-01", 5000, ownerSet));
	//ownerSet.add(validateAllInputs("1234", "Priti" ,"Mundhe", "pm@gmail.com", "Baner","9876543210","2023-06-01","onebhk", 7000, ownerSet));
	return ownerSet;
}
//ownerSet.add(validateAllInputs("1234", "Priti", "Mundhe", "pm@gmail.com",
// "Baner", "9876543210", , null, 0, ownerSet))


	
	
	
	
	
	
	
	
}
