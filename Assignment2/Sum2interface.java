// 04. Write a java program in which you will declare two interface sum and Add inherits these interface through class A1 and display their content.
interface sum{
    void sum_method(int x , int y);
}

interface add {
    void add_method(int x, int y);
}

public class Sum2interface implements add, sum {

    public void sum_method(int x, int y){
        int result = x + y;
        System.out.println(result);
    }

    public void add_method(int x , int y){
        int result = x * y;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Sum2interface obj1 = new Sum2interface();
        obj1.sum_method(10, 20);
        obj1.add_method(10, 20);
    }
}
