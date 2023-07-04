package FileIO;
import java.io.*;
public class CreateMultipleFiles {

	public static void main(String[] args) 
	{
		
	for(int i=1; i<=10;i++)
	{
		try
		{
		FileWriter fw=new FileWriter("/home/sathiyamoorthym/My World/JAVA/Fileio/File"+i+".txt");
		fw.write(i+64);
		fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Thread Getting EXception!");
		}
		
	}
		
	
	}

}
