/*10. Write a Java program that prints the season name corresponding to its month number using If-else and 
switch- case statements.*/
import java.util.Scanner;
public class Seasons
{
    public static void main(String[] args) 
    {
        String season;
        System.out.println("Enter the month(1 to 12)");
        Scanner sc = new Scanner(System.in);
        int entry= sc.nextInt();
        switch(entry)
        {
            case 12:
            case 1:
            case 2:
            season="Winter";
            break;
            case 3:
            case 4:
            case 5:
            season="Spring";
            break;
            case 6:
            case 7:
            case 8:
            season="Summer";
            break;
            case 9:
            case 10:
            case 11:
            season="Autumn";
            break;
            default:
            season="Invalid month";

        }
        System.out.println("The entered month is in the " + season +" Season.");
        
    }

}