//2. How many cubicle boxes each of side 20cm can be fit inside a rectangular box whose dimensions are 2m x 1.5m x 1m ( length x width x height ) 
public class volmeasurment
{
    public static void main(String args[])
    {        
        double a=20.0/100.0;
        double l=2.0;
        double w=1.5;
        double h=1.0;
        double volreg=l*w*h;
        double volcub=a*a*a;
        double noofbox=volreg/volcub;
        System.out.println("Number of cubicle box= "+noofbox);
         
    }
}

//output:  Number of cubicle box= 374.9999999999999
