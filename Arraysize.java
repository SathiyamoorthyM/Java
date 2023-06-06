// 1.find the size of array by using advanced forloop.
public class Arraysize
{
    public static void main (String args[])
{
        int a[]={7,3,4,1,6,8,9,12,11,16};
        int count=0;
        for(int i : a )
        {
            count=count+1;
        }
        System.out.println("Size of arry= "+ count);
}
}
/* 
output:
    Size of arry= 10
*/
