package HomeWork;

import java.util.Scanner;

public class Calculater {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter value of b : ");
		double b = sc.nextDouble();
		System.out.println("Enter the any arithmetic Operator");
		char x = sc.next().charAt(0);
		double c;

		switch (x) {
		case '+':
			c = a + b;
			System.out.println("Addtion value of A&B = " + c);
			break;
		case '-':
			c = a - b;
			System.out.println("Subract value of A&B = " + c);
			break;
		case '*':
			c = a * b;
			System.out.println("Multiplication value of A&B = " + c);
			break;
		case '/':
			c = a / b;
			System.out.println("division value of A&B = " + c);
			break;
		case '%':
			c = (a / b)*100;
			System.out.println("Percentage of A in B = " + c+"%");
			break;
		
		default: {
			System.out.println("Check once Operator which you Enter");
		}
			sc.close();
			sc = null;
		}
	}

}
