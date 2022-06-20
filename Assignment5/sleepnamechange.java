// 01. Write a java program in which thread sleep for 5 sec and change the name of thread.

class A extends Thread{
    public void run(){
        System.out.println("Thread A in sleep.....zzzz");
        try{
            sleep(5000);
            System.out.println("Thread A starts.....");
        }
        catch(Exception e){}
        for(int i=0; i<10; i++){
            System.out.println("i = "+i);
        }
    }
}

class sleepnamechange {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Thread A name : "+obj.getName());
        obj.setName("B");
        System.out.println("Thread A new name : "+obj.getName());
        obj.start();
    }
}
