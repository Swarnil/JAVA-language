import java.lang.*;

interface area{
    final static float pi = 3.14F;
    float compute(float x, float y);
}

class rectangle implements area{
    public float compute(float x, float y){
        return(pi*x*y);
    }
}

class circle implements area{
    public float compute(float x, float y){
        return(pi*x*x);
    }
}

class interfaceDemo{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        circle c = new circle();
        area a;
        a = r;
        System.out.println("area of rectanngle: "+a.compute(10, 20));
        a = c;
        System.out.println("area of circle: "+a.compute(30, 0));
    }
}