//1.Find whose area is greater between square and circle where side of a square is 2cm and radius of a circle is 1.5cm
 
public class areameasurment
{
    public static void main (String args[])
     {
        double a=2.0;
        double r=1.5;
        double sa=a*a;
        double ca=(22.0/7.0)*r*r;
         System.out.println("Square Area "+sa);
         System.out.println("Circle Area "+ca);

        if(sa>ca)
            {
               System.out.println("Square have greater area");
            }
       else
            {
              System.out.println("Circle have greater area");
            }
       }
}
/* 
output: 

Square Area 4.0
Circle Area 7.071428571428571
Circle have greater area


*/
