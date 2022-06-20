// 02. WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2 passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.
class cons {
    int stdId;
    String stdName;
    cons(int id, String name){
        stdId = id;
        stdName = name;
    }
    void display(){
        System.out.println("Student id is "+stdId+" and name is "+stdName);
    }
}

public class pConstructor {
    public static void main(String[] args) {
        cons obj1 = new cons(1401, "Swarnil");
        cons obj2 = new cons(1503, "Drishti");
        obj1.display();
        obj2.display();
    }
}
