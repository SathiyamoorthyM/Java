package NumbersCodes;

// Check Strong Number or Not

/*
 * A number can be said as a strong number when the sum of the factorial of the individual digits is equal.
 * 145=  (1)+(1*2*3*4)+(1*2*3*4*5) = 145  
 */

public class StrongNumber 
{

	public static void main(String[] args)
	{
		int x=145;
		int num=x;
		int sum=0;
		
		while(num>0)
		{
			int digit= num % 10;
			int factorial=1;
			
			for(int i=1; i<=digit; i++)
			{
				factorial= factorial*i;
			}
			sum=sum+factorial;
			num=num/10;
		}
		System.out.println(sum);
		
		if(sum==x)
		System.out.println("Strong Number");
		else
		{
			System.out.println("Not a Strong Number");
		}
	}

}

/*

145
Strong Number

*/
