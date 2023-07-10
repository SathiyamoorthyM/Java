package TwoDArray;

// given 2D matrix converted into upper angle triangle

public class UpperTriangleMatrix
{

	public static void main(String[] args)
	{
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{3,4,5,6}};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(i>j)                      // when i value higher than j the elements are in below the diagonal elements
				{
					a[i][j]=0;
					System.out.print(a[i][j]);
					continue;
				}
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}

/*

1234
0678
0012
0006

*/
