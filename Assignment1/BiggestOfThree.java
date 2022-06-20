//3. Write java program to print Biggest of 3 Numbers using Logical Operators\
import java.util.*;
class BiggestOfThree
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		if (a>b && a>c)
			System.out.println("First number is the largest");
		else if (b>a && b>c)
			System.out.println("Second number is the largest");
		else if (c>a && c>b)
			System.out.println("Third number is the largest");
		else 
			System.out.println("Entered Numbers are not distinct");
	}
}
