package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.Students;

public interface IOUtils 
{
	public static void storeStudDetails(String filename, HashMap<String, Students> stud) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(stud);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static HashMap<String, Students> restoreStudDetails(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			return (HashMap<String, Students>)in.readObject();
		}catch (Exception e) {
			e.printStackTrace();
			return new HashMap<>();
		}
	}
}
