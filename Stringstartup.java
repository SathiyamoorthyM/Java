// String startup programs: by using given string   ex: s="malala got nopal prize for peace"

public class Stringstartup
{
    public static void main (String args[])
    {

    String s="malala got nopal prize for peace";
    int countA=0;
    int countB=0;
    int countC=0;
    int countD=0;
    int indexEnd= s.length()-1;
    

        for(int i=0 ; i<s.length() ; i=i+1)
            {


// find the space occurrence in given string.

                if(s.charAt(i) == ' ')
                    {
                        countA=countA+1;
                    }

// find the consonents occurrence  in given string.

                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == ' ' )
                    {
                        countB=countB+1;
                    }

// find the index of 'a'  for given string.

                if(s.charAt(i) == 'a' && countC==0)
                    {
                        countC= countC+1;
                        System.out.println("Index of character 'a' = "+i);
                    }
             
// find the last index of 'a' for given string.

                if( s.charAt( indexEnd - i ) == 'a' && countD==0 )
                    {
                        countD=countD+1;
                        System.out.println("Last index of character 'a' = "+ (indexEnd- i) );
                    }      

            }

// print the string in reverse order.

                System.out.println("Reverse order of given string :");

        for(int i= indexEnd ; i>=0; i=i-1 )
        {                    
           System.out.print(s.charAt( i ) );
        }
        System.out.println();

//  find the middle character in given string.

                if( s.length()%2==0)
                    {
                       System.out.println("Middle character is = "+"'"+ (s.charAt(s.length()/2))+"'");                       
                     }
                else
                    {
                       System.out.println("Middle character is = " + (s.charAt(s.length()/2)) + "," +(s.charAt (s.length()/2+1)) );                       
                    }

        System.out.println("Space occurrance is = "+countA);
        System.out.println("Consonents occurrance is = "+ (s.length()-countB));

// find the total charactors occurrence in given string

        System.out.println("Total characters occurrence is =  "+ s.length()); 

// find first and last charactor in given string.

        System.out.println("First & Last characters = "+s.charAt(0)+" & "+ s.charAt(s.length()-1));  

// find total words used in given string.

        System.out.println("Total words used in string = "+ (countA+1));  // total num of words is the value of space +1 . here counA is num of space.

    }
}

/*
output:

Index of character 'a' = 1
Last index of character 'a' = 29
Reverse order of given string :
ecaep rof ezirp lapon tog alalam
Middle character is = ' '
Space occurrance is = 5
Consonents occurrance is = 15
Total characters occurrence is =  32
First & Last characters = m & e
Total words used in string = 6

*/

