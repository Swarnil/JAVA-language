class FirstClass {  
    static int idNo; 
    public static void print() {  
        idNo = 555;
        System.out.println ( " First Class citizen " + idNo );   
    } 
} 
class SecondClass {  
    static int idNo; 
    public static void print() { 
        idNo = 111;
        System.out.println (" Second Class citizen " + idNo);  
    } 
} 
public class PeopleApp { 
    public static void main(String args[]) {  
        System.out.print("People from Java World");
        FirstClass.print(); 
        SecondClass.print(); 
    } 
}