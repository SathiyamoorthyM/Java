// pyramid with numer series.

public class pyramid
{
public static void main(String args[])
{
    int a=4;
    int count=0;
    for(int i=1; i<=a; i=i+1)
            {
                for( int j=i; j<=a;j=j+1)
                {
                       System.out.print(" ");                      
                }
                for(int k=1;k<=i;k=k+1)
                {
                    count=count+1;
                    System.out.print(" "+(count));
               }
                System.out.println();
            }
}
}
/*

     1
    2 3
   4 5 6
  7 8 9 10

*/
