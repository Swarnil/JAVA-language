class A{
    A(){
        System.out.println("inside normal constructor");
    }
    A(int a){
        System.out.println("Square of is: "+(a*a));
    }
    A(int a, int b){
        System.out.println("Addition of is: "+(a+b));
    }
    void B(){
        System.out.println("inside normal method");
    }
    void B(int n){
        System.out.println("Cube is: "+(n*n*n));
    }
    void B(double a, double b){
        System.out.println("sum is: "+(a+b));
    }
}
public class overload {
    public static void main(String[] args) {
        A ob = new A();
        A ob2 = new A(10);
        A ob3 = new A(10,20);
        ob.B();
        ob.B(20);
        ob.B(20.5, 50.3);
    }
}
