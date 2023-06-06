// 1.Array  a=[9,3,1,8,3,6] find mean value.
public class exarray
{
    public static void main(String args[])
    {
        int a[]={9,3,1,8,3,6};
        int sum=0;
        for(int i=0; i<a.length;i=i+1)
            {
                sum=sum+a[i];
            }
          int mean=sum/a.length;
        System.out.println("Mean value of given array=  "+mean);


// 2.find median for given array.
// given serial  terms count in even.so following calculation used  ((n/2)th element+((n/2) +1)element)/2

        int x= (a[(a.length/2)-1]  +  a[a.length/2] );
        double median=x/2.0;
        System.out.println("Median of the array= "+median);


//3.find range  for given array.

        int min=a[0];
        int max=a[0];
        for(int i=1; i<a.length; i=i+1)
            {
                if( min > a[i] )
                    {
                        min=a[i];
                    }
                if( max < a[i] )
                    {
                        max=a[i];
                    }
            }
        System.out.println("Lowest value of array= "+min);
        System.out.println("Maximum value of array= "+max);
        System.out.println("Range of array= "+(max-min));    
    }
}

/*
output:

Mean value of given array=  5
Median of the array= 4.5
Lowest value of array= 1
Maximum value of array= 9
Range of array= 8

*/
