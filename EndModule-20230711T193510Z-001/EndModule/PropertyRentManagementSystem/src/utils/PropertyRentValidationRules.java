package utils;

import java.time.LocalDate;
import java.util.Set;

import com.app.core.Owner;
import com.app.core.PropertyType;

import customException.RentCustomException;

public class PropertyRentValidationRules {
//String adharNo, String firstName, String lastName, String email, String propertyAddress, String mobNo,
//	PropertyType propertytype, LocalDate availabilityDate, int rent
	public static Owner validateAllInputs(String adharNo, String firstName, String lastName, String email, String propertyAddress, String mobNo,
			String propertytype, String availabilityDate, int rent, Set<Owner>ownerset ) throws RentCustomException {
		PropertyType selectProperty=parseAndValidateProperty(propertytype);
		LocalDate availableDate=parseAndValidateDate(availabilityDate);
		return new Owner(adharNo,firstName,lastName,email,propertyAddress,mobNo,
				selectProperty, availableDate, rent);
	
	}
	public static PropertyType parseAndValidateProperty(String propertytype) {
		return PropertyType.valueOf(propertytype.toUpperCase());
	}
	public static LocalDate parseAndValidateDate(String availabilityDate) throws RentCustomException {
		LocalDate avail_date=LocalDate.parse(availabilityDate);
		if(avail_date.isBefore(LocalDate.now()))
			throw new RentCustomException("Availability date is before current date");
		
		return avail_date;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
