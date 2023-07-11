package SingleArray;

// find the subset of array

public class SubSetArray
{
 public static void main (String args[])
 {
	 int a[]= {1,2,3,4,5,6,8};
	 int b[]= {8,6,4};
	 int count=0;
	
	 
	 for(int i=0; i<b.length; i++)
	 {
		 for(int j=0; j<a.length; j++)
		 {
			 if(b[i]==a[j])
			 {
				 count=count+1;
			 }
		 }
	 }
	 
	 if(count==b.length)
	 {
		 System.out.println("Subset of array");
	 }
	 else
	 {
		 System.out.println("Not a subset of Array");
	 }
 }
 
}

/*

int b[]= {8,0,4};  ---> Not a subset of Array
int b[]= {8,6,4};  ---> Subset of array

*/