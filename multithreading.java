// multi threading example

class threadA extends Thread {
    public void run(){
        System.out.println("Entering Thread A");
        for(int i=0; i<10;i++){
            System.out.println("inside thread A with i = "+i);
        }
    }
}
class threadB extends Thread{
    public void run(){
        System.out.println("Entering Thread B");
        for(int j=1; j<10; j++){
            System.out.println("inside thread B with j = "+j);
        }
    }
}

class multithreading {
    public static void main(String[] args) {
        threadA obj1 = new threadA();
        threadB obj2 = new threadB();
        obj1.start();
        obj2.start();
    }
}
