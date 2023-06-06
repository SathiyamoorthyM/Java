//split the array into two based on odd & even elemets

public class Arraysplit
{
public static void main(String args[])
{
    int a[]={7,3,4,1,6,8,9,12,11,16};
    int oddcount=0;
    int evencount=0;
    for(int i : a)
    {
        if(i%2 != 0)          
        {
            oddcount=oddcount+1;
        }
        else
        {
            evencount=evencount+1;
        }
    }
 //   System.out.println(oddcount);
 //  System.out.println(evencount);

   int odd[]=new int [oddcount];
   int even[]=new int[evencount];
    int j=0;
    int k=0;
    for(int i : a)
    {
        if(i%2 ==0)
        {
            even[j]=i;
            j=j+1;
        }
        else
        {
          odd[k]=i;
           k=k+1;
        }
    }
        System.out.println("Even elements in Array :");
    for(int i : even)
            {
        System.out.print(i+",");
            }
        System.out.println();
        System.out.println("Odd elements in Array :");
     for(int i : odd)
            {
        System.out.print(i+",");
            }
        System.out.println();

}
}

/*
output:

Even elements in Array :
4,6,8,12,16,
Odd elements in Array :
7,3,1,9,11,

*/
