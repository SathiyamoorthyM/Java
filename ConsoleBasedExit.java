package Interview;

//Enter the n data until exit is entered

import java.util.Scanner;
import java.util.TreeMap;
public class ConsoleBasedExit 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Long,String> tm=new TreeMap<Long,String>();
		String name="";
		Long num;
		while(true)
		{
			System.out.println("Enter the Mobile Number:");
			num= sc.nextLong();
			sc.nextLine();
			System.out.println("Enter your Name:");
			name= sc.nextLine();
			if(name.equals("exit"))
			{
				break;
			}
			tm.put(num,name);
			
		}
		System.out.println(tm);
		sc.close();
	}

}
/*
 o/p:
 
 Enter the Mobile Number:
1234
Enter your Name:
abc
Enter the Mobile Number:
4567
Enter your Name:
defg
Enter the Mobile Number:
1234
Enter your Name:
hijk
Enter the Mobile Number:
1
Enter your Name:
exit
{1234=hijk, 4567=defg}

*/
