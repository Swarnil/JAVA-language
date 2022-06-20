// 6. Write a Java program that creates a Class, namely Student.
// i.Ensure that Age instance variable of the Class is never accessed directly, and its value is never less than 4 and greater than 40 for any Object of the Class (use methods to validate and assign the value).
// ii.Ensure that the constructor always assigns a unique value to Enrollment_No instance variable for every Object of the Class (use a static class variable for counting objects, say Object_Counter).
// iii.Ensure that when an Object is removed, the Object_Counter is automatically decremented (use finalize()), and whenever required the variable can only be accessed using a method even without an Object reference (make the counter private and use a static method to access it).
import java.util.Scanner;
class Student {
    int age,Enrollment_No;
    private static int Obj_Count = 0;
    Student(){
        Obj_Count += 1;
        Enrollment_No = Obj_Count;
        System.out.println("No. of object: "+Enrollment_No);
    }
    void ageval(int a){
        if(a>=4 && a<=40){
            System.out.println("Value assigned!");
            age = a;
        }
        else{
            System.out.println("please enter between 4 and 40");
        }
    }
    protected void finalize() {
        Obj_Count -= 1;
    }
    public static void display(){
        System.out.println("after removing, no. of objects: ");
        System.out.println(Obj_Count);
    }
}

public class stddata extends Student {
    public static void main(String[] args) {
        int n;
        Student ob = new Student();
        Student ob2 = new Student();
        Student ob3 = new Student();
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ob.ageval(n);
        ob3.finalize();
        display();
        sc.close();
    }
}
