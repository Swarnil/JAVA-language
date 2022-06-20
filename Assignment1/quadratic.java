//09. Write a java program to print quadratic roots using command line arguments
import java.lang.Math;
class forroot{
    float x,r1,r2;
    void roots(float a, float b, float c){
        x = (float)Math.sqrt(Math.pow(b,2)-4*a*c);
        r1 = (-b+x)/2*a;
        r2 = (-b-x)/2*a;
        System.out.println("The quadratic roots are: "+r1+" and "+r2);
    }
}
class quadratic {
    public static void main(String[] args) {
        float a,b,c;
        forroot obj = new forroot();
        a = Float.parseFloat(args[0]);
        b = Float.parseFloat(args[1]);
        c = Float.parseFloat(args[2]);
        obj.roots(a,b,c);
    }

}