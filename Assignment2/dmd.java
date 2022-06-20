class A{
    void display(){
        System.out.println("inside A");
    }
}
class B extends A{
    void display(){
        System.out.println("inside B");
    }
}
class C extends B{
    void display(){
        System.out.println("inside C");
    }
}

public class dmd {
    public static void main(String[] args) {
        A r;
        A a = new A();
        B b = new B();
        C c = new C();
        r = b;
        r.display();
        r = a;
        r.display();
        r = c;
        r.display();
    }
}
