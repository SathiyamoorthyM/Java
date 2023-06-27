package Temp;
import java.io.*;
public class Writerdatatofile {

	public static void main(String[] args) {
	
		FileWriter fw=null;
		try
		{
			fw =new FileWriter("/home/sathiyamoorthym/My World/JAVA/Fileio/new.txt",true);	
			String s="My name is java";
			fw.write(s);
			fw.close();
		}
		catch(IOException e)
		{
			System.out.println("Check file");;
	
		}
		
		
			
		
		fw=null;   
	}

}
