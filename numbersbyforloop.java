//1. Print 1 to 10 using forloop
public class numbersbyforloop
{
    public static void main(String args[])
    {
                System.out.println("Print 1 to 10 using forloop");
        for(int i=1; i<=10;i=i+1)
            {
                System.out.print(i+",");
            }
                System.out.println();
//2. Print 10 to 1 using forloop
                System.out.println("Print 10 to 1 using forloop");
        for(int i=10; i>=1;i=i-1)
            {
                System.out.print(i+",");
            }
                System.out.println();
//3. Print odd number between 1 and 100 using forloop
                System.out.println("Print odd number between 1 and 100 using forloop");

        for(int i=1; i<=100;i=i+2)
            {
                System.out.print(i+",");
            }
                System.out.println();
//4. Print even number between 1 and 100 using forloop
            System.out.println("Print even number between 1 and 100 using forloop");

        for(int i=2;i<=100;i=i+2)
            {
            System.out.print(i+",");
            }
            System.out.println();
//5. Print multiples of 7 between 1 and 100 using forloop
            System.out.println("Print multiples of 7 between 1 and 100 using forloop");

        for(int i=7;i<=100;i=i+7)
                {
                    System.out.print(i+",");
                }
                    System.out.println();

    }
}

/* 
output:
Print 1 to 10 using forloop
1,2,3,4,5,6,7,8,9,10,
Print 10 to 1 using forloop
10,9,8,7,6,5,4,3,2,1,
Print odd number between 1 and 100 using forloop
1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,
Print even number between 1 and 100 using forloop
2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,90,92,94,96,98,100,
Print multiples of 7 between 1 and 100 using forloop
7,14,21,28,35,42,49,56,63,70,77,84,91,98,   
*/   

