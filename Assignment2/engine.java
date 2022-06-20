//5. Write a java program in which you will declare an abstract class Vehicle inherits this class from two classes car and truck using the method engine in both display “car has good engine” and “truck has bad engine”.

abstract class vechile
    {
    abstract void engine();
    }
class car extends vechile
{
    public void engine()
    {
    System.out.println("car has good engine");
    }
}
class truck extends vechile
{
public void engine()
{
System.out.println("truck has bad engine");
}
}
public class engine
{
public static void main(String arr[])
{
vechile v=new car();
v.engine();
vechile n=new truck();
n.engine();
}
}