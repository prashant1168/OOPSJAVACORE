package custom_exception;

@SuppressWarnings("serial")
public class StudentExceptionHandling extends Exception
{
	public StudentExceptionHandling(String msg)
	{
		super(msg);
	}
}
