// equaletral triangle inverted direction.


public class downtri
{
    public static void main (String args[])
    {
        int a=5;
        for(int i=1; i<=a; i=i+1)
        {
            for(int j=1; j<i; j=j+1)
            {
            System.out.print(" ");   // single space used
            }
            for(int k=i; k<=a ; k=k+1)
            {
            System.out.print(" *");  // single space with star symbol used.
            }
      
            System.out.println();
        }
    }
}

/* 
output:

  * * * * *
   * * * *
    * * *
     * *
      *
 

*/

