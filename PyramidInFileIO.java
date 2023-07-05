package FileIO;

// write a Pyramid in txtfile

import java.io.*;

public class PyramidInFileIO {

	public static void main(String[] args)
	{
		try 
		{
			FileWriter fw=new FileWriter("/home/sathiyamoorthym/My World/JAVA/Fileio/pyramid.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
		
		for(int i=1; i<=4 ; i++)
		{
			for(int j=i; j<=4; j++)
			{
				bw.write(" ");
			}
			for(int k=1 ;k<=i; k++)
			{
				bw.write(" *");
			}
			bw.write("\n");
		}
		bw.close();
		fw.close();
		
		}
		catch (IOException e)
		{
			System.out.println("Thread Getting EXception!");
		}
		
		
	}

}

/*
o/p: in file loacation(/home/sathiyamoorthym/My World/JAVA/Fileio/pyramid.txt)

     *
    * *
   * * *
  * * * *

*/