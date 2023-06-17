package HomeWork;
// Find Second maximum element in an integer array.

public class SecondMaxNumber {

	public static void main(String[] args) {

		int g[] = { 87, 46, 85, 56, 54, 85, 87 };

		System.out.println("dsec order duplicate removed Array : "); // sorting the array
		for (int i = 0; i < g.length; i = i + 1) {
			for (int j = 1 + i; j < g.length; j = j + 1) {

				if (g[i] == g[j]) {
					g[j] = 0;
				}

				if (g[i] < g[j]) {
					int temp = g[j];
					g[j] = g[i];
					g[i] = temp;

				}
			}
		}
		
		for(int i : g)
		{
			System.out.print(i+",");
		}
	
		System.out.println();
		System.out.println("Second Maximum Element is = "+g[1]);

	}

}
/*
o/p:

dsec order duplicate removed Array : 
87,85,56,54,46,0,0,
Second Maximum Element is = 85


*/