import java.io.*; 
class ReadNumber{ 
    public static void main(String args[]){  
        Float number1 = new Float(); 
        Float number2 = new Float(); 
        DataInputStream in = new DataInputStream(System.in);
        String tempString; 

        System.out.print("Enter a number: "); 
        System.out.flush(); 
        tempString = in.readLine(); 
        number1 = Float.valueOf(tempString);

        System.out.print("Enter another number: ");  
        System.out.flush(); 
        tempString = in.readLine(); 
        number2 = Float.valueOf(tempString); 

        System.out.println("Number 1: "+number1);
        System.out.println("Number 2: "+number2); 
  
    }
}