
// a[]={7,5,1,4,9}  b[]={1,3,9}   1.Merge the array   2.remove the duplicate elements of array   3. Sortt the array asc & desc

public class arrayMergDupSort
{
public static void main (String args[])
{
    int a[]={7,5,1,4,9};
    int b[]={1,3,9};
    int c[]=new int[a.length+b.length];
//1.merge the two array.

    for(int i=0; i<a.length; i=i+1)
        {
        c[i]=a[i];
         }
    for(int i=0; i<b.length; i=i+1)
      {
        c[a.length+i]=b[i];
       }
    System.out.println("Merged Array :");
    for(int i : c)
        {
           System.out.print(i+",");
         }
    System.out.println();

//2.duplicate removing

    for(int i=0; i<c.length; i=i+1)
        {
            for(int j=i+1; j<c.length;j=j+1)
                {
                    if(c[i]==c[j])
                    {
                        c[j]=0;
                    }
                }
         }
        System.out.println("Duplicate removed Array :");
            for(int i : c)
                {
                    System.out.print(i+",");
                }
        System.out.println();
// 3.Sorting the array ascending order.

        for(int i=0; i< c.length; i=i+1)
            {
                for(int j=i+1;j<c.length;j=j+1)
                    {
                        if(c[i]>c[j])
                            {
                                int temp=c[j];
                                c[j] = c[i];
                                c[i] = temp;
                             }
                    }
            }
        System.out.println("Array sorted by Ascending Order :");
        for(int i : c)
            {
                System.out.print(i+",");
            }
        System.out.println();

// 4. Array sorted by Descending Order.

        for(int i=0; i< c.length;i=i+1)
            {
                for(int j=i+1; j<c.length; j=j+1)
                    {
                        if(c[i]<c[j])
                        {
                            int temp=c[j];
                            c[j]=c[i];
                            c[i]=temp;
                        }
                    }
            }
        System.out.println("Array sorted by Descending Order :");
        for(int i : c)
            {
                System.out.print(i+",");
            }
        System.out.println();
}
}

/*
output:

Merged Array :
7,5,1,4,9,1,3,9,
Duplicate removed Array :
7,5,1,4,9,0,3,0,
Array sorted by Ascending Order :
0,0,1,3,4,5,7,9,
Array sorted by Descending Order :
9,7,5,4,3,1,0,0,

*/

