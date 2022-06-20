// 01. Write a program to create a class Student2 along with two method getData(),printData() to get the value through argument and display the data in printData. Create the two objects s1 ,s2 to declare and access the values from class STtest.
class Student2 {
    String name, city;
    int age;
    void getData(String x, String y , int n){
        name = x;
        city = y;
        age = n;
    }

    void printData(){
        System.out.println("Student name : "+name);
        System.out.println("Student city : "+city);
        System.out.println("Student age : "+age);
    }
}

class STtest{
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s2.getData("Swarnil", "Siliguri", 22);
        s2.printData();
        s1.getData("Drishti", "Jalpaiguri", 23);
        s1.printData();
    }
}

