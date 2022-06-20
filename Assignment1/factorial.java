//1. Write a Java program that calculates factorial of a number (inputted via keyboard) recursively.
import java.util.*;
class fact
{
	int factfunc(int n)
	{
		if (n==0 || n ==1)
			return 1;	
		else
			return(n*factfunc(n-1));
	}
}

class factorial{
	public static void main(String[] args)
	{
		System.out.print("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n;
		fact obj = new fact();
		n = obj.factfunc(num);
		System.out.println("Factorial of  " +num+ " is "+n);
	}
}
