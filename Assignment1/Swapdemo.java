//2. Write a program to swap two values using object reference. Your program should have a swap method
class A
{
	int a,b;
	public A(int x, int y)
	{
		a = x;
		b = y;
	}
	void swap(A ob)
	{
		int temp;
		temp = ob.a;
		ob.a = ob.b;
		ob.b = temp;
	}
	void printdata()
	{
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);

	}
}
class Swapdemo
{
	public static void main(String args[])
	{
		A ob1 = new A(12,76);
		ob1.swap(ob1);
		ob1.printdata();
	}
}