// 03. Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for class B and display the text “call me from B”.
abstract class A{
    abstract void call();
}
class B extends A{                  // abstract cannot be inherited by public and cant be instrantiated
    public void call(){             // not declaring public or abstract to inherit abstract
        System.out.println("call me from B");
    }
}

public class abstractAB{
    public static void main(String[] args) {
        B obj = new B();
        obj.call();
    }
}