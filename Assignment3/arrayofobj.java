class arrayofobj1{
    String n;
    int r;
    arrayofobj1(String x, int y){
        n = x;
        r = y;
    }

    void display(){
        System.out.println("Name: "+n+" and roll: "+r);
    }
}

public class arrayofobj {
    public static void main(String[] args) {
        arrayofobj1 arr[] = new arrayofobj1[2];
        arr[0] = new arrayofobj1("Swarnil", 15);
        arr[1] = new arrayofobj1("lol", 69);   
        arr[0].display();
        arr[1].display();
    }
}
