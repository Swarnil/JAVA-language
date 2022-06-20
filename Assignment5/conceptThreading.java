// Write a program to implement the concept of threading by extending Thread Class
import java.lang.Thread;
class A extends Thread
{
public void run()
{
System.out.println("thread A is sterted:"); for(int i=1;i<=5;i++)
{
System.out.println("\t from thread A:i="+i);
}
System.out.println("exit from thread A:");
}
}
class B extends Thread
{
public void run()
{
System.out.println("thread B is sterted:"); for(int j=1;j<=5;j++)
{
System.out.println("\t from thread B:j="+j);
}
System.out.println("exit from thread B:");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C is sterted:"); for(int k=1;k<=5;k++)
{
System.out.println("\t from thread C:k="+k);
}
System.out.println("exit from thread C:");
}
}
class conceptThreading
{
public static void main(String arg[])
{
new A().start();
new B().start();
new C().start();
}
}