
import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a number from 1 to 7:");
         int day=scanner.nextInt();
         String dayOfWeek;
         switch(day){   
            case 1:
            dayOfWeek="Sunday";
            break;
         case 2:
         dayOfWeek="Monday";
         break;
         case 3:
         dayOfWeek="Tuseday";
         break;
         case 4:
         dayOfWeek="Wednesday";
         break;
         case 5:
         dayOfWeek="Thursday";
         break;
         case 6:
         dayOfWeek="Friday";
         break;
         case 7:
         dayOfWeek="Saturday";
         break;
         default:
         dayOfWeek="Invalid day";
         }
         System.out.println("The day of the week is "+dayOfWeek);
         }
         }





