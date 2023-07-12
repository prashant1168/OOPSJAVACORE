package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.Patient;

public interface IOUtils 
{
	public static void storeDetails(String fileName, HashMap<String, Patient> patient) throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(patient);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static HashMap<String, Patient> restoreDetails(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (HashMap<String, Patient>)in.readObject();
		}catch (Exception e) {
			e.printStackTrace();
			return new HashMap<>();
		}
	}
}
