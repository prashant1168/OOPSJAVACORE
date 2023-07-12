package custom_exception;

@SuppressWarnings("serial")
public class PatientHandlingException extends Exception
{

	public PatientHandlingException(String message) 
	{
		super(message);
	}
	
}
