import java.lang.Runnable;
class A implements Runnable{
    public void run(){
        System.out.println("Entering thread A");
        for(int i=0; i<10; i++){
            System.out.println("inside thread A with i = "+i);
        }
    }
}
class B implements Runnable{
    public void run(){
        System.out.println("Entering thread B");
        for(int j=0; j<10; j++){
            System.out.println("inside thread B with j = "+j);
        }
    }
}

class multiwithinterface {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
